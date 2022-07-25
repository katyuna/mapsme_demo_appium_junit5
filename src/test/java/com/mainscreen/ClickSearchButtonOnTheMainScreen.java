package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import com.po.SearchSmallBottomSheet;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class ClickSearchButtonOnTheMainScreen extends BaseTest {
    @Test
    @DisplayName("Is small Search bottom sheet opened " +
                "when clicked search button on the main screen")
    public void testIsSmallSearchBottomSheetOpenedFromMainScreen  (){
        //START THE APP
        //Create Android-driver
       //AndroidDriver driver = new AndroidDriver (url, capabilities);
        //Wait until the app starts
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //CLICK Search button on the main screen
       driver.findElement(By.xpath(".//android.view.View[@resource-id='bottom_bar_search']")).click();
        //ASSERT that Search title is displayed
       boolean searchTitleIsDisplayed = driver.findElement(By.xpath(".//android.view.View[@resource-id='search_categories_header']")).isDisplayed();
       assertTrue("Error: no search title on the main small search bottom sheet", searchTitleIsDisplayed);
       //CLOSE Search bottom sheet
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.Button")).click();
    }
}
