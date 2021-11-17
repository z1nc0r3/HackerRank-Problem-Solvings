import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int number = n;
        int counter = 0;

        while (n > 0){
            int digit = n % 10;
            if (digit != 0 && number % digit == 0)
                counter++;
            n /= 10;
        }

        System.out.println(counter);
    }
}
