package lv9.conf2.WhoInitiatedMe;

/*
Кто меня вызвал?        10.04.2020
*/

public class Solution {
    public static void main(String[] args) {
        method1();

    }

    public static int method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int res = ste[2].getLineNumber();
        //System.out.println(res);
        return res;
    }

    public static int method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int res = ste[2].getLineNumber();
        //System.out.println(res);
        return res;
    }

    public static int method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int res = ste[2].getLineNumber();
        //System.out.println(res);
        return res;
    }

    public static int method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int res = ste[2].getLineNumber();
        //System.out.println(res);
        return res;
    }

    public static int method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int res = ste[2].getLineNumber();
        //System.out.println(res);
        return res;
    }
}
