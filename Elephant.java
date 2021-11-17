import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int steps = 0;

        for (int i=5; i>=0; i--){
            steps += x/i;
            x %= i;
            if (x == 0)
                break;
        }

        System.out.println(steps);
    }
}
