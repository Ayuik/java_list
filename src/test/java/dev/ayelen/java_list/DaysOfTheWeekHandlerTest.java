package dev.ayelen.java_list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.instanceOf;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekHandlerTest {

    @Test
    @DisplayName("daysOfTheWeekList is an instanceof ArrayList<String>")
    void testIsDaysOfTheWeekAListString() {
        //
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        //When
        ArrayList<String> list = daysOfTheWeekHandler.daysOfTheWeekList;
        //Then
        assertThat(list, instanceOf(ArrayList.class));
        
    }

    @Test
    @DisplayName("createList adds the days of the week to daysOfTheWeekList")
    void testCreateList() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        ArrayList<String> list = daysOfTheWeekHandler.daysOfTheWeekList;
        //When
        daysOfTheWeekHandler.createList();
        //Then
        assertThat(list, containsInAnyOrder("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));
    
    }

    @Test
    @DisplayName("getDays returns the days of the week")
    void testGetDays() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        //When
        List<String> days = daysOfTheWeekHandler.getDays();
        //Then
        assertThat(days, containsInAnyOrder("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    
    
}
