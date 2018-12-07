package tm;

import java.util.*;

/**
 * Q1.

 다음 array는 물건의 중량이다. Array의 순서대로 물건을 상자에 담되, 중량이 20을 넘지 않도록 상자를 분할하는 출력 함수를 만드시오.

 예) 9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2

 결과 )
 9 7
 6 6 4 3
 4 5 3 4 3
 4 1 2

 * Created by sungyeon on 06/12/2018.
 */
public class StackMaxWeight {

    public static List<Stack<Integer>> doDo() {
        final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);

        List<Stack<Integer>> result = new ArrayList<Stack<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();

        int sum = 0;
        for (int index = 0; index < elements.size(); index++) {
            sum += elements.get(index);

            if (sum > 20) {
                index--;
                sum = 0;
                result.add(stack);
                stack = new Stack<Integer>();

            } else {
                stack.push(elements.get(index));
                if (index == elements.size() - 1) {
                    result.add(stack);
                }
            }
        }

        return result;
    }
}
