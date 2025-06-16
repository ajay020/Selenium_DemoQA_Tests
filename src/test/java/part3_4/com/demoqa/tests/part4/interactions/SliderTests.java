package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTests extends BaseTest {

    @Test
    public void testSliderResult () {
        int X = 180;
        int Y = 0;
       var sliderPage =  homePage.goToWidgets().clickSliderMenu();
       sliderPage.moveSlider(X, Y);
       String actualValue = sliderPage.getSliderValue();
       String expectedValue = "93";

        Assert.assertEquals(actualValue, expectedValue, "\n Actual & Expected Value Do Not Match \n");
    }

}
