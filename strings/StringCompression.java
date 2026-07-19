package strings;

public class StringCompression {

    public int compress(char[] chars) {

        int write = 0;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            // Count consecutive same characters
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {

                // Write the character
                chars[write++] = chars[i];

                // Write the count if greater than 1
                if (count > 1) {
                    String str = String.valueOf(count);

                    for (char c : str.toCharArray()) {
                        chars[write++] = c;
                    }
                }

                // Reset count for the next group
                count = 1;
            }
        }

        return write;
    }

    public static void main(String[] args) {

        StringCompression obj = new StringCompression();

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int len = obj.compress(chars);

        System.out.println("Compressed Array:");

        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.println("\nLength = " + len);
    }
}