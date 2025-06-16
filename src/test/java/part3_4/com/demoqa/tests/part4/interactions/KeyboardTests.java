package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTests extends BaseTest {
    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage =  homePage.gotToElements().clickTextBoxMenu();

        textBoxPage.setFullName("Rex");
        textBoxPage.setEmail("Rex@gmail.com");

        textBoxPage.setCurrentAddress("123 avenue");
        textBoxPage.setCurrentAddress("Suite 100");
        textBoxPage.setCurrentAddress("USA, Texas");

        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getAddress();

        Assert.assertTrue(actualAddress.contains("Suite 100"), "\n Actual Address Does not contain Suite 100 \n");

    }
}
