package po;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
    private AndroidElement routeTitle;

    //Is route title displayed
    public boolean isRouteTitle() {
        return routeTitle.isDisplayed();
    }


}
