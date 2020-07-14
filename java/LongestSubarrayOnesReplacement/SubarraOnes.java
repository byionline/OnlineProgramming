/* 
Longest Subarray with Ones after Replacement (hard)

Problem Statement #

Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, 
find the length of the longest contiguous subarray having all 1s.

Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
Output: 6
Explanation: Replace the '0' at index 5 and 8 to have the longest contiguous subarray of 1s having length 6.

Hint: Sliding Window pattern

 */
package LongestSubarrayOnesReplacement;

import java.util.*;

public class SubarraOnes {
    public static int SubArrayWtihOne(int k, int[] arr) {
        int windowStart = 0, maxLength = 0, repeatCount = 0;

        Map<Integer, Integer> FreqCount = new HashMap<>();

        if (arr == null || arr.length == 0 || arr.length < k) {
            throw new IllegalArgumentException();
        }

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int rightChar = arr[windowEnd];
            // Create a HashMap
            FreqCount.put(rightChar, FreqCount.getOrDefault(rightChar, 0) + 1);
            // count the frequency of the current element in the HashMap
            repeatCount = Math.max(repeatCount, FreqCount.get(rightChar));
            // Sliding the window if true
            if (windowEnd - windowStart + 1 - repeatCount > k) {
                int leftChar = arr[windowStart];

                FreqCount.put(leftChar, FreqCount.get(leftChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = { 0, 1, 1, 0, 1, 0, 1, 1, 0 };
        System.out.println(SubArrayWtihOne(k, arr));
    }

}