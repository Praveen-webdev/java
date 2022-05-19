public class OperationsBinary {
    public static void main(String[] args) {
        System.out.println(binaryOperations("1a0b1b0c0c1"));
    }

    private static int binaryOperations(String str) {
        if (str == null) {
            return -1;
        }
        int result = str.charAt(0);
        for (int i = 1; i < str.length(); i += 2) {
            switch (Character.toLowerCase(str.charAt(i))) {
                case 'a':
                    result = result & str.charAt(i + 1) - 48;
                    break;
                case 'b':
                    result = result | str.charAt(i + 1) - 48;
                    break;
                case 'c':
                    result = result ^ str.charAt(i + 1) - 48;
                    break;
                default:
                    System.out.println("wrong character found");
            }
        }
        return result;
    }
}
