import java.util.Arrays;

public class makeAnagram {
    public static void main(String[] args){
        String a = "abccde";
        String b = "aabeed";
        String alphebet = "abcdefghijklmnopqrstuvwxyz";

        char[] aList = a.toCharArray();
        char[] bList = b.toCharArray();
        char[] alphabetList = alphebet.toCharArray();
        int[] aCounter = new int[26];
        int[] bCounter = new int[26];

        int difference = 0;

        for (char x : aList){
            for (int i=0; i<26; i++){
                if (alphabetList[i] == x)
                    aCounter[i]++;
            }
        }
        for (char y : bList){
            for (int i=0; i<26; i++){
                if (alphabetList[i] == y)
                    bCounter[i]++;
            }
        }

        for (int i=0; i<26; i++){
            difference += Math.abs(aCounter[i] - bCounter[i]);
        }

        System.out.println(Arrays.toString(aCounter));
        System.out.println(Arrays.toString(bCounter));
        System.out.println(difference);
    }
}
