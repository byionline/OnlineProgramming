import java.util.*;

public class binary {
  static void convert(int n) {
    int[] arr = new int[1000];
    int i = 0;
    while (n > 0) {
      arr[i] = n % 2;

      n = n / 2;
      i++;
    }
    Collections.reverse(Arrays.asList(arr));
    System.out.println(Arrays.asList(arr));

  }

  public static void main(String[] args) {
    int N = 4;
    convert(N);
  }

}
