/* Longest Substring with Same Letters after Replacement (hard)

Problem Statement #

Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters
with any letter, find the length of the longest substring having the same letters after replacement.

Input: String="abbfcb", k=2
Output: 5
Explanation: Replace  'f' and 'c' with 'b' to have a longest repeating substring "bbbbb".

Hint: Sliding Window pattern

*/
package SubstringSameLetters;

import java.util.*;

public class LongestSubstringSameLetters {
    public static int LongestSubstringSame(String str, int k) {
        int windowStart = 0, maxLength = 0, repeatCount = 0;
        Map<Character, Integer> FreqCount = new HashMap<>();
        if (str == null || str.length() == 0 || str.length() < k) {
            throw new IllegalArgumentException();
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            // Create a HashMap
            FreqCount.put(rightChar, FreqCount.getOrDefault(rightChar, 0) + 1);
            // count the frequency of the current element in the HashMap
            repeatCount = Math.max(repeatCount, FreqCount.get(rightChar));
            // Sliding the window if true
            if (windowEnd - windowStart + 1 - repeatCount > k) {
                char leftChar = str.charAt(windowStart);

                FreqCount.put(leftChar, FreqCount.get(leftChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abbfcb";
        int k =2;
        System.out.println(LongestSubstringSame(str, k));
    }

}