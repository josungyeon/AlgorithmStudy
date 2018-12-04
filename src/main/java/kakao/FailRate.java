package kakao;

/**
 * Created by sungyeon on 2018. 11. 6..
 * Kakao 실패율 solution
 *
 * N	stages	                    result
 * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
 */
public class FailRate {

    public int[] solution(int N, int[] stages) {
        double[] failRate = {};

        int index = 0;
        int totalCnt = stages.length; // 분모

        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) count++;
            }
            failRate[index] = count / totalCnt;
            index++;

            totalCnt = totalCnt - count;
        }

        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        FailRate failRate = new FailRate();

        failRate.solution(N, stages);
    }
}
