public class factorProblems {
    public static void main(String[] args) {
        System.out.println(isPerfect(7));
    }

    public static boolean isPrimeNumber(int n) {
        // Divisible by 1 and itself (fact)
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return (count == 2);
    }

    public static boolean isComposite(int n) {
        // Which has more than one factor(excl.1,n)
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return (count > 3);
    }

    public static boolean isPerfect(int n) {
        // Sum of its factors except itself ==given number;
        int m = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == m);
    }

    public static boolean isAbundant(int n) {
        // Sum of number is greater than no.itself (excl.n)
        int m = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum > m);
    }

    public static boolean isDeficient(int n) {
        int m = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum < m);
    }

    public static boolean isPronic(int n) {
        int fact = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (i * (i + 1) == n) {
                    fact = i;
                }
            }
        }
        return (fact > 0);// we can return value of fact ,fact+1
    }
}
