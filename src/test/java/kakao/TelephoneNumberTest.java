package kakao;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 전화번호 목록 접두어 여부 테스트
 *
 * 접두어가 없다면 true, 접두어가 없다면 false 반환
 * Created by sungyeon on 12/12/2018.
 */
public class TelephoneNumberTest {
    private TelephoneNumber sut = new TelephoneNumber();

    @Test
    public void test() {
        String[] phoneBook = {"119", "97674223", "1195524421"};

        assertFalse(sut.solution(phoneBook));
    }

    @Test
    public void test2() {
        String[] phoneBook = {"911", "97625999", "91125426"};

        assertFalse(sut.solution(phoneBook));
    }

    @Test
    public void test3() {
        String[] phoneBook = {"113", "12340", "123440", "12345", "98346"};

        assertTrue(sut.solution(phoneBook));
    }
}
