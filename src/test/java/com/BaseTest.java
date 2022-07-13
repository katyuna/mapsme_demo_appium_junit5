package com;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    //Задаем url Appim-сервера
    protected URL url;

    {
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    protected DesiredCapabilities capabilities = new DesiredCapabilities();
    @Before
    public void before() {
        //Задаем параметры
        capabilities.setCapability("platformName", "Android");
        /*Для реального девайса
        capabilities.setCapability("deviceName", "Xiaomi Mi 9 SE"); //f0c565e9
        capabilities.setCapability("udid", "f0c565e9");
        //.apk, который нужно будет запускать, .apk должен быть debug сборкой, чтобы вы и appium могли делать inspect приложения
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
        capabilities.setCapability("noReset", true);*/
        /*Для эмулятора*/
        capabilities.setCapability("deviceName", "Pixel 2 API 31");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noReset", true);



/*
        //Запускаем Appium драйвер
        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
