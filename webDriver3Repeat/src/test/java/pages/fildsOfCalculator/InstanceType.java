package pages.fildsOfCalculator;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstanceType {

    private WebDriver driver;

    private By instanceTypeBy;

    @FindBy(xpath = "//label[contains(text(),'Machine type')]/parent::md-input-container")
    WebElement instanceTypeContainer;

    public InstanceType(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public InstanceType selectInstanceType(String value){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Machine type')]/parent::md-input-container")));
        instanceTypeContainer.click();
        instanceTypeBy = By.xpath(String.format("//md-option/div[contains(text(),'%s')]", value));
        WebElement instanceType = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(instanceTypeBy));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", instanceType);
        return this;
    }



}
