import java.util.Arrays;

public class DustBin {
    public static void main(String[] args) {

        int[] ar = {4,1,2,3};

        Arrays.sort(ar);

        System.out.println(Arrays.toString(ar));

        String fi = Integer.toString(ar[ar.length-1]) + Integer.toString(ar[ar.length-2]);

        System.out.println(fi);

        //if (fi.contains(ar[ar.length-1]) && fi.contains(ar.length-2))
        System.out.println();

    }
}
