package strings;

public class RemoveAllOccurrencesofaSubstring {

    // Method to remove all occurrences of 'part' from string 's'
    public String removeOccurrences(String s, String part) {

        // Convert the string into a StringBuilder so that
        // we can delete characters efficiently.
        StringBuilder s1 = new StringBuilder(s);

        // Repeat until 'part' is no longer found.
        while (s1.indexOf(part) != -1) {

            // Find the starting index of the first occurrence.
            int start = s1.indexOf(part);

            // Remove the substring from start to start + part.length().
            s1.delete(start, start + part.length());
        }

        // Convert StringBuilder back to String.
        return s1.toString();
    }

    // Driver method
    public static void main(String[] args) {

        // Create an object of the class
        RemoveAllOccurrencesofaSubstring obj =
                new RemoveAllOccurrencesofaSubstring();

        // ---------------- Test Case 1 ----------------
        String s1 = "daabcbaabcbc";
        String part1 = "abc";

        System.out.println("Test Case 1");
        System.out.println("Input String : " + s1);
        System.out.println("Substring    : " + part1);
        System.out.println("Output       : " + obj.removeOccurrences(s1, part1));

        System.out.println();

        // ---------------- Test Case 2 ----------------
        String s2 = "axxxxyyyyb";
        String part2 = "xy";

        System.out.println("Test Case 2");
        System.out.println("Input String : " + s2);
        System.out.println("Substring    : " + part2);
        System.out.println("Output       : " + obj.removeOccurrences(s2, part2));
    }
}