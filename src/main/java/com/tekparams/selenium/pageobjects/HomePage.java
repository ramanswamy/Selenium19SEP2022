package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebElement welcomeMessage;
    public WebElement logOut;
    public WebElement login;

    public WebElement welcomeMessage(WebDriver driver){
        welcomeMessage=driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
        return welcomeMessage;
    }
    public WebElement logOut(WebDriver driver){
        logOut=driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
        return logOut;
    }
    public WebElement login(WebDriver driver){
        login=driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        return login;
    }
}
