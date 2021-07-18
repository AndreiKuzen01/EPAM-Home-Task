package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReceivedEmailPage {
    private WebDriver driver;
    private String actualResult;
    private String expectedResult;
 //   private By dropDownEmailBy = By.xpath();

    public ReceivedEmailPage(WebDriver driver, String actualResult) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.actualResult = actualResult;
    }

}


