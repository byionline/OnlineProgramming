package Fruits_into_Baskets;

/*
Given an array of characters where each character represents a fruit tree, 
you are given two baskets and your goal is to put maximum number of fruits in each basket. 
The only restriction is that each basket can have only one type of fruit.

You can start with any tree, but once you have started you can’t skip a tree. 
You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.

Write a function to return the maximum number of fruits in both the baskets.

Input: Fruit=['A', 'B', 'C', 'A', 'C']
Output: 3
Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

Hint: Sliding Window pattern

Same as Longest SubString with K Distinct Characters with K =2 fixed as only two basket we have


 */
import java.util.HashMap;
import java.util.Map;

public class MaximumFruits {
    public static int countFruit(char[] arr) {
        int windowStart = 0, maxCount = 0;
        Map<Character, Integer> freqCount = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            freqCount.put(arr[windowEnd], freqCount.getOrDefault(arr[windowEnd], 0) + 1);
            while (freqCount.size() > 2) {
                freqCount.put(arr[windowStart], freqCount.get(arr[windowStart]) - 1);
                if (freqCount.get(arr[windowStart]) == 0) {
                    freqCount.remove(arr[windowStart]);
                }
                windowStart++;
            }
            maxCount = Math.max(maxCount, windowEnd - windowStart + 1);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        char[] arr = { 'A', 'B', 'D', 'B', 'B', 'C' };//{ 'A', 'B', 'C', 'A', 'C' };
        System.out.println(countFruit(arr));
    }
    
}