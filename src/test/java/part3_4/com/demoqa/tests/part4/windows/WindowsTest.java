package part3_4.com.demoqa.tests.part4.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {
    @Test
    public void testNewWindowURL() {
       var windowsPage = homePage.goToAlertFrameWindowCard().clickBrowserWindowMenuItem();
       windowsPage.clickNewWindowButton();
       windowsPage.switchToNewWindows();

       String actualUrl  = getURL();
       String expectedUrl = "https://demoqa.com/sample";

        Assert.assertEquals(actualUrl, expectedUrl, "\n Actual & Expected URL don't match. \n");

    }
}
