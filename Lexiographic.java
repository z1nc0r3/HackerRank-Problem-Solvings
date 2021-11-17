import java.util.Arrays;

public class Lexiographic {
    public static void main(String[] args){
        String a = "lasith";
        String b = "manujitha";

        String[] list = {a, b};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (list[0].equals(a))
            System.out.println("no");
        else
            System.out.println("yes");

        System.out.println(b.compareTo(a));
    }
}
