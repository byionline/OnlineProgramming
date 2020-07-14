package Longest_Substring_with_K_Distinct_Characters;

import java.util.*;
import java.util.Map.Entry;

class Test {
    public static int findStringLength(String str, int k) {
        if (str == null || str.length() == 0 || str.length() < k) {
            throw new IllegalArgumentException();
        }
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        // char rightChar = str.charAt(0);
        // charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

        // rightChar = str.charAt(1);
        // charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

        // rightChar = str.charAt(2);
        // charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

        // rightChar = str.charAt(3);
        // charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);

            while (charFreq.size() > k) {
                char charLeft = str.charAt(windowStart);
                charFreq.put(charLeft, charFreq.get(charLeft) - 1);
                if (charFreq.get(charLeft) ==0) {

                    charFreq.remove(charLeft); // remove from HashMap
                }
                windowStart++;

                // print each character of a given String inside the while loop
                // this will run infinite if character is not removed from the HashMap
              //  System.out.println(charLeft);

            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
            // System.out.println(rightChar); // print each character of a given String
       }
        // print all the key value currently present in the HashMap charFreq.
        Set<Entry<Character, Integer>> values = charFreq.entrySet();
        for (Map.Entry<Character, Integer> e : values) {
            System.out.println(e.getKey());

        }
        // return 0;
        return maxLength;

    }

    public static void main(String[] args) {
        String str = "araaci";
        int k = 2;
        System.out.println(findStringLength(str, k));
    }
}