class SumBetween {
  // public static int sum(int i, int j, int[] A) {
  // int sum = 0;
  // for (int k = i; k <= j; k++) {
  // sum = sum + A[k];
  // }
  // return sum;

  // }
  // Solution above is Big O(N) Optimize it?

  public static int SumRange(int i, int j, int[] nums) {
    int[] sum;
    sum = new int[nums.length + 1];
    for (int k = 0; k < nums.length; k++) {
      sum[k + 1] = sum[k] + nums[k];
    }

    return sum[j + 1] - sum[i];
  }

  public static void main(String[] args) {
    int i = 3, j = 1;
    int[] B = { -2, 0, 3, -5, 2, -1 };
    System.out.println(SumRange(i, j, B));

  }
}