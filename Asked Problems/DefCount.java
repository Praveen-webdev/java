import java.util.Scanner;

public class DefCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter Array elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter num & difference:");
        int num = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println("Output is " + findCount(arr, length, num, diff));
        sc.close();
    }

    private static int findCount(int[] arr, int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= 2) {
                count++;
            }
        }
        return count > 0 ? count : -1;
    }
}
