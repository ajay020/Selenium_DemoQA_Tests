package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowPage extends Alerts_Frame_WindowPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton () {
        click(newWindowButton);
    }

    public void switchToNewWindows() {
        // 1. Get the current Main window handle
        String currentHandle  = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle);

        // 2. Get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of open Windows " + allHandles.size());

        for (String handle: allHandles) {
            if(currentHandle.equals(handle)) {
                System.out.println("1st window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd window ID: " + handle);
            }
        }
    }
}