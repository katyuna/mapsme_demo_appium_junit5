package com.po;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MainScreen {


    private AndroidDriver driver;
   public MainScreen() {
    }
    public MainScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Search



    //@AndroidFindBy(xpath = ".//android.view.View[@resource-id='bottom_bar_search']" )
    //private AndroidElement searchButton;
    //AndroidElement searchButton;
    @FindBy(how = How.XPATH, using = ".//android.view.View[@resource-id='bottom_bar_search']")
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
