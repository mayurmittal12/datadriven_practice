package com.w2a.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.tools.internal.xjc.reader.xmlschema.BindYellow;
//import com.w2a.utilities.ExtentManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import com.aventstack.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties config=new Properties();
    public static Properties OR=new Properties();
    public static FileInputStream fis;
    public static Logger log= Logger.getLogger("TestBase");
//    private static ExtentReports extent = BasicExtentReport.createInstance();
//    private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
    public static ExtentReports repo;
    public static ExtentTest test;
    @BeforeSuite
    public void setUp() throws IOException
    {
       if(driver==null)
       {
           FileInputStream fis= new FileInputStream("/Users/admin/IdeaProjects/DataDriven/src/test/resources/prperties/Config.properties");
           config.load(fis);

           log.debug("Config file loaded!!!");

           fis= new FileInputStream("/Users/admin/IdeaProjects/DataDriven/src/test/resources/prperties/OR.properties");
           OR.load(fis);
           log.debug("OR file loaded!!!");

           if(config.getProperty("browser").equals("firefox"))
           {
               //System.setProperty("webdriver.gecko.driver","gecko.exe");
               driver=new FirefoxDriver();
           }
           else if (config.getProperty("browser").equals("chrome"))
           {
               //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/esources/executables/chromedriver.exe");
               driver=new ChromeDriver();
               log.debug("Chrome Launched!!!");
           }
           else if (config.getProperty("browser").equals("ie"))
           {
               //System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/src/test/esources/executables/IEDriverServer.exe");
               driver=new InternetExplorerDriver();
           }
           driver.get(config.getProperty("testsiteurl"));
           log.debug("Navigated to URL!!!");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
           System.out.println("User Directory : "+System.getProperty("user.dir"));
       }

    }

    public void click(String locator)
    {

        driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
        //test.log(LogStatus.INFO,"clicking on "+locator);

    }

    public void click(String locator,int i)
    {

        driver.findElements(By.cssSelector(OR.getProperty(locator))).get(i).click();
        //test.log(LogStatus.INFO,"clicking on "+locator);

    }

    public void type(String locator, String value)
    {

        driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
        //test.log(LogStatus.INFO,"Typing in "+locator+" entered value as "+value);

    }




    public boolean isElementPresent(By by)
    {
        try {

            driver.findElement(by);
            return true;

        }catch (NoSuchElementException e) {

            return false;
        }

    }

    @AfterSuite
    public void tearDown()
    {
        if(driver!=null) {
            driver.quit();
        }
        log.debug("Test Execution completed");
    }
}
