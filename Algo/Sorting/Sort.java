package Algo.Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 8, 2, 1, 7, 6, 0 };
        // System.out.println(Arrays.toString(insertionSort(arr)));
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        MergeSort.print(arr);
    }

    private static int[] bubbleSort(int[] arr) { // * or sinking sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // no. of times which is less than length
            for (int j = 0; j < n - i - 1; j++) { // i inversely proportional to j
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // selecting from 1st element
            for (int j = i + 1; j < n; j++) { // comparing to all other unsorted elements
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
