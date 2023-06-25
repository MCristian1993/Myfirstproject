import org.example.Dashboard;
import org.example.LoginPage;
import org.example.SignUp;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {


    private static WebDriver driver;

    @BeforeClass

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }

        @Test
        public void Signup(){
            SignUp signup = new SignUp(driver);
            signup.signUpPage();
            signup.Firstname();
            signup.Lastname();
            signup.Email();
            signup.Password();
            signup.Terms();
            signup.Signupbutton();
            signup.Signupconfirmation();
    }


    @Test
    public void Login() {
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.urlLoginPage("https://courses.ultimateqa.com/");
        LoginPage.Signin();
        LoginPage.Email();
        LoginPage.Password();
        LoginPage.Clicksignin();
        LoginPage.UserLogat();
    }

    @Test
    public void Dashboard() {
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.urlLoginPage("https://courses.ultimateqa.com/");
        LoginPage.Signin();
        LoginPage.Email();
        LoginPage.Password();
        LoginPage.Clicksignin();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.urlDashboard("https://courses.ultimateqa.com/collections");
        dashboard.Dashboardbutton();

    }

    @Test
    public void Logout(){
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.urlLoginPage("https://courses.ultimateqa.com/");
        LoginPage.Signin();
        LoginPage.Email();
        LoginPage.Password();
        LoginPage.Clicksignin();
        LogOut logout = new LogOut(driver);
        logout.Dropdown();
        logout.Clicklogout();
        logout.UserLogout();
    }

}

