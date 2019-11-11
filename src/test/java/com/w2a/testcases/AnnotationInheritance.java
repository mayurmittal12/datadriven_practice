package com.w2a.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AnnotationInheritance {

    @BeforeMethod

    public void display(){
        System.out.println("Parent class ka before method");
    }

    @AfterMethod

    public void show(){

        System.out.println("Parent class ka after method");
    }

    @Test

    public void aab(){

        System.out.println("I am the test method of parent class");
    }
}
