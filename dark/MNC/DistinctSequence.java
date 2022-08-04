package dark.MNC;

import java.util.HashSet;

public class DistinctSequence {
    public static void main(String[] args) {
        // String str = "gfg";
        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j <= str.length(); j++) {
        // System.out.println(str.substring(i, j));
        // }
        // }
        HashSet<String> hs = new HashSet<>();
        hs.add("g");
        hs.add("gg");
        System.out.println(hs.toString());
    }
}
