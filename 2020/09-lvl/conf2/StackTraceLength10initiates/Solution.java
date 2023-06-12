package lv9.conf2.StackTraceLength10initiates;

/*
Стек-трейс длиной 10 вызовов        10/04/2020
*/

public class Solution {
    public static void main(String[] args) {
       int stackTraceLength = method1().length - method10().length + 1;
       //int stackTraceLength = 12 - 3 + 1 = 10
        //System.out.println(stackTraceLength);
    }

    public static StackTraceElement[] method1() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method2();
    }

    public static StackTraceElement[] method2() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method3();
    }

    public static StackTraceElement[] method3() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method4();
    }

    public static StackTraceElement[] method4() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method5();
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method6();
    }

    public static StackTraceElement[] method6() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method7();
    }

    public static StackTraceElement[] method7() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method8();
    }

    public static StackTraceElement[] method8() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method9();
    }

    public static StackTraceElement[] method9() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return method10();
    }

    public static StackTraceElement[] method10() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //System.out.println(ste[2].getMethodName());
        return Thread.currentThread().getStackTrace();
    }
}
