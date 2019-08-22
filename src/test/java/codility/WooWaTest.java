package codility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 8. 21..
 */
public class WooWaTest {
    @Test
    public void test1() {
        WooWaTest1 sut = new WooWaTest1();
        assertThat(sut.solution(2, 3, new int[] {0, 0, 1, 1, 2}), is("IMPOSSIBLE"));
        assertThat(sut.solution(3, 2, new int[] {2, 1, 1, 0, 1}), is("11100,10001"));
        assertThat(sut.solution(2, 2, new int[] {2, 0, 2, 0}), is("1010,1010"));
        assertThat(sut.solution(1, 1, new int[] {1, 0, 0, 1}), is("1000,0001"));
        assertThat(sut.solution(0, 0, new int[] {0}), is("0,0"));
        assertThat(sut.solution(0, 0, new int[] {1}), is("IMPOSSIBLE"));
        assertThat(sut.solution(0, 1, new int[] {1}), is("0,1"));
        assertThat(sut.solution(1, 0, new int[] {1}), is("1,0"));
        assertThat(sut.solution(2, 2, new int[] {2,2}), is("11,11"));
        assertThat(sut.solution(2, 3, new int[] {2,2}), is("IMPOSSIBLE"));
    }

    @Test
    public void test2() {
        String S = "my.song.mp3 11b\n"
                + "greatSong.flac 1000b\n"
                + "not3.txt 5b\n"
                + "video.mp4 200b\n"
                + "game.exe 100b\n"
                + "mov!e.mkv 10000b";

        WooWaTest2 sut = new WooWaTest2();
        System.out.println(sut.solution(S));

        assertThat(sut.solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmovie.mkv 10000b"), is("music 1011b\nimages 0b\nmovies 10200b\nother 105b"));
        assertThat(sut.solution("my.song.mp3 1b"), is("music 1b\nimages 0b\nmovies 0b\nother 0b"));
        assertThat(sut.solution("my.A0^&'@{}[],$=!-#()%.+~_song.mp3 1b"), is("music 1b\nimages 0b\nmovies 0b\nother 0b"));
        assertThat(sut.solution("my.A0^&'@{}[],$=!-#()%.+~_song.dd 1b"), is("music 0b\nimages 0b\nmovies 0b\nother 1b"));
    }

    @Test
    public void test3() {
        WooWaTest3 sut = new WooWaTest3();
//        int[] A = {3,2,-2,5,-3};
//        System.out.println(sut.solution(A));
//
        int[] B = new int[100000];
        for (int i = 0; i < 100000; i++) {
            B[i] = -1000001;
        }
        System.out.println(sut.solution(B));
//
//        int[] C = {1,2,4,-3};
//        System.out.println(sut.solution(C));
//
        int[] D = {2,-2,2,3,4};
        System.out.println(sut.solution(D));

//        int[] E = {1,1,0,0}; // 0
//        System.out.println(sut.solution(E));
//
        assertThat(sut.solution(new int[]{3, 2, -2, 5, -3}), is(3));
        assertThat(sut.solution(new int[]{1, 1, 2, -1, 2, -1}), is(1));
        assertThat(sut.solution(new int[]{1, 2, 3, -4}), is(0));
        assertThat(sut.solution(new int[]{-100000000, 100000000}), is(100000000));
        assertThat(sut.solution(new int[]{-1, 1, 1, 0, 0}), is(1));
        assertThat(sut.solution(new int[]{0, 0}), is(0));
        assertThat(sut.solution(new int[]{0, 0, 1}), is(0));
        assertThat(sut.solution(new int[]{0, 0, 1, -1}), is(1));
        assertThat(sut.solution(new int[]{0, 0, -1, 1}), is(1));
        assertThat(sut.solution(new int[]{1, -1, 0, 0}), is(1));
        assertThat(sut.solution(new int[]{-1, 1, 0, 0}), is(1));
        assertThat(sut.solution(new int[]{1, 1, 0, 0}), is(0));
        assertThat(sut.solution(new int[]{-2, 2, 2, 3, 4}), is(2));
    }

    @Test
    public void test4() {
        int[] a = {1,3,2,1};
        int[] b = {4,2,5,3,2};
        WooWaTest4 sut = new WooWaTest4();
        System.out.println(sut.solution(a, b));

        int[] a2 = {1,3,2,1};
        int[] b2 = {4,2,5,3,2};

        assertThat(sut.solution(new int[]{1, 3, 2, 1}, new int[]{4, 2, 5, 3, 2}), is(2));
        assertThat(sut.solution(new int[]{4, 3, 2, 1}, new int[]{4, 4, 5, 5, 6, 6}), is(4));
        assertThat(sut.solution(new int[]{4, 5, 6}, new int[]{4, 3, 2}), is(4));
        assertThat(sut.solution(new int[]{4}, new int[]{4}), is(4));
        assertThat(sut.solution(new int[]{4}, new int[]{0}), is(-1));
        assertThat(sut.solution(new int[]{2, 1}, new int[]{3, 3}), is(-1));

    }
}
