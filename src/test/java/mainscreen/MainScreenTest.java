package mainscreen;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainScreenTest {
    @Before
    public void setup(){
    }
    @Test
    //@DisplayName("Main Screen")
    public void testMainPage() {

        // Устанавливаем Android Driver:
        AndroidDriver driver = null;

        //Задаем параметры
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Xiaomi Mi 9 SE"); //f0c565e9
        capabilities.setCapability("udid", "f0c565e9");
        //Cсылка на APK, который нужно будет запускать
        // .apk должен быть debug сборкой, чтобы вы и appium могли делать inspect приложения
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");


//Запускаем Appium драйвер
        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        //        AndroidDriver driver = new AndroidDriver(remoteUrl, capabilities);
        TouchActions touchActions = new TouchActions(driver);

        touchActions.singleTap(driver.findElement(By.id("00000000-0000-01cf-3b9a-ca2b00000004")));

    }
}
