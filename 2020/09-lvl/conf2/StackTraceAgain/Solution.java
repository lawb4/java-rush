package lv9.conf2.StackTraceAgain;

/*
и снова StackTrace      10.04.2020
*/

public class Solution {
    public static void main(String[] args) {
        method1();

    }

    public static String method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return ste[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return ste[2].getMethodName();
    }
}
