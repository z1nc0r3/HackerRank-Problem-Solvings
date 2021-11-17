import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(n);

        for (int i=0; i<n; i++){
            matrix.add(new ArrayList<>());
            }

        for (int i=0; i<n; i++){
            int d = read.nextInt();

            for (int j=0; j<d; j++){
                matrix.get(i).add(read.nextInt());
            }
        }

        int q = read.nextInt();
        for (int i=0; i<q; i++){
            try{
                System.out.println(matrix.get(read.nextInt() - 1).get(read.nextInt() - 1).toString());
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
