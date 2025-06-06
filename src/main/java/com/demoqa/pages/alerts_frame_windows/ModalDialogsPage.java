package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frame_WindowPage{
    private By smallDialogButton = By.id("showSmallModal");
    private By smallDialogText = By.xpath("//div[contains(text(), 'small modal')]");
    private By smallDialogCloseButton = By.id("closeSmallModal");

    public void clickSmallDialogButon() {
        click(smallDialogButton);
    }

    public String getSmallDialogText () {
        return find(smallDialogText).getText();
    }

    public void clickCloseButton() {
        click(smallDialogCloseButton);
    }
}
