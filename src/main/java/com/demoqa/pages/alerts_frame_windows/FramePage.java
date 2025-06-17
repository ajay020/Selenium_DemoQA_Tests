package com.demoqa.pages.alerts_frame_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class FramePage extends Alerts_Frame_WindowPage {
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBox = "frame1";
    private By frameHeader = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By iframeSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");


    public String getHeaderFrameText() {
        return find(frameHeader).getText();
    }

    private void switchToBigBox() {
        switchToFrameString(iFrameBox);
    }

    private void switchToSmallBox() {
        switchToFrameElement(find(iframeSmallBox));
    }

    public String getTextInBigFrame () {
        switchToBigBox();

        // Wait for element inside iframe to be present
       explicitWaitUntilVisible (5, textInFrame);


        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text : " + bigFrameText);

        // switch back from iframe
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();

        // Wait for element inside iframe to be present
        explicitWaitUntilVisible (5, textInFrame);


        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text : " + smallFrameText);

        switchToDefaultContent();
        return smallFrameText;
    }
}
