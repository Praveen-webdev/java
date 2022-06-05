package dark.basic;

public class fibonocci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static void printfib(int n) { // * using iterative solution
        int f = 0;
        int s = 1, d;
        System.out.printf("%d\t%d\t", f, s);
        for (int i = 2; i < n; i++) {
            d = f + s;
            f = s;
            s = d;
            System.out.printf("%d\t", d);
        }
    }

    private static int fib(int n) { // * recursion
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
