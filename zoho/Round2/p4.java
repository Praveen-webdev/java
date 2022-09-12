package zoho.Round2;
public class p4 {
    public static void main(String[] args) {
        String str="12345*+-+"; //1*2+3-4+5
        //String str = "374291--*+-";
       // String str = "67542-/+-";
        int n = str.length();
        if (n < 3) {
            System.out.println("Enter valid input");
        }else{
        String num = str.substring(0, n / 2 + 1);
        String op = str.substring(n / 2 + 1, n);
        int res = num.charAt(0) - 48;
        for (int i = 0; i < op.length(); i++) {
            char co = op.charAt(i); // current operator
            int cn = num.charAt(i + 1) - 48;
            if (co == '-') {
                res -= cn;
            } else if (co == '+') {
                res += cn;
            } else if (co == '/') {
                res /= cn;
            } else if (co == '*') {
                res *= cn;
            }
        }
        System.out.println(res);
    }
    }
}
