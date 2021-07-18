package pages.fildsOfCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommitedUsage {

    private WebDriver driver;

    private By datacenterLocationOsakaBy = By.xpath("//*[@id='select_option_270;]/child::div");

    @FindBy(xpath = "//md-select[@id = 'select_101']")
    private WebElement committedUsageContainer;


    public CommitedUsage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCommitedUsage(){
        new WebDriverWait(driver, 5).
                until(ExpectedConditions.invisibilityOfElementLocated(datacenterLocationOsakaBy));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", committedUsageContainer);
        By committedUsageBy = By.xpath("//md-option[@id = 'select_option_99']");
        WebElement committedUsage = new WebDriverWait(driver, 5).
                until(ExpectedConditions.visibilityOfElementLocated(committedUsageBy));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", committedUsage);
    }
}
