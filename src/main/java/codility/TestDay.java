package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 7. 8..
 */
public class TestDay {

    static public int rectangularMapTest(int[][] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (((j<a[i].length - 1)&&(a[i][j] == a[i][j+1])) || ((i<a.length-1)&&(a[i][j] == a[i+1][j]))) {
                    // pass!
                } else if (((i > 0)&&(a[i][j] == a[i-1][j])) || ((j>0)&&(a[i][j] == a[i][j-1]))) {
                    result++;
                } else { // 같은 숫자가 없을 경우
                    result++;
                }
            }
        }

        return result;
    }

    static public int jamesScheduleTest(String s) {
        int resultMinutes = 0;
        String[] strArr = s.split("\n");

        List<Schedule> sList = new ArrayList<>();

        for (String str: strArr) {
            String[] date = str.split(" ");
            String[] min = date[1].split("-");

            Integer gap = Integer.parseInt(min[0].split(":")[0]) * 60 + Integer.parseInt(min[0].split(":")[1]);
            System.out.println(date[0] + "=" + min[0].split(":")[0] + ", " + min[0].split(":")[1] + " gap? " + gap);

            Schedule schedule = new Schedule();
            schedule.setDay(date[0]);
//            schedule.setStartMin();
            schedule.setEndMin(Integer.parseInt(min[0].split(":")[0]));
            sList.add(schedule);
        }

        return resultMinutes;
    }

    static class Schedule {
        String day;
        int startMin;
        int endMin;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public int getStartMin() {
            return startMin;
        }

        public void setStartMin(int startMin) {
            this.startMin = startMin;
        }

        public int getEndMin() {
            return endMin;
        }

        public void setEndMin(int endMin) {
            this.endMin = endMin;
        }
    }

    static public int evenMaxNum() {
        int[] a = {-6, -91, 1011, -100, 84, -22, 0, 1, 473}; // 84
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2 == 0) && (max < a[i])) {
                max = a[i];
            }
        }
        System.out.println(max);

        return max;
    }

    static public int maxArrayNumber(int[] b) {
        int maxNum = 0;
        int negativeCnt = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                maxNum += b[i];
            } else if (b[i] < 0 && maxNum != 0) {
                list.add(maxNum);
                maxNum = 0;
            } else if (b[i] < 0) {
                negativeCnt++;
            }

            if ((i == b.length - 1) && (b[i] > 0)) {
                list.add(maxNum);
            }
        }

        int max = 0;
        for (Integer a : list) {
            if (max < a) max = a;
        }

        if (negativeCnt == b.length) return -1;

        return max;
    }

    public static int nTree(int[] a) {
        int result = 0;

        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a, 0, b, 0, i);
            System.arraycopy(a, i + 1, b, i, a.length - 1 - i);

            if (compareArray(b)) {
                result++;
            }
        }
//        System.arraycopy(a, 0, b, 0, 1);
//        System.arraycopy(a, 2, b, 1, 2);

        System.out.println("result=" + result);

        return result;
    }

    private static boolean compareArray(int[] arr) {
        int[] arrClone = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrClone[i]) {
                return false;
            }
        }
        return true;
    }

    public static int demo(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

        Integer maxNum = Collections.max(list);

        if (maxNum < 0) return 1;

        Arrays.sort(A);

        int minNum = A[0];
        for (int i = 1; i < A.length; i++) {
            if (minNum + 1 < A[i]) {
                minNum += 1;
            } else {
                minNum = A[i];
            }
        }

        if (minNum == A[A.length - 1]) return A[A.length - 1] + 1;
        else return minNum;
    }

    public static void solution(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i % 2 == 0) {
                stringBuilder.append("Codility");
            }

            if (i % 3 == 0) {
                stringBuilder.append("Test");
            }

            if (i % 5 == 0) {
                stringBuilder.append("Coders");
            }

            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
