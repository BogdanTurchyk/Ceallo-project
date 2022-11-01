package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    public LogInPage() {
       super();
    }

    @FindBy(id = "user")
        public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    public void logIn() {
        usernameField.sendKeys(ConfigurationReader.getProperty("username"));
        passwordField.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }


}
