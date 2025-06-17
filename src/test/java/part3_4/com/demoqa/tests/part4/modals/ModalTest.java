package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalsDialog() {
        var afwPage = homePage.goToAlertFrameWindowCard();
        var modalDialogsPage = afwPage.clickModalDialogMenuItem();
        modalDialogsPage.clickSmallDialogButon();

        String actualText = modalDialogsPage.getSmallDialogText();

        Assert.assertTrue(actualText.contains("small modal"), "\n The message doesn't contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
    }
}
