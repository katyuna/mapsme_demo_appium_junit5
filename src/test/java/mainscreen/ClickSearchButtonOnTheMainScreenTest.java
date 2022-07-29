package mainscreen;

import BaseTest;
import po.MainScreen;
import po.SearchBottomSheet;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClickSearchButtonOnTheMainScreenTest extends BaseTest {

    @Test
    @Order(1)
    @DisplayName("Open search category bottom sheet")
    @Description("Search categories bottom sheet opened " +
            "when clicked search button on the main screen bottom panel")
    public void testIsSearchCategoriesBottomSheetOpenedFromMainScreen() {
        //Create screens objects
        MainScreen mainScreen = new MainScreen(driver);
        SearchBottomSheet searchBottomSheet = new SearchBottomSheet(driver);
        //CLICK Search button on the main screen bottom panel
        mainScreen.isSearchButton();
        mainScreen.clickSearchButton();
        //ASSERT that search categories bottom sheet is displayed
        boolean searchCategoriesHeaderIsDisplayed = searchBottomSheet.isSearchCategoriesConteiner();
        assertTrue(searchCategoriesHeaderIsDisplayed, "Error: search category bottom sheet doesn't displays");
        //CLOSE Search categories bottom sheet
        searchBottomSheet.clickCloseButton();
    }
}
