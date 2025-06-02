package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinkTest extends BaseTest {
    @Test
    public void testLinks() {
        var linksPage = homePage.gotToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse =  linksPage.getResponse();

        Assert.assertTrue(
                actualResponse.contains("400") &&
                        actualResponse.contains("Bad Request"),
                "\n Actual response (" + actualResponse  + ") \n Does not contain 400 and Bad Request \n"
        );

    }
}
