package hackerank;

/**
 * Created by sungyeonjo on 2019. 6. 9..
 */
public class TimeConversion {

    static String timeConversion(String s) {
        if (s.substring(8).equals("PM")) {
            return String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 8);
        }

        return s.substring(0, 8);
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        String result = timeConversion(s);

        System.out.println(result);
    }
}
