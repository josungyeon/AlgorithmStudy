package kakao;

/**
 * 해시 > 다른 전화번호에 하나의 전화번호로 접두어가 있다면 false, 없다면 true 반환
 * Created by sungyeon on 12/12/2018.
 */
public class TelephoneNumber {
    public boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (isPrefixForTelNumber(phone_book[i], phone_book[j])) return false;
                if (isPrefixForTelNumber(phone_book[j], phone_book[i])) return false;
            }
        }

        return true;
    }

    private boolean isPrefixForTelNumber(String string1, String string2) {
        return string1.startsWith(string2);
    }
}
