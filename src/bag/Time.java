package bag;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by c on 2017/7/27.
 */
public class Time {
    public static void main(String[] args) {
        Date nowtime = new Date();
        System.out.println(nowtime);
        String s = String.format("%tA", nowtime);
        System.out.println(s);
    }
}
