package lv9.conf8.AllAreOneOfUsEvenExceptions;

/*
Все свои, даже исключения       11/04/2020
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

    }

    static class MyException extends IOException {

    }

    static class MyException2 extends IOException{

    }

    static class MyException3 extends RuntimeException{

    }

    static class MyException4 extends RuntimeException{

    }
}
