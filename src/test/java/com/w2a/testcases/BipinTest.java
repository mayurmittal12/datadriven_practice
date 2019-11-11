package com.w2a.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import java.io.IOException;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BipinTest {

        WebDriver driver;

        @BeforeSuite

        public void setup() {

            if(driver==null) {
                System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
                driver= new ChromeDriver();

                //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                //capabilities.setCapability("marionette", true);

//            System.setProperty("webdriver.gecko.driver", "/Users/admin/Downloads/geckodriver");
//            driver = new FirefoxDriver();

                driver.get("https://gradeup.co");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            }

        }

        @AfterSuite

        public void teardown(){
            driver.quit();
        }


        @Test

        public void TC01() throws InterruptedException {
            //driver.get("https://gradeup.co");
            System.out.println("Running first test case --");
            System.out.println(driver.getTitle());
            //System.out.println(driver.findElement(By.cssSelector("h1[class='white mb0 mt0']")).getText());
            Thread.sleep(2000);

        }

        @Test

        public void TC02() throws InterruptedException {
            System.out.println("showing text on facebook button --");
            System.out.println(driver.findElements(By.cssSelector("button[class='auth__facebook relative auth__social__btn disabled ma0 tc pointer tracked-sm outline-0 b bg-blue white pa3 w-100 bn medium']")).get(1).getText());
            Thread.sleep(2000);

            System.out.println("showing text on google button --");
            System.out.println(driver.findElements(By.cssSelector("button[class='auth__google flex items-center relative auth__social__btn disabled ma0 b tc pointer tracked-sm bg-white black ba b--near-white pa3']")).get(1).getText());
            Thread.sleep(2000);

        }

        @Test

        public void TC03(){

            System.out.println("Running test case 3 !!");
            System.out.println(driver.findElement(By.cssSelector("img[alt='gradeup-info']")).getAttribute("src"));

//        System.out.println("Running test case 3 again !!");
//        System.out.println(driver.findElements(By.cssSelector("img[class='absolute db-l dn overflow-hidden lazyloaded']")).get(0).getAttribute("src"));
        }

        @Test

        public void TC04(){

            System.out.println("Running test case 4 !!");
            System.out.println("printing youtube link !!!!!");
            System.out.println(driver.findElement(By.cssSelector("a[title='Youtube Link']")).getAttribute("href"));

            System.out.println("printing facebook link !!!");
            System.out.println(driver.findElement(By.cssSelector("a[title='Facebook Link']")).getAttribute("href"));

            System.out.println("printing Twiter link !!!");
            System.out.println(driver.findElement(By.cssSelector("a[title='Twitter Link']")).getAttribute("href"));

            System.out.println("printing email link !!!");
            System.out.println(driver.findElements(By.cssSelector("a[class='pa2 mh1 h-fc']")).get(3).getAttribute("href"));

        }

        @Test

        public void TC05() throws InterruptedException {

            System.out.println("Running testcase 5 !!");


            WebElement li = driver.findElement(By.cssSelector("input[name='search']"));
            li.sendKeys("Gradeup");
            li.submit();
            Thread.sleep(2000);

        }

        @Test

        public void TC06() throws InterruptedException {

            System.out.println("running testcase 6 !!!");
            String base= driver.getWindowHandle();
            driver.findElements(By.cssSelector("a[class='gray link']")).get(0).sendKeys(Keys.SHIFT,Keys.ENTER);
            Thread.sleep(5000);
            //driver.close();
            driver.switchTo().window(base);
            //Thread.sleep(4000);
            //driver.close();

        }

        @Test

        public void TC07(){

            System.out.println("running test case 7 !!!");
            System.out.println(driver.findElement(By.cssSelector("input[name='deviceType']")).getAttribute("value"));

        }

//    @Test
//
//    public void TC08() throws InterruptedException {
//
//        System.out.println("running test case 8 in continuation with 7 !!!");
//        driver.findElement(By.cssSelector("input[name='deviceType']")).click();
//        Thread.sleep(3000);
//
//    }

        @Test

        public void TC09() throws InterruptedException {
            driver.get("https://gradeup.co");
            System.out.println("running test case 9!!");
            //driver.findElement(By.cssSelector("span[class='flex pointer w-10-l justify-center hover-green pb3 ph2 flex-shrink-0 ph0-l bb b--green bw2 green']")).click();
            Thread.sleep(1000);
            for (int i=0;i<9;i++) {
                driver.findElements(By.cssSelector("span[class='flex pointer w-10-l justify-center hover-green pb3 ph2 flex-shrink-0 ph0-l ']")).get(i).click();
                Thread.sleep(1000);
            }


        }

        @Test

        public void TC10() throws InterruptedException {
            driver.get("https://gradeup.co");

            driver.findElement(By.cssSelector("a[class='auth__login js-show-login link white no-hover-color']")).click();
            driver.findElements(By.cssSelector("input[class='auth__field outline-0 f6 db w-100 pa2 ba b--black-10']")).get(2).sendKeys("mayur.kk001@grdp.co");
            Thread.sleep(1000);
            driver.findElements(By.cssSelector("input[class='auth__field outline-0 f6 db w-100 pa2 ba b--black-10']")).get(3).sendKeys("123456");
            Thread.sleep(1000);
            driver.findElements(By.cssSelector("input[class='btn auth__button js-auth-login bg-dlg-gradient white bn db f4 fw1 outline-0 w-100 tc']")).get(1).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("div[class='header-menu-item main-header__user relative h-100']")).click();
            driver.findElement(By.cssSelector("div[class='header-menu-item main-header__user relative h-100']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("a[class='pointer']")).click();
            Thread.sleep(2000);
        }

        @Test

        public void TC11() throws InterruptedException{
            driver.navigate().to("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html");
//        System.out.println(driver.findElements(By.xpath(".//tr[@class='gradeA']//td[text()='Win 95+ / Mac OS 8.6-9.2']")).get(0).getText());
//        System.out.println(driver.findElements(By.xpath(".//tr[@class='gradeA']//td[text()='1.7']")).get(1).getText());
        /*System.out.println(driver.findElements(By.cssSelector("tr[class='gradeA']")).get(10).getText());
        System.out.println(driver.findElements(By.xpath(".//tr[@class='gradeA']//td")).get(52).getText());
        //System.out.println(driver.findElements(By.xpath(".//tr[@class='gradeA']//td[@class='center']")).get(22).getText());
        System.out.println(driver.findElements(By.xpath(".//tr[@class='gradeA']//td")).get(53).getText());*/

            //
            Thread.sleep(2000);

            WebElement element= driver.findElement(By.xpath(".//div[@id='wb-auto-1_wrapper']//table[@class='wb-tables table wb-init wb-tables-inited dataTable no-footer']//tbody//tr[7]//td[3]"));
            System.out.println(element.getText());
            WebElement element1= driver.findElement(By.xpath(".//div[@id='wb-auto-1_wrapper']//table[@class='wb-tables table wb-init wb-tables-inited dataTable no-footer']//tbody//tr[7]//td[4]"));
            System.out.println(element1.getText());
        }

        @Test

        public void TC12() throws InterruptedException {
            driver.navigate().to("https://www.facebook.com");
            driver.findElements(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).get(0).sendKeys("karan");
            driver.findElements(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).get(1).sendKeys("tacker");
            driver.findElements(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).get(2).sendKeys("9988776655");
            driver.findElements(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).get(5).sendKeys("karan12@tacker");
            Thread.sleep(3000);

            // using chrome selector
//        driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(0).sendKeys("10");
//        driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(1).sendKeys("Apr");
//        driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(2).sendKeys("1991");


            //using select method

            Select day= new Select(driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(0));

            Select month = new Select(driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(1));

            Select year= new Select(driver.findElements(By.cssSelector("select[class='_5dba _8esg']")).get(2));
            day.selectByValue("10");
            month.selectByVisibleText("Sept");
            year.selectByValue("1991");
            Thread.sleep(2000);
            driver.findElements(By.cssSelector("span[class='_5k_2 _5dba']")).get(1).click();
            Thread.sleep(3000);

        }

        @Test

        public void TC14(){
            driver.navigate().to("https://gradeup.co/ssc-railways?feedTab=test");
            for(int i=0;i<5;i++) {
                System.out.println(driver.findElements(By.cssSelector("p[class='flex ma0 mb1']")).get(i).getText() + ", " + driver.findElements(By.cssSelector("a[class='no-underline dark-gray f4']")).get(i).getText());
            }
        }

        @Test

        public void TC15() throws InterruptedException {
            driver.navigate().to("https://gradeup.co/online-test-series/banking-insurance/ibps-2019-plus-pack-zjxk6evwn");
            driver.findElement(By.cssSelector("div[class='flex flex-column ba b--very-light-gray br2 mr3 flex-shrink-0 pt1 free-batch-card pointer']")).click();
            Thread.sleep(3000);
            System.out.println(driver.findElement(By.cssSelector("p[class='ttu fw6 mv0 f4 tc']")).getText());
            driver.findElement(By.cssSelector("svg[class='db svg-s-silver absolute pointer']")).click();
            Thread.sleep(3000);
            WebElement element= driver.findElement(By.xpath(".//div[@class='flex flex-column ba b--very-light-gray br2 mr3 flex-shrink-0 pt1 free-batch-card pointer']//img[@class='flex-grow-1']"));
            System.out.println(element.getAttribute("src"));

        }

        @Test

        public void TC13() throws InterruptedException {
            //driver.navigate().to("https://www.amazon.in");

            String base= driver.getWindowHandle();
            driver.get("https://www.amazon.in");
            //driver.findElements(By.xpath(".//span[@class='nav-text']")).get(68).click();
            Actions actions=new Actions(driver);
            Thread.sleep(10000);
            WebElement element= driver.findElements(By.xpath(".//a[@class='nav-a nav-a-2']")).get(3);
            //System.out.println("Text : "+element.getText());
            actions.moveToElement(element).build().perform();
            Thread.sleep(10000);
            WebElement element1= driver.findElement(By.xpath(".//span[contains(text(),'Kindle E-Readers & eBooks')]"));
            actions.moveToElement(element1).build().perform();
            Thread.sleep(10000);

            WebElement element2= driver.findElement(By.xpath(".//span[contains(text(),'Deals on Kindle eBooks')]"));
            element2.click();
            Thread.sleep(3000);
            Set<String> s1= driver.getWindowHandles();
            Iterator<String> i1= s1.iterator();
            while(i1.hasNext())
            {
                String child=i1.next();
                if(!base.equalsIgnoreCase(child))
                {
                    driver.findElements(By.xpath(".//a[@class='aok-block aok-nowrap aok-hide-text acs_product-image']")).get(0).click();
                    driver.switchTo().window(child);

                    Thread.sleep(12000);
                    driver.close();
                }
            }

            driver.switchTo().window(base);

            Thread.sleep(3000);

        }


}
