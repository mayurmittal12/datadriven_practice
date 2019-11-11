package com.w2a.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AnnotationTest {

    WebDriver driver;

    @BeforeSuite

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://gradeup.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("running before suite --->> setup method");
    }

    @BeforeMethod

    public void display2(){

        System.out.println("I am the second wala before method");
    }

    @BeforeMethod

    public void display1(){
        System.out.println("Running Before Method --->> display method");

    }

    @BeforeTest

    public void show(){

        System.out.println("running before test --->> show method");
    }



    @Test

    public void showMe(){

        System.out.println("RUNNING TEST CASE 1 --> SHOWME method");
    }

    @Test

    public void showMeToo(){

        System.out.println("running test case 2 --->> shoemetoo method");
    }

    @AfterTest

    public void show1(){

        System.out.println("runnig after test --->> show 1 method");
    }


    @AfterMethod

    public void diaplay4(){

        System.out.println("I am the second wala after method");
    }

    @AfterMethod

    public void display3(){

        System.out.println("running after method --->> display1 method");
    }

    @AfterSuite

    public void end(){

        System.out.println("running after suite -->> end method");
        driver.quit();
    }


}
