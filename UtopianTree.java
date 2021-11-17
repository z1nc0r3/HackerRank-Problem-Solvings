public class UtopianTree {
    public static void main(String[] args){
        int height = 1;
        int cycles = 4;

        for (int i=1; i<=cycles; i++){
            if (i%2 == 1)
                height *= 2;
            else height++;
        }
        System.out.println(height);
    }
}
