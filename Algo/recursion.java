package Algo;

public class recursion {
    static final String Invalid = "Invalid value";

    public static void main(String[] args) {
        // firstLastSum(123);
        // System.out.println(deciToBinary(134)); // max 3 digits
        fibIt(1);
    }

    private static void fibIt(int n) {
        int f = 0;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 | i == 2) {
                System.out.print(i - 1 + " ");
            } else {
                if (i % 2 != 0) {
                    f = f + s;
                    System.out.print(f + " ");
                } else {
                    s = f + s;
                    System.out.print(s + " ");
                }
            }

        }
    }

    private static int deciToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + deciToBinary(n / 2) * 10;
    }

    private static int reverseNum(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            int d = n % 10;
            rev = rev * 10 + d;
            return reverseNum(n / 10, rev);
        }
    }

    private static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }

    private static boolean stringPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return stringPalindrome(str.substring(1, str.length() - 1));
        }

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); // * Euclidian algorithm
    }

    private static void firstLastSum(int input) {
        int lastDigit = input % 10, sum;
        int firstDigit = 0;
        while (input >= 10) {
            firstDigit = input /= 10;
        }
        sum = firstDigit + lastDigit;
        System.out.println(sum);
    }

    private static void sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    private static int recSumDigits(int n) {
        if (n < 0) {
            return -1;
        }
        if (n < 10) {
            return n;
        }
        return n % 10 + recSumDigits(n / 10);
    }

    private static int findPower(int n, int p) {
        if (p == 0) { // p==0||p==1
            return 1; // n
        }
        return n * findPower(n, p - 1);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) { // 1 indexed
            return n - 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
