package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import com.po.SearchSmallBottomSheet;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class ClickSearchButtonOnTheMainScreen extends BaseTest {
    @Test
    @DisplayName("Is small Search bottom sheet opened " +
                "when clicked search button on the main screen")
    public void testIsSmallSearchBottomSheetOpenedFromMainScreen  (){
       //CLICK Search button on the main screen
        driver.findElement(By.xpath(".//android.view.View[@resource-id='bottom_bar_search']")).click();

        //MainScreen mainScreen = new MainScreen(driver);
       // mainScreen.clickSearchButton();

       //ASSERT that Search title is displayed
       boolean searchTitleIsDisplayed = driver.findElement(By.xpath(".//android.view.View[@resource-id='search_categories_header']")).isDisplayed();
       assertTrue("Error: no search title on the main small search bottom sheet", searchTitleIsDisplayed);
       //CLOSE Search bottom sheet
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.Button")).click();
    }
}
