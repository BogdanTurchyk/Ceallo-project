package com.cydeo.helper;

import com.cydeo.enums.contacts.NavigationBar;
import com.cydeo.enums.contacts.ContactTab;
import com.cydeo.pages.AllContactsPage;
import com.cydeo.pages.NavigationBarPage;

import static com.cydeo.utilities.MockData.phoneNumber;

public class ContactsHelper {

    public static void createNewContact(String fullName) {
        new NavigationBarPage().navigateTo(NavigationBar.CONTACTS);
        var allContactsPage =  new AllContactsPage();
        allContactsPage.openNewContactForm()
                .fillUpDefaultFields(fullName, phoneNumber());
        // allContactsPage.openContactsTabBy(ContactTab.ALL_CONTACTS);
    }
}
