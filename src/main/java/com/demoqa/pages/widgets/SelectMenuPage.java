package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import java.util.List;

import static utilities.DropDownUtility.*;

public class SelectMenuPage extends WidgetsPage {
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti (String text) {
        JavaScriptUtility.scrollToElementJS(standardMultiSelect);
//        Select select  = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti (int index) {
        JavaScriptUtility.scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deSelectStandardMulti (String value) {
        JavaScriptUtility.scrollToElementJS(standardMultiSelect);
        deSelectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMulti () {
        return getAllSelectedOptions(standardMultiSelect);
    }
}
