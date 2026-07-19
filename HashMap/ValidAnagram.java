package HashMap;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency map for string s
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Frequency map for string t
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Compare both maps
        return map.equals(map1);
    }

    public static void main(String[] args) {

        ValidAnagram obj = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        System.out.println(obj.isAnagram(s, t));
    }
}