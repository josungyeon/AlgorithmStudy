package tm;

import java.util.*;
/**
 *
 * 한번 더 풀어보는 문제
 *
 * Created by sungyeon on 07/02/2019.
 */
public class StackMaxWeight2 {
    public static List<Stack<Integer>> doDo() {
        final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);

        List<Stack<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int sum = 0;
        for (int i = 0; i < elements.size(); i++) {
            sum += elements.get(i);
            stack.push(elements.get(i));

            if (sum >= 20) {
                stack.pop();
                result.add(stack);
                stack = new Stack<>();

                i--;
                sum = 0;
            }

            if (i == elements.size() - 1) {
                result.add(stack);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(doDo());
    }
}
