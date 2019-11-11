package com.w2a.listeners;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
//import com.w2a.utilities.TestUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

public class CustomListener extends TestBase implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

//        System.out.println("ewsfcqews : "+iTestResult.getTestName().toUpperCase());
//        test = repo.startTest(iTestResult.getTestName().toUpperCase());
 //       System.out.println(iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {

//        test.log(LogStatus.PASS, iTestResult.getName().toUpperCase()+"PASS");
//        repo.endTest(test);
//        repo.flush();

    }

    public void onTestFailure(ITestResult iTestResult) {

//        System.setProperty("org.uncommons.reportng.escape-output","false");
//
//        try {
//            TestUtil.captureScreenshot();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        test.log(LogStatus.FAIL, iTestResult.getName().toUpperCase()+"Failed with exception:"+iTestResult.getThrowable());
////
////        test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotname));
//
//        Reporter.log("Capturing the image");
//        Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotname+"> Screenshot </a>");
//        Reporter.log("<br>");
//        Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotname+"><img src="+TestUtil.screenshotname+" height=400 width=400></img></a>");
//
////           repo.endTest(test);
////           repo.flush();


    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {


    }

    public void onFinish(ITestContext iTestContext) {

    }
}
