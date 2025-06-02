package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    void testRadioButton() {
       var formPage  =  homePage.gotToForms().clickPractiseForm();
       formPage.clickFemaleRadioButton();
       boolean isFemaleRadioButtonSelected = formPage.isFemaleSelected();
       Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button Is Not Selected.\n");
    }
}
