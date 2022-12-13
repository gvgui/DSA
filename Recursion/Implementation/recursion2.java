package Recursion.Implementation;
public class recursion2 {
    public static char firstChar(String str) {
        return str.charAt(0);
    }

    public static char lastChar(String str) {
        int size = str.length();
        return str.charAt(size-1);
    }

    public static String newString(String str) {
        int size = str.length();
        return str.substring(1, size-1);
    }

    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true;
        }
        char first = firstChar(str);
        char last = lastChar(str);
        if(first == last) {
            return isPalindrome(newString(str));
        }
        return false;
    }
    public static void main(String[] args) {
        String first = "aa";
        String second = "modem";
        String third = "rater";
        String fourth = "motor";
        String fifth = "rotor";
        String sixth = "racecar";
        System.out.println("Should be true:");
        System.out.println("The word " + first + " is a Palindrome: " + isPalindrome(first));
        System.out.println("----------------------------------");
        System.out.println("Should be false:");
        System.out.println("The word " + second + " is a Palindrome: " + isPalindrome(second));
        System.out.println("----------------------------------");
        System.out.println("Should be false:");
        System.out.println("The word " + third + " is a Palindrome: " + isPalindrome(third));
        System.out.println("----------------------------------");
        System.out.println("Should be false:");
        System.out.println("The word " + fourth + " is a Palindrome: " + isPalindrome(fourth));
        System.out.println("----------------------------------");
        System.out.println("Should be true:");
        System.out.println("The word " + fifth + " is a Palindrome: " + isPalindrome(fifth));
        System.out.println("----------------------------------");
        System.out.println("Should be true:");
        System.out.println("The word " + sixth + " is a Palindrome: " + isPalindrome(sixth));
    }
}
