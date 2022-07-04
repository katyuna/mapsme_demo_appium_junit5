package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;
//import org.openqa.selenium.interactions.touch.TouchActions;

public class MainScreenElementsTest extends BaseTest {


    @Test
    public void testIsMainScreenOpened (){

        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //убрать в фон
        driver.runAppInBackground(Duration.ofSeconds(10));
        //зпустить из фона
        driver.currentActivity();


        /*
        driver.findElementByAccessibilityId("add new contact").click();

        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"text\")");*/

        // driver.setSetting(“driver”, “compose”);
        //TouchActions touchActions = new TouchActions(driver);
       // touchActions.singleTap(driver.findElement(By.id("00000000-0000-0022-3b9a-ca0600000004")));
        //System.out.println();

        //  driver.findElementsByAccessibilityId("SomeAccessibilityID");
        //driver.findElementsByClassName("SomeClassName");





    }
}
