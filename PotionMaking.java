import java.util.Scanner;

public class PotionMaking {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i=0; i<t; i++) {
            int k = read.nextInt();
            int a = k, b = 100 - k;

            for (int j=k; j>=2; j--){
                if (a%j==0 && b%j==0){
                    a /= j;
                    b /= j;
                }
            }

            System.out.println(a + b);
        }
    }
}