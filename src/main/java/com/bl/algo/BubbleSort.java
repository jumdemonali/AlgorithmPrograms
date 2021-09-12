package com.bl.algo;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the size of the List");
        int size = scanner.nextInt();
        System.out.println("Enter values into the List ");
        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }
        Integer[] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);
        bubbleSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(+intArray[i] + " ");
        }
    }

    private static void bubbleSort(Integer[] intArray) {
        int length = intArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

    }


}
