package hackerank;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 6. 8..
 */
public class FraudulentActivityNoti {

    static int activityNotifications(int[] expenditure, int d) {
        int arrayLength = expenditure.length - d;
        int total = 0;

        // d 갯수씩 리스트 묶어서, 그 중 mid값 구해놓기
        // if (num >= 2 * mid) 성립된다면, total 값 +1 하기
        for (int i = 0; i < d; i++) {

        }

        for (int i = 0; i < arrayLength; i++) {

            int mid = 0;
            int num = 0;
            for (int j = 0; j < d; j++) {
//                expenditure[j]
            }
            // mid값과 num 값 비교해서
            if (num >= 2 * mid) total += 1;
//            expenditure[i]   // i, i+1, i+2, i+3, i+4 // 총 d번 회전..
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] expenditure = {2, 3, 4, 2, 3, 6, 8, 4, 5};

//        int result = activityNotifications(expenditure, 5);
//        System.out.println(result);

        int i = 3;
        double d = 2.8;
        double num = 4.0;
        String str = "123";


        System.out.println(d + num);


    }
}
