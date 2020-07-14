class travellingCost {
  public static int findcost(int N, int[] cost) {
    int c = 0;
    for (int i = 0; i < N; i++) {
      c += cost[i];
    }
    return c;

  }

  public static void main(String[] args) {
    int N = 3;
    int[] cost = { 15, 3, 5 };
    System.out.println(findcost(N, cost));

  }
}