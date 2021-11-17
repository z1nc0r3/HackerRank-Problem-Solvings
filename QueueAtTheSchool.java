import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int t = read.nextInt();
        read.nextLine();

        char[] list = read.nextLine().toCharArray();


        for (int i=0; i<t; i++){
            for (int j=0; j<n-1; j++){
                if (list[j] == 'B' && list[j+1] == 'G') {
                    swap(list, j);
                    j++;
                }
            }
        }

        String word = "";
        for (char x : list)
            word += Character.toString(x);

        System.out.println(word);
    }

    public static char[] swap(char[] list, int position){
        list[position] = 'G';
        list[position + 1] = 'B';

        return list;
    }
}