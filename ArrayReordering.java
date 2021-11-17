import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReordering {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i=0; i<t; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int n = read.nextInt();
            int count = 0;

            for (int j=0; j<n; j++){
                list.add(read.nextInt());
            }

            for (int x=0; x<list.size()-1; x++){
                for (int y=x; y<list.size()-2; y++){
                    boolean div = list.get(x)%(2*list.get(y+1)) == 0;
                    boolean div2 = 2*list.get(y+1)%(list.get(x)) == 0;
                    if (list.get(y+1) != 1 && list.get(x) != 1 && div || div2)
                        count++;
                }
            }

            System.out.println(count);
        }
    }
}
