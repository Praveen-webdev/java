package Strings;

public class MyString { // ! naming as public class String will give error since it is a
                        // java.lang.String class
  public static void main(String[] args) {
    // stringObject();
    // stringMethods();
    // tellMetype("hello", "12345", "money$");// return weather
    // vowel,consonant,number or symbol
    // System.out.println(stringPalindrome("123321")) ;
    // mutableString();
    // System.out.println(last2("xaxxaxaxx"));
    System.out.println(runLengthDecode("a5"));
  }

  private static String runLengthEncode(String str) {
    char c = str.charAt(0);
    int i = 0, count = 0;
    StringBuffer sb = new StringBuffer();
    while (i < str.length()) {
      char current = str.charAt(i);
      if (current == c) {
        count++;
      } else {
        sb.append(c);
        sb.append(count);
        c = current;
        count = 1;
      }
      i++;
    }
    sb.append(c); // to add last encode
    sb.append(count);
    return sb.toString();
  }

  private static String runLengthDecode(String str) {
    int i = 1, count = 0;
    char c = str.charAt(0);
    StringBuffer sb = new StringBuffer();
    while (i < str.length()) {
      char current = str.charAt(i);
      if (current >= 48 && current <= 57) {
        count = count * 10 + (int) current - 48;
      } else {
        for (int k = 1; k <= count; k++) {
          sb.append(c);
        }
        c = current;
        count = 0;
      }
      i++; 
    }
    for (int k = 1; k <= count; k++) { // to add last decode
      sb.append(c);
    }
    return sb.toString();
  }

  private static void allSubstring(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) { // * j=i+1
        System.out.println(str.substring(i, j));
      }
    }
  }

  public static int last2(String str) {
    if (str.length() < 2) {
      return 0;
    }
    String last = str.substring(str.length() - 2);
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 2).equals(last)) {
        count++;
      }
    }
    return count;
  }

  boolean doubleX(String str) {
    boolean isfollow = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x') {
        if (str.charAt(i + 1) == 'x') {
          isfollow = true;
          break;
        }
      }
    }
    return isfollow;
  }

  private void stringObject() {
    // ? Additionally, String concatenation using the + operator within a loop
    // should be avoided. Since the String object is immutable, each call for
    // concatenation will result in a new String object being created.
    String str1 = new String("hello"); // str1=1x1234
    String str2 = new String("hello"); // str2=1x5678
    String str3 = "world"; // str3=1x4321//? String constant pool in heap
    String str4 = "world"; // str4=1x4321
    // * Comparing two strings
    System.out.println(str1 == str2); // 1x1234 == 1x5678 - false
    System.out.println(str1.equals(str2)); // "hello"=="hello";
    System.out.println(str3 == str4); // true (1x4321==1x4321)
    System.out.println(str1.equals(str2));// Preferrable ("world"=="world")
    // ! StringIndexOutOfBoundsException arises when exeeds the index limit -
    // str1[5]
  }

  private static void stringMethods() {
    String fName = "praveen";
    String lName = "kumar";
    String fullName = fName.concat(lName);// String - praveenkumar
    System.out.println(fullName.length());// we need to call
    System.out.println(fName.toUpperCase()); // String - PRAVEEN :bonus+ toLowerCase()
    System.out.println(fName.charAt(3)); // ! Index may be out of bounds
    System.out.println(fullName.endsWith(lName)); // boolean - true
    System.out.println(fName.equals("PRAVEEN")); // boolean - false
    System.out.println(fName.equalsIgnoreCase("PRAVEEN")); // boolean -true
    System.out.println(fName.isEmpty()); // boolean -false ; "".isEmpty() returns true
    String[] split = "hello:praveen".split(":"); // ! cannot be a dot
    for (String c : split) { // String[] - hello praveen
      System.out.println(c);
    }
    // ! substring - returns empty string if both params are same
    System.out.println(fullName.substring(7)); // String -kumar //! input can also be start&end index
    char[] charfName = fName.toCharArray(); // Char[] -{'p','r','a','v','e','e','n'}

    // ? Refer some methods from eduoxic course
  }

  private static void tellMetype(String... strings) {
    for (String string : strings) {
      char lastChar = string.toLowerCase().charAt(string.length() - 1);
      if (Character.isLetter(lastChar)) { // ! mostly char&int methods are static
        if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
          System.out.println("vowel");
        } else
          System.out.println("letter");
      } else if (Character.isDigit(lastChar)) {
        System.out.println("Digit");
      } else {
        System.out.println("Symbol");
      }
    }
  }

  private static boolean stringPalindrome(String s) {
    s = s.toLowerCase();
    // * my way
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
    // * using stringbuffer
    // StringBuffer sb = new StringBuffer(s);
    // String rev = sb.reverse().toString(); // ? StringBuffer return a stringbuffer
    // object
    // return (s.equals(rev));
    // return new StringBuffer(s).reverse().toString().equals(s);
  }

  private static void mutableString() {
    StringBuffer sb = new StringBuffer("Praveen");
    sb.append(" kumar");
    sb.replace(0, 7, "Aravind");
    sb.delete(8, 13);
    System.out.println(sb);

  }
}
