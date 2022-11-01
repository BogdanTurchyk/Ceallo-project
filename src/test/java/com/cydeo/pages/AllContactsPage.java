package com.cydeo.pages;

import com.cydeo.enums.contacts.ContactTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.cydeo.enums.contacts.ContactTab.ALL_CONTACTS;
import static com.cydeo.enums.contacts.ContactTab.NOT_GROUPED;

public class AllContactsPage extends BasePage {

    public AllContactsPage() {
        super();
    }

    @FindBy(id = "new-contact-button")
    WebElement addNewContact;

    @FindBy(css = "[class='app-content-list-item-line-one']")
    List<WebElement> contactsList;

    @FindBy(id = "everyone")
    WebElement allContactsTab;

    @FindBy(id = "notgrouped")
    WebElement notGroupedTab;

    public ContactPage openNewContactForm() {
       addNewContact.click();
       return new ContactPage();
    }

    public boolean isContactPresent(String contactName) {
        new AllContactsPage().openContactsTabBy(ContactTab.ALL_CONTACTS);
        return contactsList.stream().anyMatch(contact ->
                contact.getText().trim().contains(contactName));
    }

    // total number
    public int numberOfContacts() {
        return contactsList.size();
    }

    public void openContactsTabBy(ContactTab tabName) {
        if(tabName.equals(ALL_CONTACTS)) {
            allContactsTab.click();
        }else if(tabName.equals(NOT_GROUPED)){
            notGroupedTab.click();
        }
    }

    public boolean deleteContact(String contactName) {
        return contactsList.stream().anyMatch(contact ->
                contact.getText().trim().contains(contactName));
    }

}
