package part3_4.com.demoqa.tests.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DynamicWaitTests extends BaseTest {

    public void testVisibleAfterButtonText() {
       var  dynamicPropertiesPage =  homePage.gotToElements().clickDynamicProperties();
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";

        Assert.assertEquals(actualText, expectedText, "\n Actual & Expected text do not match. \n");
    }

    public void testProgressBar () {
        var progressBarPage = homePage.goToWidgets().clickProgressBarMenu();
        progressBarPage.clickStartButton();

        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";

        Assert.assertEquals(actualValue, expectedValue, "\n Value is not 100%  \n");
    }
}
