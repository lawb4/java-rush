package lv9.conf2.loggingStackTrace;

/*
Логирование стек-трейса     10/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace()  /*[2]*/;

        String className = stack[2].getClassName();
        String methodName = stack[2].getMethodName();

        System.out.println(className + ": " + methodName + ": " + s);

    }
}
