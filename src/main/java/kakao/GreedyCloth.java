package kakao;

/**
 * ex)
 * n = 5, lost=[2,4], reserve=[1,3,5] return=5
 * n = 5, lost=[2,4], reserve=[3]     return=4
 *
 * Created by sungyeonjo on 2019. 2. 10..
 */
public class GreedyCloth {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        for (int i = 0; i < lost.length; i++) {
            boolean rent = false;
            int j = 0;
            while(!rent) {
                if (j == reserve.length)    break;
                if (lost[i] == reserve[j] - 1) {
                    rent = true;
                    reserve[j] = -1;
                } else if (lost[i] == reserve[j] + 1) {
                    rent = true;
                    reserve[j] = -1;
                } else if (lost[i] == reserve[j]) {
                    rent = true;
                    reserve[j] = -1;
                } else {
                    j++;
                }
            }

            if (!rent) answer--;
        }

        return answer;
    }

    public static int[] getChangedArray(int[] lost, int index) {
        //선점된 배열은 다시 재배치해야함
        int[] newArray = new int[lost.length - 1];
        int j = 0;
        for (int i = 0; i < lost.length; i++) {
            if (i != index) {
                newArray[j] = lost[i];
                j++;
            }
        }
        return newArray;
    }

}
