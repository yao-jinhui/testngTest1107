package com;

public class Calculator {
    public static int result =0;

    public static int add(int x,int y) throws InterruptedException {
        int result = x+y;
        Thread.sleep(1000);
        return result;
    }
    public static int count(int x) throws InterruptedException {
        int i =result;
        Thread.sleep(1000);
        result =i+x;
        return result;
    }
    public synchronized static int synCount(int x) throws InterruptedException {
        int i =result;
        Thread.sleep(1000);
        result =i+x;
        return result;
    }
    public static int subtract(int x ,int y) throws InterruptedException {
        int result = x-y;
        Thread.sleep(1000);
        return result;
    }
    public static int multiply(int x ,int y) throws InterruptedException {
        result = x*y;
        Thread.sleep(1000);

        return result;
    }
    public static int divide(int x ,int y) throws InterruptedException {
        result = x/y;
        Thread.sleep(1000);
        return result;
    }
    public static void clear(){
        result=0;
    }
}
