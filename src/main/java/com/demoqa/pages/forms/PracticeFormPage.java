package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckBox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckBox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckBox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckBox () {
        if(!find(sportsHobbyCheckBox).isSelected() ) {
            scrollToElementJS(sportsHobbyCheckBox);
            clickJS(sportsHobbyCheckBox);
        }
    }

    public void clickReadingCheckBox () {
        if(!find(readingHobbyCheckBox).isSelected() ) {
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public void clickMusicCheckBox () {
        if(!find(musicHobbyCheckBox).isSelected() ) {
            scrollToElementJS(musicHobbyCheckBox);
            clickJS(musicHobbyCheckBox);
        }
    }

    public void unclickReadingCheckBox () {
        if(find(readingHobbyCheckBox).isSelected() ) {
            scrollToElementJS(readingHobbyCheckBox);
            clickJS(readingHobbyCheckBox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckBox).isSelected();
    }

    public boolean isMusicSelected() {
        return find(musicHobbyCheckBox).isSelected();
    }

    public boolean isSportSelected() {
        return find(sportsHobbyCheckBox).isSelected();
    }

    public void clickSubmitButton() {
//        JavaScriptUtility.scrollToElementJS(submitButton);
        click(submitButton);
    }
}
