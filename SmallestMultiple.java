public class SmallestMultiple {

        static int gcd(int a, int b)
        {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        static int findGCD(int arr[], int n)
        {
            int result = 0;
            for (int element: arr){
                result = gcd(result, element);

                if(result == 1)
                {
                    return 1;
                }
            }

            return result;
        }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        System.out.println(findGCD(arr,n));
    }
}
