package com.mainscreen;

import com.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.po.MainScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class OpenApp extends BaseTest {

    @Test
    @DisplayName("Is main screen opened")
    public void testIsMainScreenOpened (){
        //START THE APP
        //Create Android-driver
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //Wait until the app starts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ASSERT that Search button is displayed
        boolean searchButtonIsDisplayed = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]")).isDisplayed();
        assertTrue("Error: no search button on the main screen", searchButtonIsDisplayed);
    }
}
