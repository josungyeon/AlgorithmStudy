package tm;

/**
 * Q2.

 int 형 숫자를 하나 입력받아 1인 비트 개수를 세는 매서드를 작성하세요.
 단 Integer.toBinaryString 또는 Interger.toString 함수를 사용하지 않고 구현합니다.

 Ex) 입력 7 -> 0111
 결과 : 3

 * Created by sungyeon on 06/12/2018.
 */
public class BitCalculator {

    public static int countBits(int number) {
        int count = 0;

        while (number != 1) {
            int remain = number % 2;
            number = number / 2;

            if (remain == 1) count++;
        }

        count++;

        return count;
    }
}
