package SmallestSubarray;

/**
 * Given an array of positive numbers and a positive number ‘S’, find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0, if no such subarray exists.
 * 
 * Input: [2, 1, 5, 2, 3, 2], S=7 Output: 2 Explanation: The smallest subarray
 * with a sum great than or equal to '7' is [5, 2].
 * 
 * Hint: Sliding Window of size ‘k’.
 * 
 */

public class SmallestSubarray {
    public static int findSubarray(int k, int[] arr) {
        int windowStart = 0, windowSum = 0, minLength = Integer.MAX_VALUE; // Integer.MAX_VALUE define infinity value
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            while (windowSum >= k) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;

            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        int k = 7;
        int[] arr = { 2, 1, 5, 2, 3, 2 };
        System.out.println(findSubarray(k, arr));
    }
}