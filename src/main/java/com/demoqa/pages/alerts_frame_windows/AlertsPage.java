package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import static utilities.JavaScriptUtility.clickJS;

public class AlertsPage extends Alerts_Frame_WindowPage{
    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationAlertResult = By.id("confirmResult");
    private By promptAlertButton  = By.id("promtButton");
    private By promptAlertResult = By.id("promptResult");

    public void clickInformationAlertButton () {
        JavaScriptUtility.scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        clickJS(confirmationAlertButton);
    }

    public String getConfirmationAlertText () {
        return find(confirmationAlertResult).getText();
    }

    public void clickPromptAlertButton() {
        clickJS(promptAlertButton);
    }

    public String getPromptAlertResult () {
        return find(promptAlertResult).getText();
    }

}