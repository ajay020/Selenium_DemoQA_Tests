package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTests extends BaseTest {
    @Test
    public void testSelectingDate() {
        String day = "31";
        String month = "December";
        String monthNumber = "12";
        String year = "2034";

        var datePickerPage = homePage.goToWidgets().clickDatePickerMenu();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate,
                "\n Actual & Expected date didn't match" +
                        "\n Actual Date: " + actualDate +
                        "\n Expected Date: " +  expectedDate );

    }
}
