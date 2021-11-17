import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String first = read.nextLine().toLowerCase();
        String second = read.nextLine().toLowerCase();

        if (first.compareTo(second) < 0)
            System.out.println(-1);
        else if (first.compareTo(second) > 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
