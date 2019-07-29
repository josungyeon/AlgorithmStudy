package hackerank;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by sungyeonjo on 2019. 6. 6..
 */
public class SampleTest1 {
    static String findNumber(List<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,1);

        String res = findNumber(arr, 5);

        System.out.println(res);

        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5);

        String res2 = findNumber(arr2, 1);

        System.out.println(res2);
    }

//    java 8
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> arrTemp = new ArrayList<>();
//
//        IntStream.range(0, arrCount).forEach(i -> {
//            try {
//                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<Integer> arr = arrTemp.stream()
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String res = findNumber(arr, k);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }

}
