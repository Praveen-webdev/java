package dark.MNC;

import java.util.Scanner;

public class DefSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // ? divisor
        int m = sc.nextInt(); // ? upto
        sc.close();
        System.out.println("Output : " + defSum(n, m));
    }

    private static int defSum(int n, int m) {
        int s1 = 0, s2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                s1 += i;
            } else {
                s2 += i;
            }
        }
        return Math.abs(s2 - s1);
    }
}
