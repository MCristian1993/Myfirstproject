package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class Dashboard {
        private WebDriver driver;
        public Dashboard(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, "this");
        }
        public void urlDashboard(String url){
            driver.get(url);
        }
        @FindBy(xpath = "/html/body/header/div[2]/div/nav/ul/li[1]/a")
        WebElement dashboardbutton;

        public void Dashboardbutton(){
            driver.get("https://courses.ultimateqa.com/enrollments");
        }

    }
