package com.w2a.testcases;

import com.w2a.base.TestBase;

public class CustomersList extends TestBase {

    public void customers() throws InterruptedException {
        click("custlist");
        Thread.sleep(10000);

        click("deletebtn",2);
        Thread.sleep(5000);


//        click("deletebtn");
//        Thread.sleep(5000);

//        click("deletebtn_xpath");
//        Thread.sleep(7000);

    }
}
