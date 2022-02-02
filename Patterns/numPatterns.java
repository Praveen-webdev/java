
public class numPatterns {
    public static void main(String[] args) {
        // hollowDiamond(9);
        crossNumber(6);

    }

    private static void pattern43(int n) {
        n = n / 2 + 1;
        for (int i = 1, k = n; i < n; i++, k--) {
            int p = k;
            for (int j = 1; j < i; j++) {
                System.out.print(p++);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p--);
            }
            System.out.println();

        }
        for (int i = 1, k = 1; i <= n; i++, k++) {
            int p = k;
            for (int j = i; j < n; j++) {
                System.out.print(p++);
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
        // 5
        // 454
        // 34543
        // 2345432
        // 123454321
        // 2345432
        // 34543
        // 454
        // 5

    }

    private static void pattern42(int n) {
        for (int i = 1, k = n; i <= n; i++, k--) {
            int p = 1, d = k;
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("- ");
            }
            for (int j = 2; j < i; j++) { // even decreased by one step ^j
                System.out.print("- ");
            }
            for (int j = i; j <= (i == 1 ? n - 1 : n); j++) { // decreased one column
                System.out.print((i == 1 ? --d : d--) + " ");
            }

            System.out.println();
        }
        // 1 2 3 4 5 6 5 4 3 2 1
        // 1 2 3 4 5 - 5 4 3 2 1
        // 1 2 3 4 - - - 4 3 2 1
        // 1 2 3 - - - - - 3 2 1
        // 1 2 - - - - - - - 2 1
        // 1 - - - - - - - - - 1
    }

    private static void pattern21(int n) {
        for (int i = 1, init = 2 * n - 1; i <= n; i++, init -= 2) {
            for (int j = 1, val = init; j <= i; j++, val += 2) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // 9
        // 7 9
        // 5 7 9
        // 3 5 7 9
        // 1 3 5 7 9
    }

    private static void binaryPattern(int n) {
        int init = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (init == 0) {
                    init = 1;
                } else
                    init = 0;
                System.out.print(init == 0 ? 1 : 0);
            }
            System.out.println();
        }
        // 10101
        // 01010
        // 10101
        // 01010
        // 10101

    }

    private static void squarePattern(int n) {
        int m = 2 * n - 1; // 2*n for 0
        for (int i = 0; i < m; i++) {// <= for 0
            for (int j = 0; j < m; j++) {// <= for 0
                int atEveryIndex = Math.min(Math.min(i + 1, j + 1), Math.min(m - i, m - j));// i,j for 0
                // * To reverse number
                // int atEveryIndex=n+1-Math.min(Math.min(i+1, j+1), Math.min(m - i, m - j));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }

    }

    private static void crossNumber(int n) {
        for (int i = n, p = 1; i >= 1; i--, p++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i);
                } else if (i + j == n + 1) {
                    System.out.print(p);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        // 1----6
        // -2--5-
        // --34--
        // --34--
        // -2--5-
        // 1----6

    }

    private static void hollowDiamond(int n) {
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= star; j++) {
                if (j == 1 || j == star)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
            if (i < n / 2 + 1) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            // ----*
            // ---*-*
            // --*---*
            // -*-----*
            // *-------*
            // -*-----*
            // --*---*
            // ---*-*
            // ----*
        }

    }
}
