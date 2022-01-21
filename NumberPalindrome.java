public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1441));
    }

    public static boolean isPalindrome(int number) {
        int givenNumber = number;
        int rev = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number /= 10;
        }
        return givenNumber == rev;
    }
};
