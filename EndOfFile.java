import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String word = "";

        while (read.hasNext()){
            word = read.nextLine();
            System.out.println(word);
        }
    }
}
