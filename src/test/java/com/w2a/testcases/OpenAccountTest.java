package com.w2a.testcases;

import com.opencsv.CSVReader;
import com.w2a.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class OpenAccountTest extends TestBase {

    ArrayList<String> ls;
    int count,j;

    @Test

    public void openAccount() throws InterruptedException {

        openAccountTest();
        for(int k=0;k<ls.size();k=k+2) {
            click("openaccountbtn");
            type("customerbar", ls.get(k));
            //Thread.sleep(2000);
            type("currencybar", ls.get(k+1));
            click("processbtn");
            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(1000);

        }
        CustomersList cl=new CustomersList();
        cl.customers();

    }


    public void openAccountTest() throws IndexOutOfBoundsException
    {
        File file = new File("/Users/admin/IdeaProjects/DataDriven/src/test/resources/excel/openaccount.csv");
        ls=new ArrayList<String>();

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
