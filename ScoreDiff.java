import java.util.ArrayList;
import java.util.Collections;

public class ScoreDiff {

    public static ArrayList<Integer> reversed(ArrayList<Integer> arr){
        ArrayList<Integer> rev = new ArrayList<>();

        for (int i=arr.size()-1; i>=0; i--){
            rev.add(arr.get(i));
        }
        return rev;
    }

    public static void main(String[] args){
        ArrayList<Integer> numSeq = new ArrayList<>();

        numSeq.add(3);
        numSeq.add(6);
        numSeq.add(2);
        numSeq.add(3);
        numSeq.add(5);

        int n = numSeq.size();
        int sum = 0;
        int previous = numSeq.get(0);

        for (int i=1; i<=n; i++){
            if (previous%2 == 0){
                int x = numSeq.get(numSeq.size()-1);
                sum = (i%2 == 1) ? sum+x : sum-x;
            }
            else{
                int x = numSeq.get(0);
                sum = (i%2 == 1) ? sum+x : sum-x;
            }
            numSeq.remove(0);

        }
        System.out.println(numSeq);
        System.out.println(sum);
    }
}
