package com;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    @Before
    public void before() throws MalformedURLException {
        //Задаем параметры
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

        //Задаем url Appim-сервера
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //Создаем Android-драйвер
       // AndroidDriver driver = null;
        AndroidDriver driver = new AndroidDriver (url, capabilities);

/*
        //Запускаем Appium драйвер
        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }*/

        TouchActions touchActions = new TouchActions(driver);
    }


}
