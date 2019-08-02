package codility;

/**
 * Created by sungyeonjo on 2019. 7. 27..
 */
public class TestDay2 {
    public static int solution(int[] A) {
        int result = 1;
        Status nextStatus;
        Status currentStatus = Status.FLAT;

        for (int i = 0; i < A.length - 1; i++) {
            nextStatus = getStatus(A, i, currentStatus);

            if (!nextStatus.equals(currentStatus)) {
                result++;
            }

            currentStatus = nextStatus;
        }
        return result;
    }

    private static Status getStatus(int[] A, int index, Status prevStatus) {
        if (A[index] < A[index + 1]) {
            return Status.UP;
        } else if (A[index] > A[index + 1]) {
            return Status.DOWN;
        }
        return prevStatus;
    }

    enum Status {
        UP, DOWN, FLAT
    }

}
