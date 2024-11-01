package com.novi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeekdayTest {

    @Test
    public void testNextDay() {
        assertEquals(Weekday.TUESDAY, Weekday.MONDAY.nextDay());
        assertEquals(Weekday.WEDNESDAY, Weekday.TUESDAY.nextDay());
        assertEquals(Weekday.THURSDAY, Weekday.WEDNESDAY.nextDay());
        assertEquals(Weekday.FRIDAY, Weekday.THURSDAY.nextDay());
        assertEquals(Weekday.SATURDAY, Weekday.FRIDAY.nextDay());
        assertEquals(Weekday.SUNDAY, Weekday.SATURDAY.nextDay());
        assertEquals(Weekday.MONDAY, Weekday.SUNDAY.nextDay());
    }

    @Test
    void testNextWorkDay() {
        assertEquals(Weekday.TUESDAY, Weekday.MONDAY.nextDay());
        assertEquals(Weekday.WEDNESDAY, Weekday.TUESDAY.nextDay());
        assertEquals(Weekday.THURSDAY, Weekday.WEDNESDAY.nextDay());
        assertEquals(Weekday.FRIDAY, Weekday.THURSDAY.nextDay());
        assertEquals(Weekday.MONDAY, Weekday.FRIDAY.nextWorkday());
        assertEquals(Weekday.MONDAY, Weekday.SATURDAY.nextWorkday());
        assertEquals(Weekday.MONDAY, Weekday.SUNDAY.nextWorkday());
    }

}