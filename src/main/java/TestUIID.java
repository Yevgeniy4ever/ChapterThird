import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Developer on 6/15/2017.
 */
public class TestUIID {
    public static void main(String[] args) {
        UUID testX = UUID.randomUUID();
        System.out.println(testX);
        UUID test = UUID.fromString("cb220a78-5d63-4c1b-94fe-8512c2467e9d");
        System.out.println(test);

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        long x = 100000000;
       // Timestamp stem = new Timestamp(x, null));



    }
}
