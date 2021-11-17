import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int total = 0;

        for (int i=0; i<n; i++){
            int sum = 0;

            for (int j=0; j<3; j++){
                sum += read.nextInt();
            }

            if (sum >= 2)
                total++;
        }
        System.out.println(total);
    }
}
