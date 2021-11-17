import java.util.Scanner;

public class EvenFibbo {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();

            for (long i = 1; fib(i) <= n; i++) {
                long x = fib(i);
                if (x % 2 == 0)
                    sum += x;
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    static long fib(long n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
