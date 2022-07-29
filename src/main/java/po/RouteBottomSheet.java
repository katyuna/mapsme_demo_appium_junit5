package po;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RouteBottomSheet {
    private AndroidDriver driver;

    public RouteBottomSheet() {
    }

    public RouteBottomSheet(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Search categories sheet header
    @AndroidFindBy(xpath = ".//android.widget.TextView[@text='Route']")
    private WebElement routeTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    private WebElement closeRouteSheetButton;

    //Is route title displayed
    public boolean isRouteTitle() {
        return routeTitle.isDisplayed();
    }

    //Close route sheet
    public void clickCloseButton() {
        this.closeRouteSheetButton.click();
    }


}
