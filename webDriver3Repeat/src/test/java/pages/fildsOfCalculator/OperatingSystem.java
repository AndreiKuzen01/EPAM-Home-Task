package pages.fildsOfCalculator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperatingSystem {

    private WebDriver driver;

    private By operatingSystemBy;

    @FindBy(xpath = "//*[contains(text(),'Operating System / Software')]/parent::md-input-container")
    private WebElement operatingSystemContainer;

    public OperatingSystem (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public OperatingSystem selectOperatingSystem(String value){
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Operating System / Software')]/parent::md-input-container")));
        operatingSystemContainer.click();
        operatingSystemBy = By.xpath(String.format("//md-option/div[contains(text(),'%s')]",value));
        WebElement operatingSystem = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(operatingSystemBy));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",operatingSystem);

        return this;
    }
}
