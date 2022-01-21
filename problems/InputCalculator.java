package problems;
import java.util.Scanner;

class InputCalculator {
    public static void main(String[] args) {
        int sum = 0, n = 0, average;
        Scanner scanner = new Scanner(System.in);
        while (n >= 0) {
            System.out.println("Enter #" + (n + 1) + " number");
            boolean isValid = scanner.hasNextInt();
            if (isValid) {
                int input = scanner.nextInt();
                sum += input;
                n++;
            } else
                break;
        }
        average = sum / n;
        System.out.println("\nSum is " + sum + "\nAverage is " + average);
        scanner.close();
    }
}