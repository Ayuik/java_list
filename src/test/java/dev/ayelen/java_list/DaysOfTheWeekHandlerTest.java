package dev.ayelen.java_list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekHandlerTest {

    @Test
    @DisplayName("daysOfTheWeek is an instanceof List<String>")
    void testIsDaysOfTheWeekAListString() {
        //
        DaysOfTheWeekHandler daysOfTheWeekHandler = new DaysOfTheWeekHandler();
        //When
        //Then
        assertThat(daysOfTheWeek, instanceOf(List.class));
        
    }
    
}
