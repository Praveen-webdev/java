
package problems;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count < 11) {
            System.out.println("Enter number #" + count);
            boolean isValid = scanner.hasNextInt();
            if (isValid) {
                int input = scanner.nextInt();
                sum += input;
                count++;
            } else {
                System.out.println("Invalid Input");
            }
            scanner.nextLine(); // ! if not loop will be continue
        }
        scanner.close();
        System.out.println("Sum of ten numbers is " + sum);
    }
}
