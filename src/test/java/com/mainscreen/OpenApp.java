package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class OpenApp extends BaseTest {

    @Test
    @DisplayName("Is main screen opened")
    public void testIsMainScreenOpened {
        MainScreen mainScreen = page(MainScreen.class);
        //mainPage.searchButton.click();
        //START THE APP
        //Create Android-driver
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //driver.setSetting("driver", "compose");
        //Wait until the app starts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ASSERT that Search button is displayed
        boolean searchButtonIsDisplayed = mainScreen.isSearchButton();
        assertTrue("Error^ no search button on the main screen", searchButtonIsDisplayed);
    }
}
