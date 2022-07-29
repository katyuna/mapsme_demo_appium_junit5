package mainscreen;

import org.junit.jupiter.api.Order;
import po.MainScreen;
import po.RouteBottomSheet;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouteTest extends BaseTest {
    MainScreen mainScreen = new MainScreen(driver);
    RouteBottomSheet routeBottomSheet = new RouteBottomSheet(driver);
    @Test
    @Order(1)
    @DisplayName("Open route bottom sheet wi")
    @Description("Wait until rout button displays")
    public void testRouteOpenSteps() {
        waitRouteButton();
        openRouteSheet();
        closeRouteSheet();
    }

    @Test
    @Order(2)
    @DisplayName("Open route bottom sheet")
    @Description("Click route button and open route bottom sheet")
    public void testRouteOpen() {
        mainScreen.clickRouteButton();
        boolean routeSheetIsDisplayed = routeBottomSheet.isRouteTitle();
        assertTrue(routeSheetIsDisplayed, "Error: route bottom sheet doesn't displays");
        routeBottomSheet.clickCloseButton();
    }

    @Step
    public void waitRouteButton() {
        mainScreen.isRouteButton();
        boolean routeButtonIsDisplayed = mainScreen.isRouteButton();
        assertTrue(routeButtonIsDisplayed, "Error: route button doesn't displays");
    }
    @Step
    public void openRouteSheet() {
        mainScreen.clickRouteButton();
        boolean routeSheetIsDisplayed = routeBottomSheet.isRouteTitle();
        assertTrue(routeSheetIsDisplayed, "Error: route bottom sheet doesn't displays");
    }
    @Step
    public void closeRouteSheet() {
        routeBottomSheet.clickCloseButton();
        boolean routeButtonIsDisplayed = mainScreen.isRouteButton();
        assertTrue(routeButtonIsDisplayed, "Error: route button doesn't displays");
    }
}
