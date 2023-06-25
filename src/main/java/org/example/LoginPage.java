package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        private WebDriver driver;

        public LoginPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void urlLoginPage(String url){
        driver.get(url);
    }

    @FindBy (xpath = "/html/body/header/div[2]/div/nav/ul/li/a")
    WebElement signin;

    @FindBy (xpath = "/html/body/main/div/div/article/form/div[1]/input")
    WebElement email;

    @FindBy (xpath = "/html/body/main/div/div/article/form/div[2]/input")
    WebElement password;

    @FindBy (xpath = "/html/body/main/div/div/article/form/div[5]/button")
    WebElement clicksignin;

    @FindBy (xpath = "/html/body/main/div/h2")
    WebElement userlogat;


    public void Signin(){
        signin.click();
    }
    public void Email(){
        email.click();
        email.sendKeys("manaila.cristian21@yahoo.com");
    }
    public void Password(){
        password.click();
        password.sendKeys("manaila1993");
    }
    public void Clicksignin(){
        clicksignin.click();
    }
    public void UserLogat(){
        userlogat.isDisplayed();
        System.out.println(" USER HAS SUCCESSFULLY LOGGED IN ");
    }
}


