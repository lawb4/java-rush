package lv9.conf8.ICchechedExceptoins;

/*
Перехват checked-исключений     11/04/2020
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException | NoSuchFieldException e) {
            /* RemoteException -> IOException
            *  NoSuchFieldException ---> Exception
            */
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
