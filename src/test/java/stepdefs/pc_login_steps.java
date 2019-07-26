package stepdefs;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import cucumber.api.java.en.*;
import cucumber.api.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by user on 26/07/2019.
 * http://10.234.229.141:8180/pc/PolicyCenter.do
 * https://cucumber.io/
 */
public class pc_login_steps {
    private  WebDriver driver;
    public pc_login_steps(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Before
    public void OpenBrowser() throws Throwable{
        driver.navigate().to("http://10.234.229.141:8180/pc/PolicyCenter.do");
    }

    @Given("On PC Login Page")
    public void IsOnLoginPage() throws Throwable{
        try {
            WebElement loginElement = driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl"));
            if(loginElement.isDisplayed()){
                System.out.println("::::: YOU'RE IN LOGIN PAGE :::::");
                assert (true);
            }
            else {
                assert (false);
            }

        }
        catch (NoSuchElementException err){
            System.out.println("::::: YOU'RE NOT IN LOGIN PAGE :::::");
            assert (false);
        }

    }

    @When("Enter {string} and Pass {string}")
    public void EnterLoginCredentials(String userName, String userPass) throws  Throwable{
        try {
            driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys(userName);
            driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys(userPass);
            driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
            if(driver.findElement(By.id("Login:LoginScreen:LoginFormMessage")).isDisplayed()) {
                System.out.println("::::: FAILED TO LOGIN!!! :::::");
                assert (false);
            }
            else {
                System.out.println("::::: LOGGED IN SUCCESSFULLY!!! :::::");
                assert (true);
            }
        }
        catch (NoSuchElementException err){
            System.out.println("::::: ELEMENT NOT EXISTING! :::::");
            assert (false);
        }
    }

    @Then("Should be on Desktop View on PC")
    public void IsOnDesktopView() throws Throwable {
        try {
            WebElement desktopElement = driver.findElement(By.id("Desktop:DesktopMenuActions-btnEl"));
            if(desktopElement.isDisplayed()){
                System.out.println("::::: YOU'RE IN DESKTOP VIEW :::::");
                assert (true);
            }
            else {
                assert (false);
            }
        }
        catch (NoSuchElementException err){
            System.out.println("::::: YOU'RE NOT DESKTOP VIEW :::::");
            assert (false);
        }
    }

    @After
    public void ExitChromeDriver() throws Throwable{
        Thread.sleep(5000);
        driver.quit();
    }


}
