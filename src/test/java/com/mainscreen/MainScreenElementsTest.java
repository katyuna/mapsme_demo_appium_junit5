package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;


public class MainScreenElementsTest extends BaseTest {


    @Test
    public void testIsMainScreenOpened (){
        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        // driver.setSetting(“driver”, “compose”);
        TouchActions touchActions = new TouchActions(driver);
        touchActions.singleTap(driver.findElement(By.id("00000000-0000-0022-3b9a-ca0600000004")));

        //  driver.findElementsByAccessibilityId("SomeAccessibilityID");
        //driver.findElementsByClassName("SomeClassName");





    }
}
