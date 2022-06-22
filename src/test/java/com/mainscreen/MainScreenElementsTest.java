package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

public class MainScreenElementsTest extends BaseTest {

    @Test
    public void testIsMainScreenOpened (){
        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);

        TouchActions touchActions = new TouchActions(driver);

        touchActions.singleTap(driver.findElement(By.xpath(""));


    }
}
