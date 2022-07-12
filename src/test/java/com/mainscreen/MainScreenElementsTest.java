package com.mainscreen;

import com.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

//import org.openqa.selenium.interactions.touch.*;

public class MainScreenElementsTest extends BaseTest {


    @Test
    public void testIsMainScreenOpened (){
        //Создаем Android-драйвер
        AndroidDriver driver = new AndroidDriver (url, capabilities);
        //Подождем пока приложение запустится
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //окно настроек, добавить if presented
       // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")).click();
      //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();

      // String a = driver.findElement(By.id("map_screen_controls")).getAttribute("elementId");
      // System.out.println(a);



       // TouchAction touchAction = new TouchAction(driver);
        //touchAction.longPress(10, 10).moveTo(100, 100).release().perform();

       // touchAction.tap(PointOption.point(100, 100)).perform();

        /*убрать в фон
        driver.runAppInBackground(Duration.ofSeconds(10));
        //зпустить из фона
        //driver.currentActivity();
        driver.launchApp();*/
        //TouchActions touchActions = new TouchActions(driver);
        // touchActions.singleTap(driver.findElement(By.id("00000000-0000-0022-3b9a-ca0600000004")));


        //String a = driver.findElement(By.xpath(".//android.view.View[@content-desc='bottom bar icon'][4]")).getAttribute("content-desc");
        //String a = driver.findElement(By.id("bottom bar icon")).getAttribute("content-desc");
       // driver.findElementsByAccessibilityId("bottom bar icon");
    //also tried getText().;
        //System.out.println(a);

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

        /*   public void androidSwipe(int startX, int startY, int endX, int endY) throws Exception {
            TouchActions actions = new TouchActions(driver);

            actions.down(startX, startY).perform();
            sleep(0.5);
            actions.move(endX, endY).perform();
            actions.up(endX, endY).perform();*/
        }



    }
