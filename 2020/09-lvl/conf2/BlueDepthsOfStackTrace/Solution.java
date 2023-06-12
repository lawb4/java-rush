package lv9.conf2.BlueDepthsOfStackTrace;

/*
Там, в синих глубинах стек-трейса...        10/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int stelength = ste.length;
        //int stelength = Thread.currentThread().getStackTrace().length

        System.out.println(stelength);
        return stelength;
    }
}
