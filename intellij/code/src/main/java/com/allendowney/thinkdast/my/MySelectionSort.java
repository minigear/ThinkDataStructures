package com.allendowney.thinkdast.my;

import org.junit.Assert;

public class MySelectionSort {

    public static void main(String[] args) {
        final int[] arr = {3, 4, 5, 2, 1};

        final int[] sorted = selectionSort(arr);
        final int[] correctedValues = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(sorted, correctedValues);
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);
            swapValues(arr, i, minIndex);
        }
        return arr;
    }

    private static int findMinIndex(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int j = startIndex; j < arr.length; j++) {
            if (arr[minIndex] > arr[j]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static void swapValues(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
