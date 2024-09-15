package Recursion;

import java.util.*;

// using MAP

class HelloIntMap1 {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 1, 5, 8, 3, 1, 2, 2, 3, 8 };

        Map<Integer, Integer> mapnum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mapnum.containsKey(nums[i])) {
                mapnum.put(nums[i], mapnum.get(nums[i]) + 1);
            } else {
                mapnum.put(nums[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> e : mapnum.entrySet()) {
            System.out.println(e);
        }

    }
}

// simple method

class HelloInt {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 1, 5, 8, 3, 1, 1, 1 };

        int[] hash = new int[9];

        for (int i = 0; i <= 8; i++) {
            hash[nums[i]] += 1;
        }

        for (int i : hash)
            System.out.println(i);
    }
}

// FOR CHARACTER

class HelloChar {
    public static void main(String[] args) {

        char[] cha = { 'a', 'b', 'c', 'd', 'a', 'b' };

        int[] hash = new int[26];

        for (int i = 0; i < cha.length; i++) {
            hash[cha[i] - 'a'] += 1;
        }

        for (int j = 0; j < hash.length; j++)
            if (hash[j] != 0) {
                System.out.println((char) ('a' + j) + " = " + hash[j]);
            }
    }
}