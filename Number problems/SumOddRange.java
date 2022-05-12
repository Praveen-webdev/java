
public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdds(1, 5));
    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start > 0 && end > 0) && (end >= start)) {
            int i;
            int sum = 0;
            for (i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else
            return -1;
    }

    public static int sumOdds(int s, int e) {
        int sum = 0;
        while (s <= e) {
            if (s % 2 != 0) {
                sum += s;
                s += 2;
            } else {
                s++;
            }
        }
        return sum;
    }
}
