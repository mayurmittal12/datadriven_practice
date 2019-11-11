package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static void main(String... a) throws IOException
    {
        Properties config=new Properties();
        Properties OR=new Properties();
        FileInputStream fis= new FileInputStream("/Users/admin/IdeaProjects/DataDriven/src/test/resources/prperties/Config.properties");
        config.load(fis);

        fis= new FileInputStream("/Users/admin/IdeaProjects/DataDriven/src/test/resources/prperties/OR.properties");
        OR.load(fis);

        System.out.println(config.getProperty("browser"));
        System.out.println(OR.getProperty("bmlBtn"));

    }
}
