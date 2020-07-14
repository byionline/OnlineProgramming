package MaximumSumSubArray;
// Given an array of positive numbers and a positive number ‘k’, 

// find the maximum sum of any contiguous subarray of size ‘k’.
// Input: [2, 1, 5, 1, 3, 2], k=3 
// Output: 9
// Explanation: Subarray with maximum sum is [5, 1, 3].

//Hint: Sliding Window of size ‘k’.

public class MaxSum {
    public static int findSum(int k, int[] arr) {
        int windowSum = 0, maxSum = 0, windowStart = 0; // start of window position
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // adding next length
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        System.out.println(findSum(k, arr));
    }
    
}