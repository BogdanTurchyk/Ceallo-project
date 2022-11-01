package com.cydeo.pages;

import com.cydeo.enums.contacts.NavigationBar;
import com.cydeo.pages.BasePage;
import org.openqa.selenium.By;

import static com.cydeo.utilities.Driver.getDriver;

public class NavigationBarPage extends BasePage {

    public NavigationBarPage() {
        super();
    }

    public void navigateTo(NavigationBar navigationBar) {
        var pathText = String.format("[id='appmenu']>[data-id='%s']",
                navigationBar.name().toLowerCase());
        getDriver().findElement(By.cssSelector(pathText)).click();
    }
}

