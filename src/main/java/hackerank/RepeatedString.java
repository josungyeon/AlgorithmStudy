package hackerank;

/**
 * Created by sungyeonjo on 2019. 6. 9..
 */
public class RepeatedString {
    static long repeatedString(String s, long n) {
        int aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        long result = (n/s.length()) * aCount;

        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                result += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

//        long result = repeatedString("aba", 10);        // 7
        long result = repeatedString("a", 1000);

        System.out.println(result);
    }

}
