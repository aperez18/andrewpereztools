package andrewperez.date.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtilities {
    
    private SimpleDateFormat sdf;
    private Date temp;
    
    // Convert a Date or Calendar object to a formatted String
    public String getFormattedDate(Date unformattedDate, String format){
        sdf = new SimpleDateFormat(format);
        return sdf.format(unformattedDate);
    }
    
    public String getFormattedDate(Calendar unformattedCalendar, String format){
        sdf = new SimpleDateFormat(format);
        temp = unformattedCalendar.getTime();
        return sdf.format(temp);
    }
    
    public static void main(String[] args) {
        DateUtilities utils = new DateUtilities();
        Calendar cal = Calendar.getInstance();
        System.out.println(utils.getFormattedDate(cal, "M/d/yyyy hh:mm a"));
    }
}
