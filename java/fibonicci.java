// The Fibonacci numbers, commonly denoted F(n) form a sequence, 
// called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
//  starting from 0 and 1. That is,

// F(0) = 0,   F(1) = 1
// F(N) = F(N - 1) + F(N - 2), for N > 1.
// Given N, calculate F(N).

//import java.util.HashMap; // import the HashMap class

class Fib_fn {

  public static int fib(int N) {
    int a = 0, b = 1, c, i;
    if (N == 0)
      return 0;
    if (N == 1)
      return 1;
    // return fib(N-1) + fib(N-2);

    for (i = 2; i <= N; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return b;

  }

  public static void main(String args[]) {
    int target = 7;
    System.out.println(fib(target));
  }
}
