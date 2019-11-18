import java.awt.*;
import java.util.Calendar;
public class Svr{
    public void skajiVr(){
        Calendar time1 = Calendar.getInstance();
        long t = time1.get(Calendar.HOUR_OF_DAY);
        if (22 <= t && t < 6) {
            System.out.println("сейчас ночь");
        }
        if (6 <= t && t < 12) {
            System.out.println("сейчас утро");
        }
        if (12 <= t && t < 18) {
            System.out.println("сейчас день");
        }
        if (18 <= t && t < 22) {
            System.out.println("сейчас вечер");
        }
    }
}

