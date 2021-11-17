import java.util.Scanner;

public class I_love_Vindhya {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int amazing = 0;

        int max = read.nextInt();
        int min = max;

        for (int i=1; i<n; i++){
            int x = read.nextInt();

            if (x > max) {
                amazing++;
                max = x;
            }
            else if (x < min){
                amazing++;
                min = x;
            }
        }

        System.out.println(amazing);
    }
}
