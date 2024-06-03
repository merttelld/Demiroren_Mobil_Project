package org.example.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.example.utils.LocatorUtils;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickUserIkon(){
        driver.findElementById(LocatorUtils.getLocator("homePage","userIcon")).click();
    }
}
