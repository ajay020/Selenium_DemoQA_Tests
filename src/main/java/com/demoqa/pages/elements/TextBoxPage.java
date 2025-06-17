package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton  = By.id("submit");
    private By addressText = By.xpath("//p[@id='currentAddress']");


    public String getAddress() {
        explicitWaitUntilVisible(5, addressText);
        return find(addressText).getText();
    }

    public void clickSubmitButton () {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress (String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setFullName (String name) {
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name, Keys.TAB));
    }

    public void setEmail (String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
