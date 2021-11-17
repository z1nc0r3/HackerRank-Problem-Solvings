import java.util.Arrays;
import java.util.Scanner;

public class ConsecutivePrime {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();

        for (int i=0; i<T; i++){

            double[] primeList = new double[10];
            int counter = 0;

            double Z = read.nextDouble();
            double min = Math.sqrt(Z);
            double lowLimit = Math.sqrt(min);

            for (double j=min-lowLimit; j<min+lowLimit; j++){

                for (double x=2; x<j/2; x++){

                }





            }

            System.out.println(Arrays.toString(primeList));
        }
    }
}
