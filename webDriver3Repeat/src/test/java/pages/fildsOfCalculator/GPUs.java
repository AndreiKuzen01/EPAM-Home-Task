package pages.fildsOfCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GPUs {

    private WebDriver driver;


    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement checkBoxAddGPUs;

    @FindBy(xpath = "//label[contains(text(),'Number of GPUs')]/parent::md-input-container")
    private WebElement numberOfGPUsContainer;

    @FindBy(xpath = "//label[contains(text(),'GPU type')]/parent::md-input-container")
    WebElement gpuTypeContainer;

    public GPUs (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckBoxAddGPUs(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//md-checkbox[@aria-label='Add GPUs']")));
        checkBoxAddGPUs.click();
    }

    public void selectNumberOfGPUs (String value){
        String optionNumberOfGPUs = String.format("//div[contains(text(),'%s')]/parent::md-option[@value='%s']", value, value);
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Number of GPUs')]/parent::md-input-container")));
        numberOfGPUsContainer.click();
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(optionNumberOfGPUs)));
        driver.findElement(By.xpath(optionNumberOfGPUs)).click();
    }

    public void selectGPUsType(String value){
        String optionGPUType = String.format("//div[contains(text(), '%s')]/parent::md-option", value);
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'GPU type')]/parent::md-input-container")));
        gpuTypeContainer.click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(optionGPUType)));
        driver.findElement(By.xpath(optionGPUType)).click();
    }
}
