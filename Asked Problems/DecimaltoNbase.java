public class DecimaltoNbase {
    public static void main(String[] args) {
        System.out.println(deciToNbase(5678, 21));
    }

    private static String deciToNbase(int num, int divisor) {
        int q = num; // Quotient
        StringBuffer sb = new StringBuffer();
        while (q > 0) {
            int r = q % divisor;
            q /= divisor;
            sb.insert(0, toN_base(r));
        }
        return sb.toString();
    }

    private static char toN_base(int n) {
        if (n < 10) {
            return (char) (n + 48);
        } else {
            return (char) (n + 55);
        }
    }
    // N-base notation is a system for writing numbers that uses only n different
    // symbols, This symbols are the first n symbols from the given notation
    // list(Including the symbol for o) Decimal to n base notation are (0:0, 1:1,
    // 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)

    // Implement the following function

    // Char* DectoNBase(int n, int num):

    // The function accept positive integer n and num Implement the function to
    // calculate the n-base equivalent of num and return the same as a string

    // Steps:

    // Divide the decimal number by n,Treat the division as the integer division
    // Write the the remainder (in n-base notation)
    // Divide the quotient again by n, Treat the division as integer division
    // Repeat step 2 and 3 until the quotient is 0
    // The n-base value is the sequence of the remainders from last to first
    // Assumption:

    // 1 < n < = 36
}
