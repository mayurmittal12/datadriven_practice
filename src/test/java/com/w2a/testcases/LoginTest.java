package com.w2a.testcases;

import com.w2a.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


        @Test
        public void loginAsBankManager() throws InterruptedException
        {

            //System.setProperty("org.uncommons.reportng.escape-output","false");
            log.debug("Inside Login Test!!!");
            //driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
         ///using click method instead of the above full statement////
            click("bmlBtn");
            Thread.sleep(3000);

            Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addcustbtn"))),"Login not successful");

            log.debug("Login successfully executed!!!");
//        Reporter.log("Login done !! ");
//        Reporter.log("<a target=\"_blank\" href=\"Users\\admin\\Downloads\\testingimg.jpeg\"> Screenshot </a>");
//        Reporter.log("<br>");
//        Reporter.log("<a target=\"_blank\" href=\"Users\\admin\\Downloads\\testingimg.jpeg\"><img src=\"Users\\admin\\Downloads\\testingimg.jpg\" height=200 width=200></img></a>");
     }
}
