package strings;

import java.util.HashMap;

public class StringCompression {

    public int compress(char[] chars) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : map.keySet()) {
            sb.append(c);
            sb.append(map.get(c));
        }

        System.out.println(sb);

        return sb.length();
    }

    public static void main(String[] args) {

        StringCompression obj = new StringCompression();

        char[] chars = {'a','a','b','b','c','c','c'};

        System.out.println(obj.compress(chars));
    }
}