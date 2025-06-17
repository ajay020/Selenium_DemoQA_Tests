package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilVisible;

public class ModalDialogsPage extends Alerts_Frame_WindowPage{
    private By smallDialogButton = By.id("showSmallModal");
    private By smallDialogText = By.xpath("//div[contains(text(), 'small modal')]");
    private By smallDialogCloseButton = By.id("closeSmallModal");

    public void clickSmallDialogButon() {
        click(smallDialogButton);
    }

    public String getSmallDialogText () {
        explicitWaitUntilVisible(5, smallDialogText);
        return find(smallDialogText).getText();
    }

    public void clickCloseButton() {
        click(smallDialogCloseButton);
    }
}
