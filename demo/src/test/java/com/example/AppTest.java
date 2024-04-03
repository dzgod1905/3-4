package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void test1() {
        int value = -5;
        int Expected_Output = -1;
        int Actual_Output = new App().count(value);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test2() {
        int value = 17;
        int Expected_Output = 3;
        int Actual_Output = new App().count(value);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test3() {
        int value = -8;
        int Expected_Output = -1;
        int Actual_Output = new App().count(value);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test4() {
        int value = -2;
        int Expected_Output = -1;
        int Actual_Output = new App().count(value);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test5() {
        int value = 24;
        int Expected_Output = 4;
        int Actual_Output = new App().count(value);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
}
