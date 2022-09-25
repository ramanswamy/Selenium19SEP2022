package com.tekparams.actiondriver;

import com.tekparams.selenium.pageobjects.HomePage;
import com.tekparams.selenium.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import com.tekparams.selenium.base.Base;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionDriver {
    public WebDriver driver;
    public String browserType="chrome";
    public String url="https://acme-test.uipath.com/login";
    public String emailAddress="ramanswamy@rediffmail.com";
    public String password="EKY9GJ";
    public WebElement element;

    public void setupDriverInstance(){
        Base obj1 = new Base();
        driver=obj1.getWebDriverInstance(browserType);
    }

    @Test(priority = 1)
    public void openApplication(){
        setupDriverInstance();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void loginToApplication(){
//        openApplication();
        LoginPage loginPage = new LoginPage();
        loginPage.Email(driver).sendKeys(emailAddress);
        loginPage.Password(driver).sendKeys(password);
        loginPage.Login(driver).click();
        validateWelcomeMessage();
    }
    @Test(priority=3)
    public void logOutApplication(){
        logOutApp();
        //validateLogin();
    }
    @Test(priority = 4)
    public void closeApplication(){
        driver.quit();
    }

    public void validateWelcomeMessage(){
        HomePage homePage = new HomePage();
        element=homePage.welcomeMessage(driver);
        String strActualResult=element.getText();
        String strExpectedResult="Welcome, ramanswamy@rediffmail.com to System 1.";
        Assert.assertEquals(strActualResult,strExpectedResult);
   }
   public void logOutApp(){
        HomePage homePage = new HomePage();
        homePage.logOut(driver);
   }
   public void validateLogin(){
        HomePage homePage = new HomePage();
        element=homePage.login(driver);
        String strActualResult=element.getText();
        String strExpectedResult="Log In";
        Assert.assertEquals(strActualResult,strExpectedResult);
   }
}
