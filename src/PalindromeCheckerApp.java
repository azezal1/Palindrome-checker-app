public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check if palindrome using conditional statement
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }

        // Program exits
    }
}