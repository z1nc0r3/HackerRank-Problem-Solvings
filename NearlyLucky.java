import java.util.Scanner;

public class NearlyLucky {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        long n = read.nextLong();
        int counter = 0;
        String number = Long.toString(n);

        for (int i=0; i<number.length(); i++){
            if (number.charAt(i) == '7' || number.charAt(i) == '4')
                counter++;
            if (counter > 8)
                break;
        }

        System.out.println(counter == 4 || counter == 7 ? "YES" : "NO" );
    }
}
