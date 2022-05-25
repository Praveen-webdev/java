public class MoveHyphen {
    public static void main(String[] args) {
        System.out.println(moveHyphen("Move-Hyphens-to-front"));
    }

    private static String moveHyphen(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                sb.insert(0, '-');
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
