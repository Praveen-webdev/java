package problems;

import java.util.Scanner;

public class FirstLastDigitSum {
    static final String Invalid = "Invalid value";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        boolean isValid = scanner.hasNextInt();
        if (isValid) {
            int input = scanner.nextInt();
            int lastDigit = input % 10, sum;
            int firstDigit = 0;
            while (input >= 10) {
                firstDigit = input /= 10;
            }
            sum = firstDigit + lastDigit;
            System.out.println(sum);
        } else
            System.out.println(Invalid);
        scanner.close();
    }

}
