public class BeautifulDays{

    public static int findRevRec(int number, int answer){
        if (number == 0)
            return answer;
        else
            return findRevRec(number/10, (answer*10)+(number%10));
    }

    public static void main(String[] args){
        int i = 30;
        int j = 53;
        int k = 6;
        int numCounter = 0;
        int beautifulCounter = 0;

        int[] numberList = new int[j-i+1];
        int[] revList = new int[numberList.length];

        for (int x=i; x<=j; x++){
            numberList[numCounter] = x;
            numCounter++;
        }

        for (int y=0; y<revList.length; y++){
            revList[y] =  findRevRec(numberList[y], 0);
            if ((Math.abs(numberList[y] - revList[y])) % k == 0)
                beautifulCounter++;
        }

        System.out.println(beautifulCounter);
    }
}