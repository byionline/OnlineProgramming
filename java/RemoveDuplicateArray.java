import java.util.Arrays;

// Remove Duplicates from an Array

// Example 1:

// Given nums = [1,1,2],

// output nums = {1,2}

// Example 2:

// Given nums = [0,0,1,1,1,2,2,3,3,4],

// output nums = [0,1,2,3,4]

public class RemoveDuplicateArray {

  public static int duplicates(int[] b) {
    Arrays.sort(b);
    if (b.length == 0) {
      return 0;
    }
    int k = 0;
    int[] temp = new int[b.length];
    for (int j = 0; j < b.length - 1; j++) {
      if (b[j] != b[j + 1]) {

        temp[k++] = b[j];

      }

    }
    temp[k++] = b[b.length - 1];
    // Modify original array
    for (int i = 0; i < k; i++) {
      b[i] = temp[i];
    }

    return k; // Return no of unique elements
  }
  // Time complexity : O(N) for above method

  public static void main(String[] args) {
    // int[] b = { 0, 0, 1, 3, 1, 4, 2, 3, 2, 1 };
    int[] b = { 1, 2, 1, 1 };
    System.out.println(duplicates(b));
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}