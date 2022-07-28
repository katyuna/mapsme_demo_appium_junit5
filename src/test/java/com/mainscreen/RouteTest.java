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
    MainScreen mainScreen = new MainScreen(driver);
    RouteBottomSheet routeBottomSheet = new RouteBottomSheet(driver);
    @Test
    @DisplayName("seed")
    @Description ("eee")
    public void testRoute() {
        testWaitRouteButton();
        testRouteOpen();
    }


    @Step
    @DisplayName("Wait route button")
    @Description("Wait until rout button displays")
    public void testWaitRouteButton() {
        mainScreen.isRouteButton();
    }

    @Step
    @DisplayName("Open route bottom sheet")
    @Description("Click route button and open route bottom sheet")
    public void testRouteOpen() {
        mainScreen.clickRouteButton();
        boolean routeSheetIsDisplayed = routeBottomSheet.isRouteTitle();
        assertTrue("Error: route bottom sheet doesn't displays", routeSheetIsDisplayed);

    }
}*/
