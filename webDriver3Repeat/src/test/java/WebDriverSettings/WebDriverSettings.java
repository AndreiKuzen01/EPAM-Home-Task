package WebDriverSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverSettings {
    public WebDriver driver;


    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }

        @AfterMethod
    public void tearDown(){
        driver.close();
        }

}
