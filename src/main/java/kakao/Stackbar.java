package kakao;

import java.util.*;

public class Stackbar {
    public static void main(String[] args) {
        Stackbar stackbar = new Stackbar();

        System.out.println(stackbar.solution("()(((()())(())()))(())"));
    }

    public int solution(String arrangement) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int length = arrangement.length();

        for (int i = 0; i < length; i++) {
            if (arrangement.charAt(i) == '(') {
                stack.add(i);
            } else if (arrangement.charAt(i) == ')') {
                if (stack.size() > 0) {
                    stack.pop();
                    answer += stack.size();
                }
            }
        }

        return answer;
    }

}
