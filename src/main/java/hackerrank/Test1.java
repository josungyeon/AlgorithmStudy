package hackerrank;

import java.util.*;

/**
 * k 코딩테스트 , 해커랭크 1번 문제
 * Simple Array Rotate Game
 *
 * Created by sungyeon on 10/06/2019.
 */
public class Test1 {
    static private int getMaxNum(List<Integer> arr) {
        int max = 0;
        for (Integer number: arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static private int getMaxIndex(List<Integer> originArr, int maxNum) {
        int idx = 0;
        for (int i = 0; i < originArr.size(); i++) {
            if (originArr.get(i) == maxNum) {
                idx = i;
            }
        }

        return idx;
    }

    static private List<Integer> getList(List<Integer> arr, int rotateNumber) {
        List<Integer> returnArray = new ArrayList<>();

        if (rotateNumber == 0) {
            return arr;
        } else {
            if (rotateNumber > arr.size()) {
                rotateNumber = rotateNumber % arr.size();
            }

            List<Integer> noRotateList = arr.subList(0, rotateNumber);
            List<Integer> rotateList = arr.subList(rotateNumber, arr.size());

            returnArray.addAll(rotateList);
            returnArray.addAll(noRotateList);

            return returnArray;
        }
    }

    static public List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        int maxNum = getMaxNum(a);

        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < rotate.size(); i++) {
            List<Integer> rotateList = getList(a, rotate.get(i));
            int index = getMaxIndex(rotateList, maxNum);
            indexList.add(index);
        }

        return indexList;
    }

    public static void main(String[] args) {
        // Test 예
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(3);
        array.add(5);

        List<Integer> rotate = new ArrayList<>();
        rotate.add(6);
        rotate.add(9);
        rotate.add(12);

        // 결과
        System.out.println(getMaxElementIndexes(array, rotate));
    }
}
