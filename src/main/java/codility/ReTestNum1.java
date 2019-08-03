package codility;

/**
 * ex) T = 7500 Then return "2h5m0s"
 *        T = 83643 Then return "23h14m3s"
 *
 * Created by sungyeonjo on 2019. 8. 3..
 */
public class ReTestNum1 {
    private static final int SECOND_PER_HOUR = 3600;
    private static final int SECOND_PER_MINUTE = 60;

    public static String solution3(int T) {
        int hour = T / SECOND_PER_HOUR;
        int restMinute = T - (hour * SECOND_PER_HOUR);
        int minute = restMinute / SECOND_PER_MINUTE;
        int second = T % SECOND_PER_MINUTE;

        return hour + "h" + minute + "m" + second + "s";
    }
}
