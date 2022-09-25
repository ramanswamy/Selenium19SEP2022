package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    public WebElement Email;
    public WebElement Password;
    public WebElement Login;

    public WebElement Email(WebDriver driver){
        Email=driver.findElement(By.id("email"));
        return Email;
    }
    public WebElement Password(WebDriver driver){
        Password=driver.findElement(By.name("password"));
        return Password;
    }
    public WebElement Login(WebDriver driver){
        Login=driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
        return Login;
    }


}
