package strings;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        ReverseString obj = new ReverseString();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before Reversing:");
        System.out.println(Arrays.toString(s));

        obj.reverseString(s);

        System.out.println("After Reversing:");
        System.out.println(Arrays.toString(s));
    }
}