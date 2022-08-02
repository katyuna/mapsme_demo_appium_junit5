package mainscreen;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import po.MainScreen;

public class ZoomTest extends BaseTest{
    MainScreen mainScreen = new MainScreen(driver);
    @Test
    @Order(1)
    @DisplayName("Zoom In")
    @Description("Zoom in until maximum")
    public void testZoomIn {

    }
}
