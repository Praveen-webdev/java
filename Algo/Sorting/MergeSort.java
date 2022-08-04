package Algo.Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int L, int R) {
        if (L < R) {
            int mid = (L + R) / 2;
            mergeSort(arr, L, mid);
            mergeSort(arr, mid + 1, R);
            merge(arr, L, mid, R);
        }

    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int l = mid - L + 1;
        int r = R - mid;
        int[] leftArr = new int[l]; // * forming array of left and right with length
        int[] rightArr = new int[r];
        for (int i = 0; i < l; i++) { // * copying array elements into left and right array
            leftArr[i] = arr[L + i];
        }
        for (int i = 0; i < r; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = L; // * Starting to merge
        while (i < l && j < r) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < l) { // * filling remaining elements into the end
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < l) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
