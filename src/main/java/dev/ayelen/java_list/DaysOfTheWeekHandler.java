package dev.ayelen.java_list;

import java.util.ArrayList;
import java.util.List;

public class DaysOfTheWeekHandler {
    ArrayList<String> daysOfTheWeekList = new ArrayList <>();

    public void createList() {
        daysOfTheWeekList.add("Monday");
        daysOfTheWeekList.add("Tuesday");
        daysOfTheWeekList.add("Wednesday");
        daysOfTheWeekList.add("Thursday");
        daysOfTheWeekList.add("Friday");
        daysOfTheWeekList.add("Saturday");
        daysOfTheWeekList.add("Sunday");
    }

    public List<String> getDays(){
        return daysOfTheWeekList;
    }
}
