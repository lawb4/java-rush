package lv9.conf11.ConsonantsAndVowels;

/*
Гласные и согласные     16/04/2020      //Реши через массив и список!!!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        /*char[] check = s.toCharArray();
        for (char c : check) {
            if (isVowel(c) && c != ' ') {
                System.out.print(c + " ");
            }
        }

        System.out.println();

        for (char c : check) {
            if (!isVowel(c) && c != ' ') {
                System.out.print(c + " ");
            }
        }*/


        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) && s.charAt(i) != ' ') {
                System.out.print(s.charAt(i) + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i)) && s.charAt(i) != ' ') {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); //приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
