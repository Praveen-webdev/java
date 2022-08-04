package dark.MNC;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String splitWords[] = str.split("\\."); // *Escape sequence
        StringBuffer rs = new StringBuffer(splitWords[splitWords.length - 1]);
        for (int i = splitWords.length - 2; i >= 0; i--) {
            rs.append(".");
            rs.append(splitWords[i]);
        }
        System.out.println(rs.toString());
    }
}
