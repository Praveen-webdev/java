
public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(102));
    }

    public static int sumDigits(int number) {
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
}
