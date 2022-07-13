package com.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainScreen {

    //Search
    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")
    public SelenideElement searchButton;

    //Search button click
    public void clickSearchButton() {
        this.searchButton.click();
    }
    //Is Search button displayed
    public boolean isSearchButton() {
        return searchButton.isDisplayed();
    }


}
