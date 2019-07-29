package hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//
//
//    class ATest {
//        static List<Integer> rotateArray(List<Integer> a, Integer rotateNumber) {
//            List<Integer> rotatedList = new ArrayList<>();
//            if (rotateNumber != 0) {
//                if (rotateNumber > a.size()) {
//                    rotateNumber = rotateNumber % a.size();
//                }
//                List<Integer> notRotatedList = a.subList(rotateNumber, a.size());
//                List<Integer> rotateTargetList = new ArrayList<>();
//                for (int i = 0; i <= rotateNumber - 1; i++) {
//                    rotateTargetList.add(a.get(i));
//                }
//
//                rotatedList.addAll(notRotatedList);
//                rotatedList.addAll(rotateTargetList);
//                return rotatedList;
//            }
//
//            return a;
//        }
//
//        static Integer maxIndex(List<Integer> arr, Integer max) {
//            Integer maxIndex = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (arr.get(i) == max)
//                    maxIndex = i;
//            }
//            return maxIndex;
//        }
//
//    /*
//     * Complete the 'getMaxElementIndexes' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER_ARRAY rotate
//     */
//
//        public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
//            // Write your code here
//            Integer max = 0;
//            for (int i = 0; i < a.size(); i++) {
//                if (max < a.get(i))
//                    max = a.get(i);
//            }
//
//            List<Integer> indiceArray = new ArrayList<>();
//            for (int i = 0; i < rotate.size(); i++) {
//                indiceArray.add(maxIndex(rotateArray(a, rotate.get(i)), max));
//            }
//
//            return indiceArray;
//
//        }
//
//    }
//
//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int aCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
//                try {
//                    return bufferedReader.readLine().replaceAll("\\s+$", "");
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            })
//                    .map(String::trim)
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            int rotateCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> rotate = IntStream.range(0, rotateCount).mapToObj(i -> {
//                try {
//                    return bufferedReader.readLine().replaceAll("\\s+$", "");
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            })
//                    .map(String::trim)
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            List<Integer> result = Result.getMaxElementIndexes(a, rotate);
//
//            bufferedWriter.write(
//                    result.stream()
//                            .map(Object::toString)
//                            .collect(joining("\n"))
//                            + "\n"
//            );
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
//
