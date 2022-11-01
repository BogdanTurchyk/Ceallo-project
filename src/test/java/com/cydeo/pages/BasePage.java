package com.cydeo.pages;

import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.Driver.getDriver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

}
