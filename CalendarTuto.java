import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarTuto {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar();
        calendar.set(1998, 7,14);

        String date = calendar.getTime().toString().substring(0,3);

        System.out.println(date);

        switch (date){
            case "Sun" :
                date = "SUNDAY";
                break;
            case "Mon" :
                date = "MONDAY";
                break;
            case "Tue" :
                date = "TUESDAY";
                break;
            case "Wed" :
                date = "WEDNESDAY";
                break;
            case "Thu" :
                date = "THURSDAY";
                break;
            case "Fri" :
                System.out.println("done");;
                break;
            case "Sat" :
                date = "SATURDAY";
                break;
        }
    }
}
