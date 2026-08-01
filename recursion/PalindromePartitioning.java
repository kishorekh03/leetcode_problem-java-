package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    // Function to check whether a string is a palindrome
    public boolean isPalindrome(String s) {

        // Left pointer
        int start = 0;

        // Right pointer
        int end = s.length() - 1;

        // Compare characters from both ends
        while (start < end) {

            // If characters are different,
            // it is not a palindrome
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Move both pointers
            start++;
            end--;
        }

        // String is a palindrome
        return true;
    }

    // Backtracking function
    public void check(String s,
                      int index,
                      List<String> combination,
                      List<List<String>> answer) {

        // ---------------- Base Case ----------------

        // If we have processed the entire string,
        // store the current partition
        if (index == s.length()) {
            answer.add(new ArrayList<>(combination));
            return;
        }

        // ---------------- Recursive Case ----------------

        // Try every possible substring starting from 'index'
        for (int i = index; i < s.length(); i++) {

            // Create substring from index to i
            String part = s.substring(index, i + 1);

            // Continue only if the substring is a palindrome
            if (isPalindrome(part)) {

                // ---------- Choose ----------
                // Add the palindrome substring
                combination.add(part);

                // ---------- Recurse ----------
                // Continue from the next position
                check(s, i + 1, combination, answer);

                // ---------- Backtrack ----------
                // Remove the last chosen substring
                // and try the next possibility
                combination.remove(combination.size() - 1);
            }
        }
    }

    // Main function
    public List<List<String>> partition(String s) {

        // Stores all palindrome partitions
        List<List<String>> answer = new ArrayList<>();

        // Stores the current partition
        List<String> combination = new ArrayList<>();

        // Start backtracking from index 0
        check(s, 0, combination, answer);

        return answer;
    }

    // Driver Code
    public static void main(String[] args) {

        PalindromePartitioning obj = new PalindromePartitioning();

        String s = "aab";

        // Get all palindrome partitions
        List<List<String>> result = obj.partition(s);

        // Print the answer
        System.out.println(result);
    }
}