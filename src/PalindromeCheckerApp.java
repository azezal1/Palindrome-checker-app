import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string to check
        String original = "racecar";

        // Create a deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into the deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i)); // Insert at rear
        }

        // Compare front and rear characters
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
    }
}