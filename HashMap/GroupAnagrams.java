package HashMap;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        // HashMap:
        // Key   -> Sorted string
        // Value -> List of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // Traverse every string in the array
        for (String word : strs) {

            // Convert the string into a character array
            char[] ch = word.toCharArray();

            // Sort the characters in the array
            Arrays.sort(ch);

            // Convert the sorted character array back into a string
            String key = new String(ch);

            // If the key is not present, create a new list and add it as the value
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word to its anagram group
            map.get(key).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        GroupAnagrams obj = new GroupAnagrams();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println(result);
    }
}