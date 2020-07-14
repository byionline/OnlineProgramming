package Longest_Substring_with_K_Distinct_Characters;

/*
Problem Statement #

Given a string, find the length of the longest substring in it with no more than K distinct characters.

Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".

Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".

Hint: Sliding Window pattern

Note: Use a HashMap to remember the frequency of each character we have processed. 

*/

import java.util.HashMap;
import java.util.Map;

class LongestSubString {
    public static int findStringLength(String str, int k) {
        if (str == null || str.length() == 0 || str.length() < k) {
            throw new IllegalArgumentException();
        }
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charFreq.put(rightChar, charFreq.getOrDefault(rightChar, 0) + 1);
            while (charFreq.size() > k) {
                char charLeft = str.charAt(windowStart);
                charFreq.put(charLeft, charFreq.get(charLeft) - 1);
                if (charFreq.get(charLeft) == 0) {
                    charFreq.remove(charLeft);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String str = "ABDBBC";//"araaci";
        int k = 2;
        System.out.println(findStringLength(str, k));
    }
}