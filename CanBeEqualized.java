import java.util.ArrayList;

public class CanBeEqualized {
    public static void main(String[] args){



        int n = 3;
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        first.add("pqqs");
        first.add("abbc");
        first.add("zyz");

        second.add("pqrs");
        second.add("cccc");
        second.add("zyx");



        for (int i=0; i<n; i++){
            String x = first.get(i);
            String y = second.get(i);


            if (x.length() != y.length())
                result.add("NO");
            else {
                boolean done =false;
                for (int j = 0; j < x.length(); j++) {
                    String s = x;
                    String d = x;

                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(j, y.charAt(j));
                    s = sb.toString();
                    d = x.replace(x.charAt(j), y.charAt(j));

                    System.out.println(s + " , " + d + " - " + y);
                    if (s.equals(y) || d.equals(y)) {
                        done = true;
                        break;
                    }
                }
                if (done)
                    result.add("YES");
                else
                    result.add("NO");
            }

        }

        System.out.println(result.toString());
    }
}
