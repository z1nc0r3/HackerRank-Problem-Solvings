import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int q = read.nextInt();

        int[] rotated = new int[n];
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> queries = new ArrayList<>();
        ArrayList<Integer> toReturn = new ArrayList<>();

        for (int i=0; i<n; i++)
            a.add(read.nextInt());

        for (int i=0; i<q; i++)
            queries.add(read.nextInt());

        for (int x=0; x<queries.size(); x++) {
            System.out.println("count" + x);
            toReturn.add(x, (a.get((((queries.get(x) + (n - k)) % n) + n)%n)));
        }

        System.out.println(toReturn.toString());
    }
}
