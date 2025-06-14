package com.demoqa.pages.alerts_frame_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowPage extends HomePage {
    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By frameMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By browserWidnowMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");


    public ModalDialogsPage clickModalDialogMenuItem() {
        scrollToElementJS(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlertsMenuItem() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public FramePage clickFrameMenuItem() {
        scrollToElementJS(frameMenuItem);
        click(frameMenuItem);
        return new FramePage();
    }

    public BrowserWindowPage clickBrowserWindowMenuItem() {
        scrollToElementJS(browserWidnowMenuItem);
        click(browserWidnowMenuItem);
        return new BrowserWindowPage();
    }
}
