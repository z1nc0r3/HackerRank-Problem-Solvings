import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        String colors = read.next();

        int counter = 0;

        for (int i=1; i<colors.length(); i++){
            if (colors.charAt(i) == colors.charAt(i-1))
                counter++;
        }

        System.out.println(counter);
    }
}
