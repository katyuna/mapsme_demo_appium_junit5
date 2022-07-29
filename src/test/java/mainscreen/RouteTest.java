package mainscreen;

import BaseTest;
import po.MainScreen;
import po.RouteBottomSheet;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouteTest extends BaseTest {
    MainScreen mainScreen = new MainScreen(driver);
    @Test
    @DisplayName("Wait route button")
    @Description("Wait until rout button displays")
    public void testWaitRouteButton() {
        waitR();
        /*MainScreen mainScreen = new MainScreen(driver);
        mainScreen.isRouteButton();
        boolean routeButtonIsDisplayed = mainScreen.isRouteButton();
        assertTrue("Error: route button doesn't displays", routeButtonIsDisplayed);*/
    }

    @Test
    @DisplayName("Open route bottom sheet")
    @Description("Click route button and open route bottom sheet")
    public void testRouteOpen() {
        MainScreen mainScreen = new MainScreen(driver);
        RouteBottomSheet routeBottomSheet = new RouteBottomSheet(driver);
        mainScreen.clickRouteButton();
        boolean routeSheetIsDisplayed = routeBottomSheet.isRouteTitle();
        assertTrue(routeSheetIsDisplayed, "Error: route bottom sheet doesn't displays");
    }

    @Step
    public void waitR() {
        mainScreen.isRouteButton();
        boolean routeButtonIsDisplayed = mainScreen.isRouteButton();
        assertTrue(routeButtonIsDisplayed, "Error: route button doesn't displays");
    }
}