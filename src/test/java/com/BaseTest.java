package com;

import com.po.MainScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected URL url;
    protected DesiredCapabilities capabilities;
    protected AndroidDriver driver;
    @Before
        public void before () throws MalformedURLException {
        //URL
        url = new URL("http://127.0.0.1:4723/wd/hub");
        //CAPABILITIES
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noReset", true);
        /*Для реального девайса
        capabilities.setCapability("deviceName", "Xiaomi Mi 9 SE"); //f0c565e9
        capabilities.setCapability("udid", "f0c565e9");
        //.apk, который нужно будет запускать, .apk должен быть debug сборкой, чтобы вы и appium могли делать inspect приложения
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
        */
        /*Для эмулятора*/
        capabilities.setCapability("deviceName", "Pixel 2 API 31");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
        //DRIVER
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*driver.resetApp();
        if(driver.findElement(By.xpath(".//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")).isDisplayed()){
            driver.findElement(By.xpath(".//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")).click();
         }
        if (driver.findElement(By.xpath(".//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).isDisplayed()){
            driver.findElement(By.xpath(".//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
        }*/
    }
}
