import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int[] marks = new int[n];
        int pass = 0;

        for (int i=0; i<n; i++){
            marks[i] = read.nextInt();
        }
        for (int x : marks){
            if (x >= marks[k-1] && x > 0)
                pass++;
        }
        System.out.println(pass);
    }
}
