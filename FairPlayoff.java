import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i=0; i<t; i++){
            ArrayList<Integer> list = new ArrayList<>();

            for (int j=0; j<4; j++) {
                list.add(read.nextInt());
            }

            int first = Math.max(list.get(0), list.get(1));
            int second = Math.max(list.get(2), list.get(3));

            Collections.sort(list);
            list.remove(0);
            list.remove(0);

            if (list.contains(first) && list.contains(second))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
