package kakao;

import java.util.*;

/**
 * (2018년)KAKAO BLIND RECRUITMENT 오픈채팅방
 * Created by sungyeon on 2018. 11. 1..
 */
public class OpenChating {

    static final String USER_ACTION_ENTER = "Enter";
    static final String USER_ACTION_LEAVE = "Leave";
    static final String USER_ACTION_CHANGE = "Change";
    static final String ENTER_MESSAGE = "%s님이 들어왔습니다.";
    static final String LEAVE_MESSAGE = "%s님이 나갔습니다.";

    private Map<String, String> getUidMap(String[] record) {
        Map<String, String> uidMap = new HashMap<String, String>();

        for (String str: record) {
            String[] target = str.split(" ");

            if (USER_ACTION_ENTER.equals(target[0]) || USER_ACTION_CHANGE.equals(target[0])) {
                uidMap.put(target[1], target[2]);
            }
        }

        return uidMap;
    }

    private String printResultByOne(String nickname, String type) {
        if (USER_ACTION_LEAVE.equals(type)) {
            return String.format(ENTER_MESSAGE, nickname);
        } else if (USER_ACTION_ENTER.equals(type)) {
            return String.format(LEAVE_MESSAGE, nickname);
        }

        return null;
    }

    public String[] solution(String[] records) {
        Map<String, String> uidMap = getUidMap(records);
        List<String> result = new ArrayList<String>();

        for (String record: records) {
            String[] target = record.split(" ");

            if (USER_ACTION_ENTER.equals(target[0]) || USER_ACTION_LEAVE.equals(target[0])) {
                result.add(printResultByOne(uidMap.get(target[1]), target[0]));
            }
        }

        String[] answer = new String[result.size()];
        result.toArray(answer);
        return answer;
    }
}
