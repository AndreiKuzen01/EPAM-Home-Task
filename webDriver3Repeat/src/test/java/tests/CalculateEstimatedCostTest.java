package tests;

import WebDriverSettings.WebDriverSettings;
import org.testng.Assert;
import pages.HomePage;

public class CalculateEstimatedCostTest extends WebDriverSettings {

    String request = "Google Cloud Platform Pricing Calculator";

    @org.testng.annotations.Test

    public void totalRentTest() {
       boolean result = new HomePage(driver)
                .openPage()
                .clickSearchButton()
                .searchForTerms(request)
                .selectResultWithCalculator()
                .fillInFields()
                .addToEstimate()
                .checkEstimatedCost();
        Assert.assertTrue(result, "Total estimated cost from calculator doesn't equal expected estimated cost (493.10)");












    }

}
