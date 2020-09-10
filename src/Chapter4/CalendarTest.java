package Chapter4;

import java.util.*;
import java.text.DateFormatSymbols;
/**
 * Created by Administrator on 2020/9/10.
 */
public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        //今天是这个月的第几天
        int today = d.get(Calendar.DAY_OF_MONTH);
        //比实际少一个月 需要加一
        int month = d.get(Calendar.MONTH);
        //今天星期几 需要减一
        int weekday = d.get(Calendar.DAY_OF_WEEK);
        //周起始日
        int firstDayOfWeek = d.getFirstDayOfWeek();
        int indent = 0;
        System.out.println(today);
        System.out.println(month);
        System.out.println(weekday);
        System.out.println(firstDayOfWeek);

    }
}
