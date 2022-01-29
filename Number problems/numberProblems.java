public class numberProblems {
    public static void main(String[] args) {
        System.out.println(isKrishnamoorthiNumber(145));
    }

    static int sumDigits(int number) {
        if (number > 9) {
            int sum = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                sum = sum + lastDigit;
                number /= 10;
            }
            return sum;
        } else
            return -1;
    }

    static boolean isPalindrome(int number) {
        int givenNumber = number;
        int rev = 0;
        while (number != 0) {
            int d = number % 10;
            rev = (rev * 10) + d;
            number /= 10;
        }
        return givenNumber == rev;
    }

    static boolean isSpyNumber(int n) {
        int sum = 0, prod = 1;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    static boolean isSpecialNumber(int n) {
        int m = n, sum = 0, prod = 1;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            d /= 10;
        }
        return (sum + prod == m);
    }

    static boolean isNivenNumber(int n) { // Harshad or Niven Number
        int m = n, sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return (m % sum == 0);
    }

    static boolean isDuckNumber(int n) {
        int count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == 0) {
                count++;
            }
            d /= 10;
        }
        return (count > 0);
    }

    public static int getDuckNumber(int n, int get) {
        int count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == get) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static boolean isNeonNumber(int n) {
        int m = n, sum = 0;
        n *= n;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        return (sum == m);

    }

    public static boolean isAutoMorphic(int n) {
        int flag = 0, q = n * n;
        while (n != 0) {
            int d = n % 10;
            int d1 = q % 10;
            if (d1 != d) {
                flag = 1;
            }
            n /= 10;
            q /= 10;
        }
        return (flag == 0);

    }

    public static boolean isKrishnamoorthiNumber(int n) {
        int m = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10, fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        return (m == sum);

    }

}
