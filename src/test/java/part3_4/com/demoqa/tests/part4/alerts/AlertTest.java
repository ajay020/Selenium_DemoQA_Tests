package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertTest extends BaseTest {

    public void testInformationAlert() {
        String expectedText = "You clicked a button";
        var alertPage =  homePage.goToAlertFrameWindowCard().clickAlertsMenuItem();
        alertPage.clickInformationAlertButton();

        String actualText = getAlertText();
        Assert.assertEquals(expectedText,  actualText, "\n Actual & Expected message do not match. \n");

        // Accept the alert (click OK)
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertPage = homePage.goToAlertFrameWindowCard().clickAlertsMenuItem();
        alertPage.clickConfirmationAlertButton();

        dismissAlert();

        String actualResult = alertPage.getConfirmationAlertText();
        String expectedResult = "You selected Cancel";

        Assert.assertEquals(actualResult, expectedResult, "\n You Did Not Select Cancel. \n");
    }

    public void testPromptAlert() {
        String alertText = "Hello";
        String expectedResult  = "You entered " + alertText;

        var alertPage = homePage.goToAlertFrameWindowCard().clickAlertsMenuItem();
        alertPage.clickPromptAlertButton();

        // Enter text
        setAlertText(alertText);
        // Click ok
        acceptAlert();

        String actualResult = alertPage.getPromptAlertResult();
        Assert.assertEquals(
                actualResult,
                expectedResult,
                "\n Actual & Expected Result Do No Match.\n"
        );
    }
}
