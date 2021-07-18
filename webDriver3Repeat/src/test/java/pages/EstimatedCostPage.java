package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EstimatedCostPage {

    private final String EXPECTED_ESTIMATION_COST = "Total Estimated Cost: USD 493.10 per 1 month";
    private By estimateCurrencyFieldBy = By.xpath("//*[contains(text(), 'Total Estimated Cost')]");

    private WebDriver driver;

    @FindBy(xpath = "//*[contains(text(), 'Total Estimated Cost')]")
    private WebElement totalEstimatedCostElement;

    @FindBy(xpath = "//*[@aria-label='Email Estimate']")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//label[contains(text(),'Datacenter location')]/following-sibling::md-select[@ng-model='listingCtrl.computeServer.location']")
    private WebElement dataCenterLocationContainer;

    public EstimatedCostPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean checkEstimatedCost(){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(estimateCurrencyFieldBy));
        String actualEstimatedCost = totalEstimatedCostElement.getText();
        return actualEstimatedCost.contains(EXPECTED_ESTIMATION_COST);
    }


}
