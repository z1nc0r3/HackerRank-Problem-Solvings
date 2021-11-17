import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int k = read.nextInt();
        int n = read.nextInt();
        int w = read.nextInt();

        int cost = 0;

        for (int i=1; i<=w; i++)
            cost += i;

        int money = cost*k - n;

        System.out.println((money > 0 ? money : 0));
    }
}