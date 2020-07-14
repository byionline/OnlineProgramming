// Given an array of integers, return indices of the two numbers such that 

// they add up to a specific target.

//You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.  
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

//import java.util.HashMap; // import the HashMap class
import java.util.*;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]) {
        int[] num = { 4, 13, 11, 15, 0, 17 };
        int target = 17;
        int[] a = twoSum(num, target);
        System.out.println(Arrays.toString(a));
    }
}
