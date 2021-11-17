import java.util.ArrayList;

public class ClimbingLeaderboard {
    public static void main(String[] args){
        int n = 7;
        int m = 4;
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> player = new ArrayList<>();
        ArrayList<Integer> leaderboard = new ArrayList<>();
        ArrayList<Integer> newRank = new ArrayList<>();

        newRank = rank;

        int[] a = {100, 90, 90, 80, 75, 60};
        int[] b = {50, 65, 77, 90, 102};

        for (int x : a)
            rank.add(x);

        for (int x : b)
            player.add(x);

        for (int i=0; i<player.size(); i++) {
            rank.add(player.get(i));
            int position;

            int y = player.get(i);
            rank.removeIf(x -> x < y);

            for (int j = 1; j<rank.size(); j++) {
                if (rank.get(j - 1) == rank.get(j))
                    rank.remove(j);
            }

            leaderboard.add(rank.indexOf(player.get(i)) + 1);
            rank = newRank;
        }
        System.out.println(leaderboard.toString());
    }
}
