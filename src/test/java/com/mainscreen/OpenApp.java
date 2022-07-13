package com.mainscreen;

import com.BaseTest;
import com.po.MainScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;

public class OpenApp extends BaseTest {

    @Test
    @DisplayName("Is main screen opened")
    public void testIsMainScreenOpened {
        //MainScreen mainPage = page(MainScreen.class);
        //mainPage.searchButton.click();
        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //driver.setSetting("driver", "compose");
        //Подождем пока приложение запустится
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
