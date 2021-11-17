import java.util.Scanner;

public class WrongSubstraction {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();

        for (int i=0; i<k; i++){
            if (n%10 == 0)
                n /= 10;
            else
                n -= 1;
        }

        System.out.println(n);
    }
}
