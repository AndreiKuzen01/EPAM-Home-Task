package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='postform-text']")
    private WebElement newPasteField;

    @FindBy(xpath = "//label[contains(text(),'Paste Name / Title:')]/following-sibling::div/input")
    private WebElement pasteNameTitle;

    @FindBy(xpath = "//button[contains(text(),'Create New Paste')]")
    private WebElement cerateNewPasteButton;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HomePage setTextPasteField(String text){
        newPasteField.sendKeys(text);
        return this;
    }

    public HomePage setOptionalPasteSyntax(String option, String settings){
        String listXpath = String.format("//label[contains(text(),'%s')]/following-sibling::div", option);
        String optionXpath = String.format("//li[text()='%s']",settings);

        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(listXpath)));

        driver.findElement(By.xpath(listXpath)).click();

        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionXpath)));

        driver.findElement(By.xpath(optionXpath)).click();
        return this;
    }

    public HomePage setNewPasteName(String pasteName){
//        new WebDriverWait(driver, 5)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Paste Name / Title:')]/following-sibling::div")));
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.visibilityOf(pasteNameTitle));
        pasteNameTitle.click();
        pasteNameTitle.sendKeys(pasteName);
        return this;
    }

    public NewPastePage ckickCreateNewPasteButton(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Create New Paste')]")));
        cerateNewPasteButton.click();
        return new NewPastePage(driver);
    }


}
