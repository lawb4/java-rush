package lv9.conf11.LetsEnrichTheCodeWithFunctionlaity;

/*
Обогатим код функциональностью!     19/04/2020
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream;

        try {
            String sourceFileName = br.readLine();
            fileInputStream = getInputStream(sourceFileName);
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println(e);

            System.out.println("Файл не существует");

            String sourceFileName = br.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        String destinationFileName = br.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
