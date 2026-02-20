import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string to check
        String original = "racecar";

        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters from stack to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
    }
}