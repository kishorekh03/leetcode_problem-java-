package strings;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        // If s1 is longer than s2, it is impossible for s2
        // to contain any permutation of s1.
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency array for s1
        int[] freq1 = new int[26];

        // Frequency array for the current window in s2
        int[] freq2 = new int[26];

        // Build frequency arrays
        // freq1 -> stores frequency of characters in s1
        // freq2 -> stores frequency of first window of s2
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Compare the first window with s1
        // If both frequency arrays are equal,
        // the first window itself is a permutation.
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Start sliding the window
        // i points to the new character entering the window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add the new character to the window
            freq2[s2.charAt(i) - 'a']++;

            // Remove the leftmost character from the previous window
            // (i - s1.length()) gives the index of the outgoing character
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            // Compare the updated window with s1
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        // No matching permutation found
        return false;
    }

    public static void main(String[] args) {

        PermutationInString obj = new PermutationInString();

        System.out.println(obj.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(obj.checkInclusion("ab", "eidboaoo")); // false
        System.out.println(obj.checkInclusion("adc", "dcda"));    // true
    }
}