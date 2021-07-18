package pages.fildsOfCalculator;

import WebDriverSettings.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InstancesNumber{

    private WebDriver driver;

    @FindBy(xpath = "//div/descendant::input[@name='quantity']")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//iframe")
    private WebElement firstFrame;

    @FindBy(id = "myFrame")
    private WebElement myFrame;

    public InstancesNumber(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public InstancesNumber fillInNumberOfInstances(String value){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(firstFrame);
        driver.switchTo().frame(myFrame);
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/descendant::input[@name='quantity']")));
        numberOfInstances.sendKeys(value);
        return this;
    }
}
