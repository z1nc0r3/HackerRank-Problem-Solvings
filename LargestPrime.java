import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        long n = read.nextLong();

        for (long j = (long) Math.sqrt(n); j>=2; j--) {
            boolean isPrime = false;
            for (long i = 2; i <= j; i++) {
                if (j != i && j % i == 0) {
                    isPrime = false;
                    break;
                }
                else if (i == j) {
                    isPrime = true;
                }
            }

            if (isPrime && n%j == 0) {
                System.out.println(j);
                break;
            }
        }

    }
}
