package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import com.po.SearchSmallBottomSheet;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class ClickSearchButtonOnTheMainScreen extends BaseTest {
    @Test
    @DisplayName("Is small Search bottom sheet opened " +
                "when clicked search button on the main screen")
    public void testIsSmallSearchBottomSheetOpenedFromMainScreen  (){
        MainScreen mainScreen = page(MainScreen.class);
        SearchSmallBottomSheet searchSmallBottomSheet = page(SearchSmallBottomSheet.class);
        //START THE APP
        //Create Android-driver
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //Wait until the app starts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Click Search button on the main screen
        mainScreen.searchButton.click();

        //ASSERT that Search title is displayed
        boolean searchTitleIsDisplayed = searchSmallBottomSheet.isSearchTitle();
        assertTrue("Error: no search title on the main small search bottom sheet", searchTitleIsDisplayed);
    }
}
