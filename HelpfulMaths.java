import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String summation = read.nextLine().replace("+", "");

        for (int i=0; i<summation.length(); i++){
            numbers.add(Integer.parseInt(Character.toString(summation.charAt(i))));
        }

        Collections.sort(numbers);
        StringBuilder result = new StringBuilder();
        while (numbers.size() > 1){
            result.append(numbers.get(0)).append("+");
            numbers.remove(0);
        }
        result.append(numbers.get(0));

        System.out.println(result);
    }
}