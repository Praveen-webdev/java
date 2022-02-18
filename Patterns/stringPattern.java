
class stringPattern {
    public static void main(String[] args) {
        // www.knowprogramming.com/c-programming/string-pattern-in-c-language/

        crossString("geeks");

    }

    private static void crossString(String s) {
        int n = s.length();
        for (int i = 0, p = n - 1; i < n; i++, p--) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i) + " ");
                } else if (i + j == n - 1) {
                    System.out.print(s.charAt(p) + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        // g - - - s
        // - e - k -
        // - - e - -
        // - e - k -
        // g - - - s

    }

    private static void p1(String s) {
        int n = s.length();
        for (int i = 1; i <= n; i++) {
            int p = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(s.charAt(p++));
            }
            System.out.println();
        }
        // p
        // pr
        // pra
        // prav
        // prave
        // pravee
        // praveen
    }

    private static void p3(String s) {
        int n = s.length();
        for (int i = 1; i <= n; i++) {
            int p = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(s.charAt(p++));
            }
            System.out.println();
        }
        for (int i = 2, k = 1; i <= n; i++, k++) {
            int p = k;
            for (int j = i; j <= n; j++) {
                System.out.print(s.charAt(p++));
            }
            System.out.println();
        }
    }

    private static void p5(String s) {
        int n = 5; // taking input from user
        int init = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                if (init >= s.length()) {
                    init = 0;
                }
                System.out.print(s.charAt(init++) + " ");
            }
            System.out.println();
        }
    }

    private static void plusString(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print(s.charAt(j) + " ");

                } else if (j == n / 2) {
                    System.out.print(s.charAt(i) + " ");
                } else
                    System.out.print("- ");
            }
            System.out.println();
        }
        // - - g - -
        // - - e - -
        // g e e k s
        // - - k - -
        // - - s - -
    }
}