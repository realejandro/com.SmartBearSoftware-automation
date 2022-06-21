package com.test.bearSoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    WebElement userNameInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    WebElement userPasswordInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    WebElement loginButton;

    public void sendInfoLogin(String username, String password){
        this.userNameInput.sendKeys(username);
        this.userPasswordInput.sendKeys(password);
        this.loginButton.click();
    }

}
