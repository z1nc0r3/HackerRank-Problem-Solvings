public class SaveThePrisoner {


    private static int starts = 3;
    private static int n = 3;

    public static void main(String[] args){
        int candy = 7 ;
        int k = n - (starts - 1);
        System.out.println(finder(k, candy, 1));
    }

    public static int finder(int k, int candy, int round){

        if (k < candy && round == 1)
            return finder(n, candy-k, round+1);
        else if (k < candy){
            return (candy%k == 0) ? k : (candy%k);
        }
        else if (round != 1)
            return candy;
        else
            return candy+(starts-1);
    }
}
