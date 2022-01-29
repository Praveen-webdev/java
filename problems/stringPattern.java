import java.util.Scanner;

class stringPattern {
    public static void main(String[] args) {
        // www.knowprogramming.com/c-programming/string-pattern-in-c-language/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        plusString(string);

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
        for (int i = 1, k = 0; i <= n; i++, k++) {
            for (int j = 1, p = 0; j <= n; j++, p++) {
                if (i == n / 2 + 1) {
                    System.out.print(s.charAt(p) + " ");

                } else if (j == n / 2 + 1) {
                    System.out.print(s.charAt(k) + " ");
                } else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
}