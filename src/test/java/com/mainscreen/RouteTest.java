/*package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import com.po.RouteBottomSheet;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RouteTest extends BaseTest {
    @Test
    @DisplayName("Wait route button")
    @Description("Wait until rout button displays")
    public void testWaitRouteButton() {
        MainScreen mainScreen = new MainScreen(driver);
        boolean routeButtonIsDisplayed = mainScreen.isRouteButton();
        assertTrue("Error: route button doesn't displays", routeButtonIsDisplayed);
    }

    @Test
    @DisplayName("Open route bottom sheet")
    @Description("Click route button and open route bottom sheet")
    public void testRouteOpen() {
        MainScreen mainScreen = new MainScreen(driver);
        RouteBottomSheet routeBottomSheet = new RouteBottomSheet(driver);
        mainScreen.clickRouteButton();
        boolean routeSheetIsDisplayed = routeBottomSheet.isRouteTitle();
        assertTrue("Error: route bottom sheet doesn't displays", routeSheetIsDisplayed);
    }

}*/
