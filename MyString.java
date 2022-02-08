
public class MyString { // ! naming as public class String will give error since it is a
                        // java.lang.String class
    public static void main(String[] args) {
        // stringObject();

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

    private void stringMethods() {
        String fName = "praveen";
        String lName = "kumar";
        String fullName = fName.concat(lName);// String - praveenkumar
        System.out.println(fName.charAt(3)); // char - a
        System.out.println(fullName.endsWith(lName)); // boolean - true
        System.out.println(fName.equals("PRAVEEN")); // boolean - false
        System.out.println(fName.equalsIgnoreCase("PRAVEEN")); // boolean -true
        System.out.println(fName.isEmpty()); // boolean -false ; "".isEmpty() returns true
    }
}
