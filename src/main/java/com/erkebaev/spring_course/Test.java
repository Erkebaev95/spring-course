package com.erkebaev.spring_course;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{1, 5, 2, 3, 6, 7, 9}, 8)));
        //System.out.println(isPalindrome(131));
        //System.out.println(romanToInt("VII"));

    }

    public static String longestCommonPrefix(String[] strs) {
        // strs = ["flower","flow","flight"]
        // "fl"
        return null;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int prev = 0;
        int x = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if (prev > roman.get(s.charAt(i))) {
                x -= roman.get(s.charAt(i));
            }
            else {
                x += roman.get(s.charAt(i));
            }
            prev = roman.get(s.charAt(i));
        }
        return x;
    }

    // Given an integer x, return true if x is a palindrome,
    // and false otherwise.
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int pop = x % 10;
            x /= 10;

            reversed = (reversed * 10) + pop;
        }

        if (x == reversed || x == reversed / 10) {
            return true;
        }
        else {
            return false;
        }
    }

    // two sum
    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
