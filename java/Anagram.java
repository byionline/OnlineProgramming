import java.util.Arrays;

// Given two strings s and t , write a function to determine
// if t is an anagram of s.
// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
// Note:
// You may assume the string contains only lowercase alphabets.

class Anagram {
  public static boolean ischeck(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    char[] str1 = a.toCharArray();
    char[] str2 = b.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
  }
  // Time complexity : O(nlogn) for above method

  public static void main(String[] args) {
    String S1 = "hello";
    String S2 = "lohle";
    System.out.println(ischeck(S1, S2));
  }
}
