public class Strange_Advertising {

    static int LikedPeople(int people, int days, int sum){
        if (days == 1)
            return sum;
        else{
            people = (people/2) * 3;
            return LikedPeople(people, days-1, sum+(people/2));
        }
    }

    public static void main(String[] args){
        System.out.println(LikedPeople(5, 5, 2));
    }
}
