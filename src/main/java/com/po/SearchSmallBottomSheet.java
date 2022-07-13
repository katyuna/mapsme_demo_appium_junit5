package com.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchSmallBottomSheet {
    @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Search']")
    public SelenideElement searchTitle;


    //Is Search title displayed
    public boolean isSearchTitle() {
        return searchTitle.isDisplayed();
    }
}
