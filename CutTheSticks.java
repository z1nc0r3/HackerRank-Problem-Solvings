import java.util.ArrayList;
import java.util.Collections;

public class CutTheSticks {
    public static void main(String[] args){

        int[] list = {1,2,3,4,3,3,2,1};
        ArrayList<Integer> length = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        for (int x : list){
            num.add(x);
        }
        Collections.sort(num);

        while (num.size() > 0){
            length.add(num.size());
            int min = num.get(0);

            while (num.size() > 0 && num.get(0) == min)
                num.remove(0);

            for (int i=0; i<num.size(); i++)
                num.set(i, num.get(i)-min);
        }

        System.out.println(length.toString());
    }
}
