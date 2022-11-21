package Array;



import java.util.ArrayList;
import java.util.Arrays;

public class ArrProb {
  public static void main(String[] args) {
    int arr[][]={{5,4,3,2,1},{2,3,6,7,1},{7,8,9,6,9},{8,7,6,5,4}};
    spiral(arr);
  }

  private static void findExtraElement(int arr1[], int arr2[]) {
    boolean foundOnArr1 = false;
    for (int i = 0; i < arr1.length; i++) {
      boolean isFound = false;
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          isFound = true;
          break;
        }
      }
      if (!isFound) {
        System.out.println("Extra element " + arr1[i] + " found at " + i + " on Array1");
        foundOnArr1 = true;
        break;
      }
    }
    if (!foundOnArr1) {
      for (int i = 0; i < arr2.length; i++) {
        boolean isFound = false;
        for (int j = 0; j < arr1.length; j++) {
          if (arr1[i] == arr2[j]) {
            isFound = true;
            break;
          }
        }
        if (!isFound) {
          System.out.println("Extra element " + arr2[i] + " found at " + i + " on Array2");
          foundOnArr1 = true;
          break;
        }
      }
    }
  }

  private static int[][] matrixRotation(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = i; j < n - 1 - i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = temp;
      }
    }
    return matrix;
  }

  public static String spiralMatrix(int[][] mat) { // N*N matrix
    ArrayList<Integer> list = new ArrayList<Integer>();
    int len = mat.length;
    int i = 0, j = 0, cut = 0, count = 0;
    // boolean right = false, down = false, left = false, up = false;
    int move = 1;
    outerloop: while (i < len && j < len) {
      count++;
      list.add(mat[i][j]);
      if (count == len * len) { // out of the loop
        break outerloop;
      }
      if (i == j && i < len / 2) { // direction changers
        move = 1;
      } else if (i == j) {
        move = 3;
      }
      if (i + j == len - 1 && i < len / 2) {
        move = 2;
      } else if (i + j == len - 1) {
        move = 4;
        cut++;
      }

      switch (move) { // movement
        case 2:
          i++;
          break;
        case 3:
          j--;
          break;
        case 4:
          if (i > cut) {
            i--;
            break;
          }
        case 1:
          j++;
          break;
        default:
          move = 1;
          break;
      }
    }
    return list.toString();
  }
  private static void spiral(int[][] arr){
    int n=arr.length;
    int m=arr[0].length;
    for(int i=0;i<n/2;i++){
      for(int j=i;j<m-i;j++){
        System.out.print(arr[i][j]);
      }
      for(int j=i+1;j<n-1-i;j++){
        System.out.print(arr[j][m-1-i]);
      }
      for(int j=m-1-i;j>0;j--){
        System.out.print(arr[n-1-i][j]);
      }
      for(int j=n-1-i;j>=i+1;j--){
        System.out.print(arr[j][i]);
      }
    }
  }
  private static boolean isUnique(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return false;
        }
      }
    }
    return true;
  }

  private static void sumPair(int[] arr, int sum) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] + arr[i + 1] == sum) {
        System.out.println(arr[i] + "," + arr[i + 1]);
      }
    }

  }

  private static boolean has271(int[] nums) {
    boolean out = false;
    for (int i = 0; i + 2 < nums.length; i++) {
      if (nums[i + 1] == nums[i] + 5) {
        if (Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) { // difference less than or equal to 2
          out = true;
          break;
        }
      }
    }
    return out;
  }
}
