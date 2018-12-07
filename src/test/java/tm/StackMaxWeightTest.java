package tm;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

/**
 * Created by sungyeon on 06/12/2018.
 */
public class StackMaxWeightTest {
    @Test
    public void testSolution() {
        List<Stack<Integer>> stackList = StackMaxWeight.doDo();
        for (Stack<Integer> stack : stackList) {
            for (Integer element : stack) {
                System.out.print(element.toString() + " ");
            }
            System.out.println();
        }
    }
}
