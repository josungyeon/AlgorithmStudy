package codility;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.util.stream.Stream;

public class Solution2 {
    public String solution(int A, int B) {
        String[] abc = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(abc);

        Stack<String> strA = new Stack<>();
        Stack<String> strB = new Stack<>();
        for (int i = 0; i < A; i++) {
            strA.push("a");
        }
        for (int i = 0; i < B; i++) {
            strB.push("b");
        }

        String result = "";
        if (A > B) {
            //a 부터 시작
            result = strA.pop();
        } else {
            result = strB.pop();
        }

        while (strA.empty() && strB.empty()) {
            
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 sut = new Solution2();

    }
}