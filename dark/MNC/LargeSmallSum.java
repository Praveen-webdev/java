package dark.MNC;

import java.util.ArrayList;
import java.util.List;

public class LargeSmallSum {
    public static void main(String[] args) {
        System.out.println("Run check");
        // int arr[] = { 3, 2, 1, 7, 5, 4 };
        // System.out.println(largeSmallSum(arr, arr.length));
    }

    private static int largeSmallSum(int[] arr, int length) {
        int oddLen = length / 2;
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }
        for (int i = 0; i < evenList.size() - 1; i++) { // * Sorting ascending
            for (int j = 0; j < evenList.size() - i - 1; j++) {
                if (evenList.get(j) > evenList.get(j + 1)) {
                    int temp = evenList.get(j);
                    evenList.set(j, evenList.get(j + 1));
                    evenList.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < oddList.size() - 1; i++) { // * sorting descending
            for (int j = 0; j < oddList.size() - i - 1; j++) {
                if (oddList.get(j) < oddList.get(j + 1)) {
                    int temp = oddList.get(j);
                    oddList.set(j, oddList.get(j + 1));
                    oddList.set(j + 1, temp);
                }
            }
        }
        return evenList.get(1) + oddList.get(1);
    }
    // The function accepts an integers arr of size ’length’ as its arguments you
    // are required to return the sum of second largest element from the even
    // positions and second smallest from the odd position of given ‘arr’

    // Assumption:

    // All array elements are unique
    // Treat the 0th position as even
    // NOTE

    // Return 0 if array is empty
    // Return 0, if array length is 3 or less than 3
}
