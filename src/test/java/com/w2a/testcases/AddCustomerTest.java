package com.w2a.testcases;

import com.opencsv.CSVReader;
import com.w2a.base.TestBase;
import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AddCustomerTest extends TestBase {
    ArrayList<String> ls;
    int count;
    int i,j=1;

    @Test

    public void addCustomer() throws IOException, InterruptedException, IndexOutOfBoundsException, NullPointerException {
        AddCustomerTest();
        for(int k=0;k <ls.size();k=k+3) {
//            driver.findElement(By.cssSelector(OR.getProperty("addcustbtn"))).click();
//            driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(ls.get(k));
//            driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(ls.get(k+1));
//            driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(ls.get(k+2));
//            driver.findElement(By.cssSelector(OR.getProperty("addbtn"))).click();

            ///using click method and type method of test base class for above statements////

            click("addcustbtn");
            type("firstname",ls.get(k));
            type("lastname",ls.get(k+1));
            type("postcode",ls.get(k+2));
            click("addbtn");

            Thread.sleep(1000);
            Alert alert = driver.switchTo().alert();
            alert.accept();

        }
        OpenAccountTest op=new OpenAccountTest();
        op.openAccount();

    }

    public void AddCustomerTest() throws IOException, IndexOutOfBoundsException, InterruptedException {

//        File file = new File("/Users/admin/IdeaProjects/DataDriven/src/test/resources/excel/AddCustomerTest.txt");
//        //Scanner sc = new Scanner(file);
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        //data = new String[3];
//        ls = new ArrayList<String>();
//        String s;
//        while ((s = br.readLine()) != null) {
//            //data = new String[1][3];
//            String[] token = s.split(",");
////            for (int i = 0; i< 3; i++) {
////
////                    data[i] = sc.next();
////                }
////            }
//            for(String str: token) {
//                ls.add(str);
//            }
//
//        }
        /// using buffer reader for csv file!!!!!
        File file = new File("/Users/admin/IdeaProjects/DataDriven/src/test/resources/excel/testcustomer.csv");
//        BufferedReader csv = new BufferedReader(new FileReader(file));
        ls = new ArrayList<String>();
      //  list=new ArrayList<Integer>();
//        String s;
//        //int count=0;
//        while ((s = csv.readLine()) != null) {
//            count++;
//            String[] token = s.split(",");
//            for (String str : token) {
//                ls.add(str);
//            }
//
//        }
//        System.out.println("The value of count : "+count);

        ////using csv reader for reading the data

        try
        {
            count=0;
            FileReader fileReader=new FileReader(file);
            CSVReader csvReader=new CSVReader(fileReader);
            String[] nextrecord;

            while((nextrecord=csvReader.readNext())!=null){
                count++;
                for(String cell:nextrecord)
                {

                        ls.add(cell);
                }

            }
            //System.out.println(count);
            System.out.println(ls);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

