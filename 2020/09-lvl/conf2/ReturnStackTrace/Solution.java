package lv9.conf2.ReturnStackTrace;

/*
Возвращаем StackTrace       10.04.2020
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }
}
