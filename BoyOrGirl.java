import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String userName = read.next();

        ArrayList<Character> letters = new ArrayList<>();

        for (int i=0; i<userName.length(); i++){
            if (!letters.contains(userName.charAt(i)))
                letters.add(userName.charAt(i));
        }

        System.out.println((letters.size()%2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
