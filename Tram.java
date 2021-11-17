import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int max = 0;
        int people = 0;

        for (int i=0; i<n; i++){
            int out = read.nextInt();
            int in = read.nextInt();

            people += in - out;

            if (max < people)
                max = people;
        }

        System.out.println(max);
    }
}
