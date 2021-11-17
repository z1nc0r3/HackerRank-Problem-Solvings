import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int counter = 0;

        while (a <= b){
            a *= 3;
            b *= 2;
            counter++;
        }

        System.out.println(counter);
    }
}
