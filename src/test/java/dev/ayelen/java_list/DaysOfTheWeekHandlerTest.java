package dev.ayelen.java_list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.CoreMatchers.is;

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

    @Test
    @DisplayName("getSize returns the number of items in daysOfTheWeekList")
    void testGetSize() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        //When
        int length = daysOfTheWeekHandler.getSize();
        //Then
        assertThat(length, equalTo(7));
    }

    @Test
    @DisplayName("deleteDay deletes a day from the list")
    void testDeleteDay() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        //When
        daysOfTheWeekHandler.deleteDay("Wednesday");
        //Then
        assertThat(daysOfTheWeekHandler.daysOfTheWeekList, not(contains("Wednesday")));
    }

    @Test
    @DisplayName("getSpecificDay gets a day from the list")
    void testGetSpecificDay() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        //When
        String day = daysOfTheWeekHandler.getSpecificDay("Wednesday");
        //Then
        assertThat(day, is("Wednesday"));
    }

    @Test
    @DisplayName("checkExistence checks if a day is on the list")
    void testCheckExistence() {
        //Given
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        //When
        boolean existence = daysOfTheWeekHandler.checkExistence("Wednesday");
        //Then
        assertThat(existence, is(true));
    }

    @Test
    @DisplayName("sortAbc orders the items alphabetically")
    void testSortAbc() {
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        daysOfTheWeekHandler.createList();
        daysOfTheWeekHandler.sortAbc();
        List<String> sortedList = daysOfTheWeekHandler.daysOfTheWeekList;
        assertThat(sortedList, containsInRelativeOrder( "Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday"));
    }

    @Test
    @DisplayName("emptyList deletes all the items on the list")
    void testEmptyList() {
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        ArrayList<String> list = daysOfTheWeekHandler.daysOfTheWeekList;
        daysOfTheWeekHandler.createList();
        daysOfTheWeekHandler.emptyList();
        assertThat(list, is(empty()));
    }  
}
