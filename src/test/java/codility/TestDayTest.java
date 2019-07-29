package codility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 7. 26..
 */
public class TestDayTest {
    @Test
    public void test1() {
        int[][] a = new int[7][3];
        a[0][0] = 5;
        a[0][1] = 4;
        a[0][2] = 4;
        a[1][0] = 4;
        a[1][1] = 3;
        a[1][2] = 4;
        a[2][0] = 3;
        a[2][1] = 2;
        a[2][2] = 4;
        a[3][0] = 2;
        a[3][1] = 2;
        a[3][2] = 2;
        a[4][0] = 3;
        a[4][1] = 3;
        a[4][2] = 4;
        a[5][0] = 1;
        a[5][1] = 4;
        a[5][2] = 4;
        a[6][0] = 4;
        a[6][1] = 1;
        a[6][2] = 1;

        int result = TestDemo.rectangularMapTest(a);
        System.out.println("result = " + result);
        assertEquals(11, result);
    }

    @Test
    public void testJamesScheduleTest() {
//        String s = "Sun 10:00-20:00\n" +
//                "Fri 05:00-10:00\n" +
//                "Fri 16:30-23:50\n" +
//                "Sat 10:00-24:00\n" +
//                "Sun 01:00-04:00\n" +
//                "Sat 02:00-06:00\n" +
//                "Tue 03:30-18:15\n" +
//                "Tue 19:00-20:00\n" +
//                "Wed 04:25-15:14\n" +
//                "Wed 15:14-22:40\n" +
//                "Thu 00:00-23:59\n" +
//                "Mon 05:00-13:00\n" +
//                "Mon 15:00-21:00";

        String s = "Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:30-23:50\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:30-21:00\n";

        System.out.println(JamesSchedule.jamesScheduleTest(s));
    }

    @Test
    public void testEvenMaxNum() {
        TestDemo.evenMaxNum();
    }

    @Test
    public void testMaxArrayNumber() {
//        int[] b = {1,2,-3,4,5,-6};
//        int[] b = {-8,3,0,5,-3,12};
//        int[] b = {-1, -3, -4 ,-5};
//        int[] b = {0,0,0,0,0};
        int[] b = {-1, 2 ,1, 2, 0, 2, 1, -3, 4, 3, 0, -1};
        int a = TestDemo.maxArrayNumber(b);
        System.out.println("testMaxArrayNumber = " + a);
    }

    @Test
    public void testNTree() {
//        int[] a = {1,2,3,4,5,6,6,7, 8};
        int[] a = {3,4,5,4};  // return 2
        TestDemo.nTree(a);
    }

    @Test
    public void testDemo() {
//        int[] a = new int[]{1,2,3};
        int[] a = new int[]{1,3,6,4,1,2};

        int result =  TestDemo.demo(a);
        System.out.println(result);
    }

    @Test
    public void test111() {
        TestDay.solution(24);
    }

    @Test
    public void test4444() {
//        int[] A = {5,2,4,6,3,7};
        int[] A = {5,2,4,6,3};
//        System.out.println(TestDay4.test4solution(A));
        System.out.println(TestDay4.test4AnotherSolution(A));
    }

    @Test
    public void test222() {
//        int[] A = {2,2,3,4,3,3,2,2,1,1,2,5};
//        int[] A = {-3, -3}; //1
//        int[] A = {2, 4};   //2
        int[] A = {2,2,3};  //2
        System.out.println(TestDay2.test2solution(A));
    }

    @Test
    public void test3() {
        System.out.println(TestDay2.solution3("(())"));
    }
}
