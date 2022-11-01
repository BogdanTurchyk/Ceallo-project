package com.cydeo.step_definitions;

import com.cydeo.pages.LogInPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {
        String url = ConfigurationReader.getProperty("env");
        Driver.getDriver().get(url);
        new LogInPage().logIn();
    }

    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}


