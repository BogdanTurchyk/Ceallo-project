package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    public ContactPage() {
        super();
    }

    @FindBy(id = "contact-fullname")
    WebElement contactFullName;

    @FindBy(css = "[inputmode='tel']")
    WebElement phoneField;

    @FindBy(css = "[class^='contact-header-'] [aria-label='Actions']")
    WebElement avatarIcon;

    @FindBy(xpath = "//*[.='Choose from files']")
    WebElement chooseFromFilesButton;

    @FindBy(css = "[class*='header-menu'] button")
    WebElement meatballsMenu;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    WebElement deleteContactButton;

    public void fillUpDefaultFields(String fullName, String phoneNumber) {
        contactFullName.clear();
        contactFullName.sendKeys(fullName);
        phoneField.click();
        phoneField.sendKeys(phoneNumber);
    }

    public PickAvatarPage openPickAvatarPage() {
        avatarIcon.click();
        if (chooseFromFilesButton.isDisplayed())
            chooseFromFilesButton.click();
        return new PickAvatarPage();
    }

    public void deleteContact() {

        meatballsMenu.click();
        deleteContactButton.click();
    }


}
