
public class MyString { // ! naming as public class String will give error since it is a
                        // java.lang.String class
    public static void main(String[] args) {
        // stringObject();
        // stringMethods();
        //tellMetype("hello", "12345", "money$");// return weather vowel,consonant,number or symbol
        //stringPalindrome("12321");
        mutableString();
    }

    private void stringObject() {
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
        System.out.println(fName.charAt(3)); // char - a
        System.out.println(fullName.endsWith(lName)); // boolean - true
        System.out.println(fName.equals("PRAVEEN")); // boolean - false
        System.out.println(fName.equalsIgnoreCase("PRAVEEN")); // boolean -true
        System.out.println(fName.isEmpty()); // boolean -false ; "".isEmpty() returns true
        String[] split = "hello:praveen".split(":"); // ! cannot be a dot
        for (String c : split) { // String[] - hello praveen
            System.out.println(c);
        }
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
    private static void stringPalindrome(String s){
        s=s.toLowerCase();
        //* my way
        // String g=String.valueOf(s); //converts to string here used for copying
        // String rev="";
        // for(int i=s.length()-1;i>=0;i--){
        //     rev+=s.charAt(i);
        // }
        // System.out.println(g.equals(rev));
        //* using stringbuffer
        StringBuffer sb= new StringBuffer(s);
        String rev= sb.reverse().toString(); //? StringBuffer return a stringbuffer object 
        System.out.println(s.equals(rev));
        // new StringBuffer(s).reverse().toString().equals(s);
    }
    private static void mutableString(){ 
        StringBuffer sb =new StringBuffer("Praveen");
        sb.append(" kumar");
        sb.replace(0, 7, "Aravind");
        sb.delete(8,13);
        System.out.println(sb);

    }
}
