public class AngryProfessor {
    public static void main(String[] args){
        int n = 4;
        int k =3;
        int[] times = {0,-1, 2, 1};
        int counter = 0;

        for (int x : times){
            if (x <= 0)
                counter++;
        }

        System.out.println((counter >= 0) ? "NO" : "YES");

    }
}
