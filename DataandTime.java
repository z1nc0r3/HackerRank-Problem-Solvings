import java.time.DayOfWeek;
import java.util.Calendar;

public class DataandTime {

    public static void main(String[] arga) {
        Calendar newCalendar = Calendar.getInstance();

        newCalendar.set(1998, 8, 14);
        int day = newCalendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);

        switch (day){
            case 1 :
                System.out.println("SUNDAY");
                break;
            case 2 :
                System.out.println("MONDAY");
                break;
            case 3 :
                System.out.println("TUESDAY");
                break;
            case 4 :
                System.out.println("WEDNESDAY");
                break;
            case 5 :
                System.out.println("THURSDAY");
                break;
            case 6 :
                System.out.println("FRIDAY");
                break;
            case 7 :
                System.out.println("SATURDAY");
                break;
        }
    }

}
