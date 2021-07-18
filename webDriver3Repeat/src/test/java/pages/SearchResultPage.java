package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='gs-title']/descendant::b[contains(text(), 'Google Cloud Platform Pricing Calculator')]" )
    private WebElement searchElement;

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage selectResultWithCalculator(){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gs-title']/descendant::b[contains(text(), 'Google Cloud Platform Pricing Calculator')]")));
        searchElement.click();
        return new CalculatorPage(driver);
    }



}
