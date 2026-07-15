package strings;

public class Subarray {

    // Prints all substrings of a string
    public void printAllSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                System.out.println(sb);
            }
        }
    }

    // Prints all words, ignoring extra spaces
    public void printAllWords(String s) {

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                System.out.println(word);
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {

        Subarray obj = new Subarray();

        String s = "      hello  how  are.       you           ";

        System.out.println("===== All Substrings =====");
        obj.printAllSubstrings("abc");

        System.out.println();

        System.out.println("===== Words =====");
        obj.printAllWords(s);

        System.out.println();
    }
}