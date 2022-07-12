package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.interactions.touch.TouchActions;

public class MainScreenElementsTest extends BaseTest {


    @Test
    public void testIsMainScreenOpened (){
        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //Подождем пока приложение запустится
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*убрать в фон
        driver.runAppInBackground(Duration.ofSeconds(10));
        //зпустить из фона
        //driver.currentActivity();
        driver.launchApp();*/
        //TouchActions touchActions = new TouchActions(driver);
        // touchActions.singleTap(driver.findElement(By.id("00000000-0000-0022-3b9a-ca0600000004")));


        //String a = driver.findElement(By.xpath(".//android.view.View[@content-desc='bottom bar icon'][4]")).getAttribute("content-desc");
        String a = driver.findElement(By.id("bottom bar icon")).getAttribute("content-desc");
        driver.findElementsByAccessibilityId("bottom bar icon");
    //also tried getText().;
        System.out.println(a);

        //driver.findElementByAndroidUIAutomator("new UISelector().packageName(\"com.miui.calculator\").text(\"3\")").click();




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
