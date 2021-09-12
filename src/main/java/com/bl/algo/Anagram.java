package com.bl.algo;

import java.util.Scanner;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = scanner.next().toLowerCase();
        System.out.println("Enter anagram Of that String:");
        String str2 = scanner.next().toLowerCase();
        toAnagram(str1, str2);
    }

    private static void toAnagram(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram = false;
        isAnagram = Arrays.equals(string1, string2);
        if (isAnagram) {
            System.out.println("Strings are Anagram Strings");
        } else
            System.out.println("Strings are not Anagram Strings");
    }
}