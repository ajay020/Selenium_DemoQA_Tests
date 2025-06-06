package part3_4.com.demoqa.tests.part4.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenshot extends BaseTest {
    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiseFormPage = homePage.gotToForms().clickPractiseForm();
        practiseFormPage.clickSubmitButton();
    }
}
