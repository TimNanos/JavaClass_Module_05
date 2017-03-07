package by.epam.nanos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Taks1 {
    Taks1(){
        System.out.println("Task 1");

        CalendarTest calendarTest = new CalendarTest();
        for (int i = 0; i < 12; i++) {
            calendarTest.printMonth(i);
        }
    }
}
