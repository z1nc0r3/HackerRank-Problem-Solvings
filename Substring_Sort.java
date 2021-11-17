import java.util.Arrays;

public class Substring_Sort {
    public static void main(String[] args){
        String name = "welcometojava";
        int k = 3;
        int length = name.length()-k+1;
        String[] list = new String[length];

        for (int i=0; i<length; i++){
            list[i] = name.substring(i, i+k);
            System.out.println(list[i]);
        }

        for (int j=0; j<list.length; j++){
            for (int i=0; i<list.length-1; i++) {
                if (list[i].compareTo(list[i + 1]) < 0) {
                    String temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(list));
    }
}
