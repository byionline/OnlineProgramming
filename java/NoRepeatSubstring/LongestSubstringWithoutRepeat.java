/*
 * Problem Statement #

Given a string, find the length of the longest substring which has no repeating characters.
Input: String="araaci"
Output: 3
Explanation: The longest substring without any repeating characters is "aci".


 */
package NoRepeatSubstring;

import java.util.*;


public class LongestSubstringWithoutRepeat {
    public static int SubStringFn(String str) {
        int windowStart = 0, maxLength = 0;
        if (str.length() == 0 || str == null) {
            throw new IllegalArgumentException();
        }

        Map<Character, Integer> FreqRepeat = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if (FreqRepeat.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, FreqRepeat.get(rightChar) + 1);
            }
            FreqRepeat.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;

    }

    public static void main(String[] args) {

        String str = "araaci";
        System.out.println(SubStringFn(str));
    }

}