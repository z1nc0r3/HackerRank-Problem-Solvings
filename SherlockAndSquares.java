import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();

        int lower = (int) Math.ceil(Math.sqrt(a));
        int higher = (int) Math.floor(Math.sqrt(b));

        System.out.println(higher - lower + 1);
    }
}
