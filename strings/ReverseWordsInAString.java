package strings;

public class ReverseWordsInAString {

    // Inner class containing the solution
    class Solution {

        // Method to reverse the order of words in a string
        public String reverseWords(String s) {

            // Step 1: Remove leading/trailing spaces
            // Step 2: Split the string using one or more spaces
            String[] arr = s.trim().split("\\s+");

            // StringBuilder is used because it is efficient
            // for repeatedly appending strings.
            StringBuilder ans = new StringBuilder();

            // Traverse the array from the last word to the first
            for (int i = arr.length - 1; i >= 0; i--) {

                // Add the current word
                ans.append(arr[i]);

                // Add a space only if this is not the last word
                // in the reversed string.
                if (i != 0) {
                    ans.append(" ");
                }
            }

            // Convert StringBuilder into String and return it
            return ans.toString();
        }
    }

    public static void main(String[] args) {

        // Create object of the outer class
        ReverseWordsInAString obj = new ReverseWordsInAString();

        // Create object of the inner Solution class
        Solution solution = obj.new Solution();

        // Input string
        String s = "  hello     world        ";

        // Call the method and store the returned string
        String result = solution.reverseWords(s);

        // Print the final result
        System.out.println(result);
    }
}