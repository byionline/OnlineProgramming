import java.util.*;

public class primeFactor {
  static void factor(int n) {
    // HashSet for getting unique numbers from the sets
    HashSet<Integer> hs = new HashSet<Integer>();
    for (int i = 2; i < n; i++) {
      while (n % i == 0) {
        System.out.println(i); // prime factor
        hs.add(i); // add to the HashSet

        n = n / i;
      }

    }
    if (n > 2) {
      System.out.println(n); // Last number as prime factor
      hs.add(n);
    }
    // return 0;
    System.out.println(hs.size()); // get unique prime
    // int size = hs.size();
    // return size;

  }

  public static void main(String[] args) {
    int N = 12476;
    factor(N);
  }

}