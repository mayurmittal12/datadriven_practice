package com.w2a.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationChild extends AnnotationInheritance {
    @BeforeMethod
    public void display1(){
        System.out.println("child class ka before method");
    }

    @Test
    public void test(){
        System.out.println(" I am the test method");
    }
    @Test
    public void test1(){
        System.out.println("I am the second test method");
    }

    @AfterMethod
    public void show1(){
        System.out.println("child class ka after method");
    }
}
