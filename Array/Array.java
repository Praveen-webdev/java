package Array;

import java.util.*;
public class Array {
    public static void main(String[] args) {
        // * Declaring array
        int numbers[];
        int[] numbers2, numbers3; // declaring multiple array with same type
        // * Assigning array
        numbers = new int[5];// size or length must be needed
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // * Declaring and assigning on the same line
        int array[] = { 1, 2, 3, 4, 5 }; // size will be automatically allocated
        // int[][] num;
        // num=new int[4][];
        // num[0]=new int[4];
        // num[1]=new int[3];
        // num[2]=new int[2];
        // num[3]=new int[1];
        // System.out.println(Arrays.deepToString(num)); //* Non-rectangular array
        // ! Common mistakes with array
        // System.out.println(array); will give the memory address of that array
        // int[] array2=array; // It does not copy array instead of sharing the same
        // memory address for both
        // System.out.println(array2[4]); output:5
        // array[4]=4;
        // System.out.println(array2[4]);output:4
        // array=array+2;
        // * Enhanced for loop or for-each loop
        // ! like javascript map function
        // lets sum array
        int sum = 0;
        for (int i : array) { // temporary variable which holds the value of given type//!cannot get the index
                              // of array
            sum += i; // i will gives the value of the array starting from forward direction//! cannot
                      // be reversed
        }
        ;
        System.out.println(sum);
        // * Array copy method
        // ? Arrays in java are immutable-once created ,there will be an assigned size
        // ? and you cannot resize it afterwards
        int original[] = { 1, 2, 3, 4, 5, };
        System.out.println(original);
        int duplicate[] = new int[original.length];
        System.arraycopy(original, 0, duplicate, 0, original.length);
        for (int i : duplicate) {
            System.out.println(i);
        }
        int expand[] = new int[7];
        original = expand; // !Dereferencing || giving expand address to orignal variable
        System.out.println(expand);
        System.out.println(original);
        int[][] arr = { { 13, 21, 38 }, { 45, 53, 62 }, { 76, 83, 90 } };

        // print2dArray(arr);
        find(arr, 89);
        //? Array to ArrayList
        int [] ar={3,45,6,2,3};
        toList(ar);
        
        
    }

    private static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void find(int[][] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == find) {
                    System.out.println("Found at [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    //* Array to ArrayList
    private static void toList(int[] arr){
        List<Integer> ls=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(ls);
        ls.remove(0);
        
        System.out.println(ls.size());
    }
}
