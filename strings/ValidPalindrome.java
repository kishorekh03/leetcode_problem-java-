package strings;

public class ValidPalindrome {

    // -------------------- Brute Force Approach --------------------
    public boolean BruteForce(String s) {

        // Stores the filtered string in reverse order
        String reverse = "";

        // Stores the filtered string in original order
        String original = "";

        // Traverse from the end and keep only letters and digits
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            // Ignore special characters and spaces
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                reverse += ch;
            }
        }

        // Traverse from the beginning and keep only letters and digits
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Ignore special characters and spaces
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {

                original += ch;
            }
        }

        // Convert both strings to lowercase for case-insensitive comparison
        reverse = reverse.toLowerCase();
        original = original.toLowerCase();

        // If both strings are equal, it is a palindrome
        return original.equals(reverse);
    }

    // -------------------- Check Alphanumeric --------------------
    public boolean isAlphanumeric(char ch) {

        // Return true if the character is:
        // 1. A digit (0-9)
        // 2. A lowercase letter (a-z)
        // 3. An uppercase letter (A-Z)
        return (ch >= '0' && ch <= '9') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z');
    }

    // -------------------- Optimal Two Pointer Approach --------------------
    public boolean isPalindrome(String s) {

        // Left pointer starts from the beginning
        int start = 0;

        // Right pointer starts from the end
        int end = s.length() - 1;

        // Convert the entire string to lowercase
        // so that 'A' and 'a' are treated as the same character
        s = s.toLowerCase();

        // Continue until both pointers meet
        while (start < end) {

            // Skip non-alphanumeric characters from the left
            if (!isAlphanumeric(s.charAt(start))) {
                start++;
                continue;
            }

            // Skip non-alphanumeric characters from the right
            if (!isAlphanumeric(s.charAt(end))) {
                end--;
                continue;
            }

            // Compare both valid characters
            if (s.charAt(start) != s.charAt(end)) {
                return false; // Mismatch found
            }

            // Move both pointers towards the center
            start++;
            end--;
        }

        // No mismatch found
        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome obj = new ValidPalindrome();

        String s = "abca";

        if (obj.isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}