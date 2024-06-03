package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.LocatorUtils;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        String loginXPath = LocatorUtils.getLocator("loginPage","loginButton");
        driver.findElementByXPath(loginXPath).click();
    }

    public void sendUserName(String userName){
        String userNameId = LocatorUtils.getLocator("loginPage","usernameField");
        driver.findElementById(userNameId).sendKeys(userName);
    }

    public void sendPassword(String password){
        String passwordId = LocatorUtils.getLocator("loginPage","passwordField");
        driver.findElementById(passwordId).sendKeys(password);
    }

    public void clickContinue(){
        String continueButtonXPath = LocatorUtils.getLocator("loginPage","continueButton");
        driver.findElementByXPath(continueButtonXPath).click();
    }

}
