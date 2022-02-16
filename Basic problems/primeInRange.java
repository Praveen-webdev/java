import java.util.ArrayList;

public class primeInRange {
    public static void main(String[] args) {
        System.out.println(primeRange(-15, 25));
    }

    private static ArrayList<Integer> primeRange(int start, int end) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }
            if (isPrime(i)) {
                ls.add(i);
            }
        }
        return ls;
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
