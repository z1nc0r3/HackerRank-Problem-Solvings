import java.util.Scanner;

public class EqualPrize {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int q = read.nextInt();

        for (int i=0; i<q; i++){
            int n = read.nextInt();
            double sum = 0;

            for (int j=0; j<n; j++){
                sum += read.nextInt();
            }
            System.out.println((int) Math.ceil(sum/n));
        }
    }
}