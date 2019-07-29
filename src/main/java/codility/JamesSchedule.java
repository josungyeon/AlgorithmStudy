package codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungyeonjo on 2019. 7. 29..
 */
public class JamesSchedule {
    static public int jamesScheduleTest(String s) {
        int resultMinutes = 0;
        String[] strArr = s.split("\n");

        List<Schedule> sList = new ArrayList<>();

        for (String str: strArr) {
            String[] date = str.split(" ");
            String[] min = date[1].split("-");

            Integer gap = Integer.parseInt(min[0].split(":")[0]) * 60 + Integer.parseInt(min[0].split(":")[1]);
            System.out.println(date[0] + "=" + min[0].split(":")[0] + ", " + min[0].split(":")[1] + " gap? " + gap);

            Schedule schedule = new Schedule();
            schedule.setDay(date[0]);
//            schedule.setStartMin();
            schedule.setEndMin(Integer.parseInt(min[0].split(":")[0]));
            sList.add(schedule);
        }

        return resultMinutes;
    }

    static class Schedule {
        String day;
        int startMin;
        int endMin;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public int getStartMin() {
            return startMin;
        }

        public void setStartMin(int startMin) {
            this.startMin = startMin;
        }

        public int getEndMin() {
            return endMin;
        }

        public void setEndMin(int endMin) {
            this.endMin = endMin;
        }
    }
}
