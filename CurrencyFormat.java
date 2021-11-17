import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args){
        double price = 123242.23;

        Locale inr = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india = NumberFormat.getCurrencyInstance(inr);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(us.format(price));
        System.out.println(india.format(price));
        System.out.println(china.format(price));
        System.out.println(france.format(price));

    }
}
