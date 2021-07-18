package tests;

import org.testng.Assert;
import pages.HomePage;
import pages.NewPastePage;
import webDriverSetting.WebDriverSettings;

public class Test extends WebDriverSettings {

    String url = "https://pastebin.com/";
    String text = "git config --global user.name  \"New Sheriff in Town\"\ngit reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\ngit push origin master --force";
    String name = "how to gain dominance among developers";
    String optionalPasteSettingsSyntaxHighlighting = "Syntax Highlighting";
    String syntaxSetting = "Bash";
    String optionalPasteSettingsPasteExperation = "Paste Expiration";
    String experationSetting = "10 Minutes";
    String pasteNameTitle = "how to gain dominance among developers";

    public HomePage homePage;
    public NewPastePage newPastePage;

    @org.testng.annotations.Test
    public void checkTitle(){
        homePage = new HomePage(driver);

        driver.get(url);
        homePage.setTextPasteField(text);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsSyntaxHighlighting, syntaxSetting);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsPasteExperation, experationSetting );
        homePage.setNewPasteName(pasteNameTitle);
        newPastePage = homePage.ckickCreateNewPasteButton();
        Assert.assertEquals(newPastePage.getTitle(),pasteNameTitle);

    }

    @org.testng.annotations.Test
    public void checkText(){
        homePage = new HomePage(driver);

        driver.get(url);
        homePage.setTextPasteField(text);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsSyntaxHighlighting, syntaxSetting);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsPasteExperation, experationSetting );
        homePage.setNewPasteName(pasteNameTitle);
        newPastePage = homePage.ckickCreateNewPasteButton();
        Assert.assertEquals(text, newPastePage.getPastedText());

    }

    @org.testng.annotations.Test
    public void checkSyntax(){
        homePage = new HomePage(driver);

        driver.get(url);
        homePage.setTextPasteField(text);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsSyntaxHighlighting, syntaxSetting);
        homePage.setOptionalPasteSyntax(optionalPasteSettingsPasteExperation, experationSetting );
        homePage.setNewPasteName(pasteNameTitle);
        newPastePage = homePage.ckickCreateNewPasteButton();
        Assert.assertEquals(syntaxSetting, newPastePage.getSyntaxButtonText());

    }






}
