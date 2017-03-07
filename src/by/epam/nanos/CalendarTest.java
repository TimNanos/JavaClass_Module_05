package by.epam.nanos;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    private GregorianCalendar d;

    public CalendarTest(){
        this.d = new GregorianCalendar();
    }

    public void printMonth(int month){
        d.set(Calendar.MONTH, month);
        d.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        System.out.println(Month.of(month + 1));
        System.out.println("Вс Пн Вт Ср Чт Пт Сб");
        for(int i = Calendar.SUNDAY; i < weekday; i++) {
            System.out.print("   ");
        }

        do
        {
            int day = d.get(Calendar.DAY_OF_MONTH);
            if(day < 10) {
                System.out.print(" ");
            }
            System.out.print(day);
            if (day == new GregorianCalendar().get(Calendar.DAY_OF_MONTH) && month == new GregorianCalendar().get(Calendar.MONTH)) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            if(weekday == Calendar.SATURDAY) {
                System.out.println();
            }
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }while (d.get(Calendar.MONTH) == month);

        if(weekday != Calendar.SUNDAY) {
            System.out.println();
        }
        System.out.println();
    }
}
