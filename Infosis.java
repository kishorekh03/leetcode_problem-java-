import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Infosis {

    // Sum of first n natural numbers using recursion
    public int sumOfNaturalNumbers(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + sumOfNaturalNumbers(n - 1);
    }

    // Binary Exponentiation (O(log b))
    public int power(int a, int b) {

        if (b == 0) {
            return 1;
        }

        int half = power(a, b / 2);

        if (b % 2 == 0) {
            return half * half;
        }

        return a * half * half;
    }

    // Returns the first repeating element
    public int firstRepeating(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Find first repeating element
        for (int x : arr) {
            if (map.get(x) > 1) {
                return x;
            }
        }

        return -1;
    }

    // Counts the number of distinct elements
    public int countDistinct(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        return set.size();
    }

    // Valid Parentheses
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    

    public static void main(String[] args) {

        Infosis obj = new Infosis();

        // Sum of Natural Numbers
        System.out.println("===== Sum of Natural Numbers =====");
        System.out.println("Sum = " + obj.sumOfNaturalNumbers(10));

        System.out.println();

        // Power
        System.out.println("===== Power =====");
        System.out.println("3^2 = " + obj.power(3, 2));
        System.out.println("2^10 = " + obj.power(2, 10));

        System.out.println();

        // First Repeating Element
        System.out.println("===== First Repeating Element =====");

        int[] arr1 = {4, 5, 2, 3, 5, 1, 2};
        System.out.println("Array 1: " + obj.firstRepeating(arr1));

        int[] arr2 = {10, 20, 30, 20, 40, 10};
        System.out.println("Array 2: " + obj.firstRepeating(arr2));

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Array 3: " + obj.firstRepeating(arr3));

        System.out.println();

        // Count Distinct Elements
        System.out.println("===== Count Distinct Elements =====");

        int[] arr4 = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Distinct Elements = " + obj.countDistinct(arr4));

        System.out.println();

        // Valid Parentheses
        System.out.println("===== Valid Parentheses =====");

        System.out.println("()           : " + obj.isValid("()"));
        System.out.println("()[]{}       : " + obj.isValid("()[]{}"));
        System.out.println("({[]})       : " + obj.isValid("({[]})"));
        System.out.println("(]           : " + obj.isValid("(]"));
        System.out.println("([)]         : " + obj.isValid("([)]"));
        System.out.println("{[]}         : " + obj.isValid("{[]}"));
        System.out.println("(((())))     : " + obj.isValid("(((())))"));
        System.out.println("((           : " + obj.isValid("(("));
         int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print unique elements
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}