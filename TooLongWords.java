import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
            String word = read.next();
            list[i] = word;
        }

        for (String word : list) {
            if (word.length() <= 10)
                System.out.println(word);
            else {
                System.out.print(word.charAt(0));
                System.out.print(word.length() - 2);
                System.out.print(word.charAt(word.length() - 1));
                System.out.println();
            }
        }
    }
}