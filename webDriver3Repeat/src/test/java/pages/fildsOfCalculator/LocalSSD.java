package pages.fildsOfCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalSSD {

    private WebDriver driver;

    @FindBy(xpath = "//label[contains(text(), 'Local SSD')]/parent::md-input-container")
    private WebElement localSSDContainer;

    public LocalSSD (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectLocalSSDContainer(String value){
        String localSSdOption = String.format("//div[contains(text(),'%s')]/parent::md-option",value);
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'Local SSD')]/parent::md-input-container")));
        localSSDContainer.click();
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(localSSdOption)));
        driver.findElement(By.xpath(localSSdOption)).click();

    }


}
