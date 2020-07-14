
class MinCostToReach {
  public static int cost(int[] arr, int n) {
    int sum = 0;

    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];

    }
    return sum;

  }

  public static void main(String[] args) {
    int[] cost = { 15, 5, 35, 3, 4 };
    int N = 3;
    System.out.println(cost(cost, N));

  }
}