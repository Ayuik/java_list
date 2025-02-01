package dev.ayelen.java_list;

import java.util.ArrayList;
import java.util.Collections;
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

    public int getSize(){
        return daysOfTheWeekList.size();
    }

    public void deleteDay(String day){
        daysOfTheWeekList.remove(day);
    }

    public String getSpecificDay(String day){
        return day;
    }

    public boolean checkExistence(String day){
        return daysOfTheWeekList.contains(day);
    }

    public void sortAbc(){
        Collections.sort(daysOfTheWeekList);
    }

    public void emptyList(){
        daysOfTheWeekList.removeAll(daysOfTheWeekList);
    }

}
