package problemsolving.sort;

import java.util.Arrays;

/**
 * Created by sungyeon on 2018. 10. 26..
 */
public class InsertionSort {

    public static void sorting() {
        int[] list = {4,6,1,3,5,2};
        int listSize = list.length;

        if (listSize <= 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int a : list)
            System.out.println(a);

        for (int i = 1; i < listSize; i++) {
            for (int j = i; j > 0 ; j--) {
                if (list[j] < list[j-1]) {
                    int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }

//        Arrays.sort(list);
        System.out.println("================");
        for (int a : list)
            System.out.println(a);
    }

    public static void main(String[] args) {
        InsertionSort.sorting();
    }
}
