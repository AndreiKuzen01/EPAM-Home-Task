package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.fildsOfCalculator.*;

public class CalculatorPage {

    private WebDriver driver;

    private By commitedUsageBy = By.xpath("//*[@id='select_option_100']");

    @FindBy(xpath = "//*[@id='mainForm']/div[2]/div/md-card/md-card-content/div/div[1]/form/div[13]/button")
    private WebElement addToEstimateButton;

    public CalculatorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CalculatorPage fillInFields() {
        new InstancesNumber(driver).fillInNumberOfInstances("4");
        new OperatingSystem(driver).selectOperatingSystem("Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS");
        new InstanceType(driver).selectInstanceType("e2-standard-8 (vCPUs: 8, RAM: 32GB)");
        new DatacenterLocation(driver).selectDataCenterLocation();
        new CommitedUsage(driver).selectCommitedUsage();
        return this;
    }

    public EstimatedCostPage addToEstimate(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(commitedUsageBy));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", addToEstimateButton );
        return new EstimatedCostPage(driver);
    }


}
