import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int m = read.nextInt();
        int n = read.nextInt();
        int area = m*n;

        System.out.println((int)Math.floor(area/2));

    }
}
