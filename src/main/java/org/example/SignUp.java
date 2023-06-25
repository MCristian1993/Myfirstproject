package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class SignUp {

    private WebDriver driver;

    public SignUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signUpPage(){
        driver.get("https://courses.ultimateqa.com/users/sign_up");
    }
    @FindBy (xpath = "/html/body/main/div/div/aside/a")
    WebElement createnewaccount;

    @FindBy (id ="user[first_name]")
    WebElement firstname;

    @FindBy (id = "user[last_name]")
    WebElement lastname;

    @FindBy (id = "user[email]")
    WebElement email;

    @FindBy (id = "user[password]")
    WebElement password;

    @FindBy (id = "user[terms]")
    WebElement terms;

    @FindBy (xpath = "/html/body/main/div/div/article/form/div[6]/button")
    WebElement signupbutton;

    @FindBy (xpath = "/html/body/main/div/div/article/form/div[1]/ul/li")
    WebElement signupconfirmation;


    public void Firstname(){
        firstname.click();
        firstname.sendKeys("Manaila");
    }
    public void Lastname(){
        lastname.click();
        lastname.sendKeys("Cristian");
    }
    public void Email(){
        email.click();
        email.sendKeys("manaila.cristian21@yahoo.com");
    }
    public void Password(){
        password.click();
        password.sendKeys("manaila1993");
    }
    public void Terms(){
        terms.click();
    }
    public void Signupbutton(){
        signupbutton.click();
    }
    public void Signupconfirmation(){
        signupconfirmation.isDisplayed();
        System.out.println(" USER HAS SUCCESSFULLY SIGNED UP ");
    }

}
