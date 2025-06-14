package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {
    @Test
    public void testFrameBigBox() {
        var framesPage = homePage.goToAlertFrameWindowCard().clickFrameMenuItem();
        String actualBigBoxText =  framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";

        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,  "\n Actual & Expected Text did not match\n");

        String actualFrameHeaderText = framesPage.getHeaderFrameText();
        String expectedFrameHeaderText = "Frames";

        Assert.assertEquals(actualFrameHeaderText, expectedFrameHeaderText, "\n Actual & Expected Header text did not match \n");
    }

    @Test
    public void testFrameSmallBox() {
        var framesPage = homePage.goToAlertFrameWindowCard().clickFrameMenuItem();
        String actualSmallBoxText =  framesPage.getTextInSmallFrame();
        String expectedBigSmallText = "This is a sample page";

        Assert.assertEquals(actualSmallBoxText, expectedBigSmallText,  "\n Actual & Expected Text did not match\n");

        String actualFrameHeaderText = framesPage.getHeaderFrameText();
        String expectedFrameHeaderText = "Frames";

        Assert.assertEquals(
                actualFrameHeaderText,
                expectedFrameHeaderText,
                "\n Actual & Expected Header text did not match \n"
        );
    }
}
