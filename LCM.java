import java.util.Arrays;

public class LCM {
    static int[] arr = {1, 2, 3, 4, 5, 10, 20, 35};
    public static void main(String[] args){
        System.out.println(findLCM(1));

    }

    public static int findLCM(int result){
        for (int i=2; i<40;){
            System.out.println(Arrays.toString(arr));
            int counter = 0;
            for (int x : arr){
                if (x%i == 0)
                    counter++;
                if (counter > 1)
                    break;
            }

            if (counter > 1){
                result *= i;
                for (int j=0; j<arr.length; j++){
                    arr[j] /= i;
                }
            }
            else
                i++;
            System.out.println(Arrays.toString(arr));
            System.out.println(counter);
        }

        return result;
    }
}
