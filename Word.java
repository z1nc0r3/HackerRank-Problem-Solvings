import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String word = read.next();
        String lower = word.toLowerCase();
        int count = 0;

        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == lower.charAt(i))
                count++;
        }

        System.out.println(count >= word.length() - count ? lower : word.toUpperCase());
    }
}
