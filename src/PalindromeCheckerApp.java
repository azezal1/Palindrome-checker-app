public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string to check
        String original = "racecar";

        // Convert string to character array
        char[] chars = original.toCharArray();

        // Two-pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Stop checking once mismatch is found
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
    }
}