package Array;

import java.util.*;

public class Temperature {
    public static void main(String[] args) { // ! Launch with debugger some problems in ide
        double[] temp = getTemp();
        double average = getAverage(temp);
        int aboveAverage = getAbove(temp, average);
        System.out.printf("%s%.2f%c\n", "Average temperature is : ", average, 'c');
        System.out.println(aboveAverage + "days above average");
    }

    private static double[] getTemp() {
        Scanner sc = new Scanner(System.in);
        boolean err = false;
        int days = 0;
        do {
            err = false;
            try {
                System.out.println("How many day's temperature?  ");
                days = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Enter day as a number");
                err = true;
                sc.nextLine();
            }
        } while (err);
        double[] temp = new double[days];
        for (int i = 0; i < days; i++) {
            try {
                System.out.print("Enter day " + (i + 1) + "'s temperature : ");
                temp[i] = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Input a valid number!");
                sc.nextLine(); // ! pulls string out of the buffer
                i--;
            }

        }
        sc.close();
        return temp;
    }

    private static double getAverage(double[] temp) {
        double sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return sum / temp.length;
    }

    private static int getAbove(double[] temp, double average) {
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average) {
                count++;
            }
        }
        return count;
    }
}
