package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

public class WidgetsPage extends HomePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu( ) {
        JavaScriptUtility.scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}
