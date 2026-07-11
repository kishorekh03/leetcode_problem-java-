package strings;

public class ValidPalindrome2 {

    // Function to check whether the substring from 'start' to 'end'
    // is a palindrome or not.
    public boolean isPalindrome(String s, int start, int end) {

        // Compare characters from both ends
        while (start < end) {

            // If characters are different, it is not a palindrome
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Move both pointers towards the center
            start++;
            end--;
        }

        // All characters matched
        return true;
    }

    // Main function
    public boolean validPalindrome(String s) {

        // Left pointer
        int start = 0;

        // Right pointer
        int end = s.length() - 1;

        // Traverse until both pointers meet
        while (start < end) {

            // If characters do not match
            if (s.charAt(start) != s.charAt(end)) {

                /*
                 * We are allowed to delete at most one character.
                 *
                 * Case 1: Delete the left character.
                 * Case 2: Delete the right character.
                 *
                 * If either remaining substring is a palindrome,
                 * return true.
                 */
                return isPalindrome(s, start + 1, end) ||
                       isPalindrome(s, start, end - 1);
            }

            // Characters matched, move both pointers
            start++;
            end--;
        }

        // No mismatch found, so it is already a palindrome
        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome2 obj = new ValidPalindrome2();

        String[] testCases = {
                "aba",
                "abca",
                "abc",
                "deeee",
                "racecar",
                "abccdba"
        };

        // Test all the strings
        for (String s : testCases) {

            System.out.println("Input : " + s);

            if (obj.validPalindrome(s)) {
                System.out.println("Output: true");
            } else {
                System.out.println("Output: false");
            }

            System.out.println();
        }
    }
}