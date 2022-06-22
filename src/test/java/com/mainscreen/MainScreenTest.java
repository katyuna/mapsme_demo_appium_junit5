package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainScreenTest extends BaseTest {
    @Test
    //@DisplayName("Main Screen")
    public void testMainPage() {

        /*  //Задаем параметры
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        //Для реального девайса
        //capabilities.setCapability("deviceName", "Xiaomi Mi 9 SE"); //f0c565e9
        //capabilities.setCapability("udid", "f0c565e9");
        //.apk, который нужно будет запускать, .apk должен быть debug сборкой, чтобы вы и appium могли делать inspect приложения
        //capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        //capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
        //Для эмулятора
        capabilities.setCapability("deviceName", "001_Pixel_2_API_28"); //f0c565e9
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");


      // Устанавливаем Android Driver:
        AndroidDriver driver = null;


        //Запускаем Appium драйвер
        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        TouchActions touchActions = new TouchActions(driver);*/

        //touchActions.singleTap(driver.findElement(By.id("00000000-0000-0012-3b9a-ca0600000004")));



        touchActions.singleTap(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[4]/android.widget.Button")));


        /*
        /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[4]/android.widget.Button
         */




    }
}
