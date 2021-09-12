package com.bl.algo;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter values into list ");
        for (int i = 0; i < size; i++) {
            String input = scanner.next();
            list.add(input);
        }
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);
        insertionSort(stringArray);
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]+" ");
        }

    }
    private static void insertionSort(String[] stringArray) {
        int length = stringArray.length;
        int j;
        String temp;
        for (int i = 0; i < length; i++) {
            j = i;
            temp = stringArray[i];
            while (j > 0 && temp.compareTo(stringArray[j - 1]) < 0) {
                stringArray[j] = stringArray[j - 1];
                j = j - 1;
            }
            stringArray[j] = temp;
        }
    }
}
