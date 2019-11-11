//package com.w2a.utilities;
//
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.opencsv.CSVReader;
//import com.sun.mail.imap.protocol.Status;
//import com.w2a.base.TestBase;
////import org.apache.commons.io.FileUtils;
////import org.apache.commons.io.IOUtils;
//import org.apache.poi.util.IOUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.annotations.Test;
//
//import java.io.*;
////import java.util.Base64.*;
//import java.util.ArrayList;
//import java.util.Base64;
//import java.util.Date;
//
//public class TestUtil extends TestBase {
//    public static String screenshotname;
//
//    public static void captureScreenshot() throws IOException {
//
////       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////        Date d= new Date();
//       //screenshotname = d.toString().replace(":","_").replace(" ","_")+".jpg";
//         screenshotname = "abc.jpg";
//       String pathOfScreenshot =System.getProperty("user.dir")+"/test-output/html/"+screenshotname;
//       log.info("Path of Screenshot : "+pathOfScreenshot);
//       //FileUtils.copyDirectory(src , new File(pathOfScreenshot));
//
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        InputStream is = null;
//        try {
//            is = new FileInputStream(screenshot);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        byte[] imageBytes = new byte[0];
//        try {
//            imageBytes = IOUtils.toByteArray(is);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String base64Screenshot = Base64.getEncoder().encodeToString(imageBytes);
//
//        try {
//
//            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build();
//            log.info("Failure Case URL : "+driver.getCurrentUrl());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//    }
//
//
//}
