package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(5000);

        homePage.clickUserIkon();
        Thread.sleep(3000);
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        loginPage.sendUserName("raker79113@crodity.com");
        Thread.sleep(1000);
        loginPage.sendPassword("Testcase123!");
        Thread.sleep(3000);
        loginPage.clickContinue();
        Thread.sleep(4000);
    }
}
