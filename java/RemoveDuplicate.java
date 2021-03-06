import java.util.Arrays;

// Remove Duplicates from Sorted Array
// Given a sorted array nums, remove the duplicates in-place such that
// each element appear only once and return the new length.

// Do not allocate extra space for another array, you must do this 
// by modifying the input array in-place with O(1) extra memory.

// Example 1:

// Given nums = [1,1,2],

// Your function should return length = 2, with the first two elements
// of nums being 1 and 2 respectively.

// It doesn't matter what you leave beyond the returned length.

// Example 2:

// Given nums = [0,0,1,1,1,2,2,3,3,4],

// Your function should return length = 5, with the first five elements 
// of nums being modified to 0, 1, 2, 3, and 4 respectively.

// It doesn't matter what values are set beyond the returned length.

public class RemoveDuplicate {

  public static int duplicates(int[] b) {
    // Question says only sorted array are given as input but now we can
    // provide unsorted array too.
    Arrays.sort(b);
    if (b.length == 0) {
      return 0;
    }

    int i = 0;

    for (int j = 1; j < b.length; j++) {
      if (b[j] != b[i]) {
        i++;
        b[i] = b[j];

      }

    }
    return i + 1;
  }
  // Time complexity : O(N) for above method

  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 3, 1, 4, 2, 3, 2, 1 };
    // int[] arr = { 1, 2, 1, 1 };
    System.out.println(duplicates(arr));
  }
}