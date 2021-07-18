package pages.fildsOfCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatacenterLocation {

    private WebDriver driver;

    private By dataCenterLocationBy = By.xpath("//*[@id='select_option_212']/div");


    @FindBy(xpath = "//label[contains(text(),'Datacenter location')]/following-sibling::md-select[@ng-model='listingCtrl.computeServer.location']")
    private WebElement dataCenterLocationContainer;



    public DatacenterLocation (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDataCenterLocation(){
                new WebDriverWait(driver, 5)
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Datacenter location')]/following-sibling::md-select[@ng-model='listingCtrl.computeServer.location']")));
               dataCenterLocationContainer.click();

        WebElement datacenterLocation = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(dataCenterLocationBy));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click;", datacenterLocation );
    }
}



//    String dataCenterLocationOption = String.format("//div[contains(text(),'%s')]/parent::md-option", value);
//    By dataCenterLocationBy = By.xpath(String.format("//div[contains(text(),'%s')]/parent::md-option", value));
//        new WebDriverWait(driver, 5)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'Location')]/parent::md-input-container")));
//                dataCenterLocationContainer.click();
//                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dataCenterLocationContainer);
//                WebElement dataCenterLocation = new WebDriverWait(driver, 10).
//                until(ExpectedConditions.elementToBeClickable(dataCenterLocationBy));
//                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dataCenterLocation);
//                new WebDriverWait(driver, 5)
//                .until(ExpectedConditions.
//                visibilityOfElementLocated(By.xpath(dataCenterLocationOption)));
//                driver.findElement(By.xpath(dataCenterLocationOption)).click();