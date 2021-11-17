import java.util.Scanner;

public class VanyaAndFriends {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int h = read.nextInt();
        int width = 0;

        for (int i=0; i<n; i++){
            if (read.nextInt() > h)
                width += 2;
            else
                width++;
        }

        System.out.println(width);
    }
}