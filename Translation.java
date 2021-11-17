import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String one = read.nextLine();
        String two = read.nextLine();

        StringBuilder sb = new StringBuilder(two);
        System.out.println(one.equals(sb.reverse().toString()) ? "YES" : "NO");
    }
}
