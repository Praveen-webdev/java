package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrProb {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    // System.out.println(Arrays.deepToString(matrixRotation(mat)));
    System.out.println(spiralMatrix(mat));
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
