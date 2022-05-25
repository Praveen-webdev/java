class passwordChecker {
    public static void main(String[] args) {
        String st = "4Ac8";
        System.out.println(checkPassword(st, 4));
    }

    private static int checkPassword(String str, int n) {
        if (n < 4) {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }
        boolean isCap = false;
        boolean havingDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            }
            if (str.charAt(i) >= 97 && str.charAt(i) <= 'z') {
                isCap = true;
                continue;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                havingDigit = true;
            }
        }
        return havingDigit && isCap ? 1 : 0;
    }
}