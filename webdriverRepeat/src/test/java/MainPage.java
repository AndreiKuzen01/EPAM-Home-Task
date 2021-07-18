import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        Thread.sleep(3000);
        WebElement textField = driver.findElement(By.xpath("//*[@id='postform-text']"));
        textField.sendKeys("Hello from WebDriver");
        setOptionalPasteSettings("Paste Expiration", "10 Minutes");
        setNameSettings("Paste Name", "helloweb");

        Thread.sleep(3000);
        driver.quit();
    }

    private static void setOptionalPasteSettings(String option, String settings) throws InterruptedException {
        String listXpath = String.format("//label[contains(text(),'%s')]/following-sibling::div", option);
        String optionXpath = String.format("//li[text()='%s']", settings);
        driver.findElement(By.xpath(listXpath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(optionXpath)).click();
    }

    private static void setNameSettings(String option, String name) {
        String listXpath = String.format("//label[contains(text(),'%s')]/following-sibling::div/input", option);
        driver.findElement(By.xpath(listXpath)).sendKeys(name);
    }
}
