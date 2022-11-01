package com.cydeo.pages;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.MockData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.cydeo.utilities.Driver.getDriver;
import static com.cydeo.utilities.MockData.*;

public class PickAvatarPage extends BasePage {

    @FindBy(css = "[data-type='file']")
    List <WebElement> avatarsList;

    @FindBy(xpath = "//button[.='Choose']")
    WebElement chooseButton;

    public PickAvatarPage() {
        super();
    }
    public void selectRandomAvatar() {
        var num = randomNum(avatarsList.size());
        String pathText = String.format("//*[@data-type='file'][%d]", num);
        getDriver().findElement(By.xpath(pathText)).click();
    }

    public boolean isChooseButtonEnabled() {
        return chooseButton.isEnabled();
    }

}
