import java.util.Scanner;

public class BitPP {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int x = 0;

        for (int i=0; i<n; i++){
            String statement = read.next();
            if (statement.contains("++"))
                x++;
            if (statement.contains("--"))
                x--;
        }

        System.out.println(x);
    }
}
