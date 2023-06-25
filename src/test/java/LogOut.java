import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
    private WebDriver driver;
    public LogOut(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void collections(){
        driver.get("https://courses.ultimateqa.com/collections");
    }
    @FindBy (xpath = "/html/body/header/div[2]/div/nav/ul/li[2]/button")
    WebElement dropdown;

    @FindBy (xpath = "/html/body/header/div[2]/div/nav/ul/li[2]/ul/li[4]/a")
    WebElement clicklogout;


    public void Dropdown(){
        dropdown.click();
    }

    public void Clicklogout(){
        clicklogout.click();
    }

    public void UserLogout(){
        System.out.println(" USER HAS SUCCESSFULLY LOGGED OUT ");
    }

}
