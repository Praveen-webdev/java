public class Practice {
    // https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html
    public static void main(String[] args) {

        pattern10(13);
    }

    private static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++);
            }
            System.out.println();
        }
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567

    }

    private static void pattern2(int n) {
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print(p++);
            }
            if (i < n / 2 + 1) {
                stars++;
            } else {
                stars--;
            }
            System.out.println();
        }
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
        // 123456
        // 12345
        // 1234
        // 123
        // 12
        // 1
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // 1
        // 22
        // 333
        // 4444
        // 55555
        // 666666
        // 7777777
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            int p = n;
            for (int j = i; j <= n; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
        // 7654321
        // 765432
        // 76543
        // 7654
        // 765
        // 76
        // 7
    }

    private static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(p++);
            }
            System.out.println();
        }
        // 1234567
        // 123456
        // 12345
        // 1234
        // 123
        // 12
        // 1
    }

    private static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        // 7654321
        // 654321
        // 54321
        // 4321
        // 321
        // 21
        // 1
    }

    private static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            int p = n;
            for (int j = 1; j <= i; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
        // 7
        // 76
        // 765
        // 7654
        // 76543
        // 765432
        // 7654321
    }

    private static void pattern8(int n) {
        for (int i = 1, k = 1; i <= n; i++, k += 2) {
            int p = 1;
            for (int j = 1; j <= k; j++) {
                if (j <= k / 2) {
                    System.out.print(p++);
                } else {
                    System.out.print(p--);
                }
            }
            System.out.println();
        }
        // 1
        // 121
        // 12321
        // 1234321
        // 123454321
        // 12345654321
        // 1234567654321
    }

    private static void pattern9(int n) {
        int stars = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print(p++);
            }
            if (i < n / 2 + 1) {
                stars--;
            } else {
                stars++;
            }
            System.out.println();
        }
        // 1234567
        // 123456
        // 12345
        // 1234
        // 123
        // 12
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
    }

    private static void pattern10(int n) {
        int stars = n / 2 + 1;
        int space = 0;
        int p = 1;
        for (int i = 1; i <= n; i++) {
            int k = p;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(k++);
            }
            if (i < n / 2 + 1) {
                p++;
                space++;
                stars--;
            } else {
                p--;
                space--;
                stars++;
            }
            System.out.println();
        }
        // 1234567
        // 234567
        // 34567
        // 4567
        // 567
        // 67
        // 7
        // 67
        // 567
        // 4567
        // 34567
        // 234567
        // 1234567
    }
}
