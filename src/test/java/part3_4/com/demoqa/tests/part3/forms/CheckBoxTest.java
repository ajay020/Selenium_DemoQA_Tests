package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox() {
        var formPage = homePage.gotToForms().clickPractiseForm();
        formPage.clickReadingCheckBox();
        formPage.clickMusicCheckBox();
        formPage.clickSportsCheckBox();

        formPage.unclickReadingCheckBox();

        boolean isReadingUnselected = formPage.isReadingSelected();
        boolean isMusicSelected  = formPage.isMusicSelected();
        boolean isSportSelected  = formPage.isSportSelected();

        Assert.assertFalse(isReadingUnselected, "\n Reading is selected\n");
        Assert.assertTrue(isMusicSelected, "\n Music checkbox is not selected \n");
        Assert.assertTrue(isSportSelected, "\n Sport is not selected \n");
    }
}
