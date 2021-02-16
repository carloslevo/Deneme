package com.CRMLY.pages;

import com.CRMLY.utilities.BrowserUtils;
import com.CRMLY.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(className = "login-inp")
    public WebElement usernameInputBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(className = "errortext")
    public WebElement errorMessage;


    public void loginAsHR(){
        BrowserUtils.waitForClickablility(usernameInputBox,5);
        usernameInputBox.sendKeys(ConfigurationReader.get("hr_username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("hr_password"));
        loginButton.click();
    }

    public void loginAsHelpdesk(){
        BrowserUtils.waitForClickablility(usernameInputBox,5);
        usernameInputBox.sendKeys(ConfigurationReader.get("helpdesk_username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("helpdesk_password"));
        loginButton.click();
    }

    public void loginAsMarketing(){
        BrowserUtils.waitForClickablility(usernameInputBox,5);
        usernameInputBox.sendKeys(ConfigurationReader.get("marketing_username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("marketing_password"));
        loginButton.click();
    }

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }


}
