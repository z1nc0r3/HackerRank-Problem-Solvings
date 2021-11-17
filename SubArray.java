import java.util.Scanner;

public class SubArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int count = 0;
        int[] list = new int[n];

        for (int i=0; i<n; i++){
            list[i] = read.nextInt();
        }

        for (int z=0; z<list.length; z++){
            for (int x = list.length - 1; x >= 0; x--) {
                int sum = 0;
                for (int y = z; y < list.length - x; y++) {
                    sum += list[y];
                }
                if (sum < 0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
