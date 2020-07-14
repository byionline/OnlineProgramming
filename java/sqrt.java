//Arranging Coins
// You have a total of n coins that you want to form in a staircase shape, 
// where every k-th row must have exactly k coins.

// Given n, find the total number of full staircase rows that can be formed.

// n is a non-negative integer and fits within the range of a 32-bit signed integer.
// n = 5

// The coins can form the following rows:
// ¤
// ¤ ¤
// ¤ ¤

// Because the 3rd row is incomplete, we return 2.

// n = 8

// The coins can form the following rows:
// ¤
// ¤ ¤
// ¤ ¤ ¤
// ¤ ¤

// Because the 4th row is incomplete, we return 3.

///Solution

import java.lang.Math;

class Solution {
  public static int arrangeCoins(int n) {
    long result;
    result = (long) Math.sqrt(2 * (long) n);
    long sum = result * (result + 1) / 2;
    if (sum > n)
      return (int) result - 1;

    // int result = (int) Math.pow(n, 0.55);
    return (int) result;
  }

  public static void main(String[] args) {
    int target = 24;
    System.out.println(arrangeCoins(target));

  }
}