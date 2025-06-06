package com.demoqa.pages;

import com.demoqa.pages.alerts_frame_windows.Alerts_Frame_WindowPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFrameWindowCard = By.xpath("//div[@id='app']//h5[contains(text(), 'Alerts')]");

    public FormsPage gotToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage gotToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets () {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frame_WindowPage goToAlertFrameWindowCard() {
        scrollToElementJS(alertsFrameWindowCard);
        click(alertsFrameWindowCard);
        return new Alerts_Frame_WindowPage();
    }
}
