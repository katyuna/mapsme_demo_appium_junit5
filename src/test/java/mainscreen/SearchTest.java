package mainscreen;

import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import po.MainScreen;
import po.SearchBottomSheet;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest {
    //Create screens objects
    MainScreen mainScreen = new MainScreen(driver);
    SearchBottomSheet searchBottomSheet = new SearchBottomSheet(driver);

    @Test
    @Order(1)
    @DisplayName("Open search bottom sheet")
    @Description("Оpen and close search bottom sheet")
    public void testIsSearchCategoriesBottomSheetOpenedFromMainScreen() {
        waitSearchButton();
        openSearchSheet();
        setSearchString();
        assertSearchResults();
        searchBottomSheet.clickSearchResult();
        // closeSearchSheet();

      /*  //CLICK Search button on the main screen bottom panel
        mainScreen.isSearchButton();
        mainScreen.clickSearchButton();
        //ASSERT that search categories bottom sheet is displayed
        boolean searchCategoriesHeaderIsDisplayed = searchBottomSheet.isSearchCategoriesConteiner();
        assertTrue(searchCategoriesHeaderIsDisplayed, "Error: search category bottom sheet doesn't displays");
        //CLOSE Search categories bottom sheet
        searchBottomSheet.clickCloseButton();*/
    }

    @Step("Wait search button")
    public void waitSearchButton() {
        mainScreen.isSearchButton();
        boolean searchButtonIsDisplayed = mainScreen.isSearchButton();
        assertTrue(searchButtonIsDisplayed, "Error: route button doesn't displays");
    }

    @Step("Click search button and open search sheet")
    public void openSearchSheet() {
        mainScreen.clickSearchButton();
        boolean searchSheetIsDisplayed = searchBottomSheet.isSearchIcon();
        assertTrue(searchSheetIsDisplayed);
    }

    @Step("Set search string")
    public void setSearchString() {
        searchBottomSheet.clickSearchIcon();
        searchBottomSheet.setSearch("McDonalds");
    }

    @Step("Wait and assert search results")
    public void assertSearchResults() {
        searchBottomSheet.isSearchResult();
        boolean searchResultIsDisplayed = searchBottomSheet.isSearchResult();
        assertTrue(searchResultIsDisplayed);
    }

    @Step("Close search sheet")
    public void closeSearchSheet() {
        searchBottomSheet.clickCloseButton();
        boolean searchButtonIsDisplayed = mainScreen.isSearchButton();
        assertTrue(searchButtonIsDisplayed, "Error: route button doesn't displays");
    }

}
