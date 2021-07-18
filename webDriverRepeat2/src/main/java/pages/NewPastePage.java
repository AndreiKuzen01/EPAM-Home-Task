package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPastePage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='info-top']/h1")
    private WebElement title;

    @FindBy(xpath = "//div[@class='source']")
    private WebElement pastedText;

    @FindBy(xpath = "//div[@class='left']/a")
    private WebElement syntaxButton;


    public NewPastePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getTitle(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='info-top']/h1")));
        return title.getText();
    }

    public String getPastedText(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='source']")));
        return pastedText.getText();
    }
    public String getSyntaxButtonText(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='left']/a")));
        return syntaxButton.getText();
    }
}