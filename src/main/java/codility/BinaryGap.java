package codility;

/**
 * 가장 큰 바이너리 갭 구하기
 * ex) 20 => 10100 , result = 1
 * ex) 529 => 1000010001 , resutl = 4
 *
 * Created by sungyeonjo on 2019. 4. 13..
 */
public class BinaryGap {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int oneCnt = 0;
        int totalGap = 0;
        boolean startSwitch = false;

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);

            if (!startSwitch && ch == '1') {
                startSwitch = true;
                if (oneCnt > totalGap) totalGap = oneCnt;
            } else if (startSwitch && ch == '0') {
                oneCnt++;
            } else if (startSwitch && ch == '1') {
                startSwitch = false;
            }
        }

        System.out.println("oneCnt : " + oneCnt);
        return totalGap;
    }

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        bg.solution(529);
    }
}
