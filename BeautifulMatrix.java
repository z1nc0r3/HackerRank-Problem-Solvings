import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int location_row = 0;
        int location_col = 0;

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                matrix[i][j] = read.nextInt();
                if (matrix[i][j] == 1){
                    location_col = j+1;
                    location_row = i+1;
                }
            }
        }
        System.out.println(Math.abs(location_row-3) + Math.abs(location_col-3));
    }
}
