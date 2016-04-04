package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnitecDayClassTimes {
    private static SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
    public static Date TIME_7_00AM;
    public static Date TIME_8_30AM;
    public static Date TIME_10_10AM;
    public static Date TIME_11_30AM;
    public static Date TIME_1_00PM;
    public static Date TIME_2_20PM;
    public static Date TIME_3_40PM;
    public static Date TIME_5_00PM;
    public static Date TIME_6_30PM;
    //TODO complete all times
    
    public final void initClassTimes() throws ParseException {
        TIME_7_00AM = formatter.parse("07:00");
        TIME_8_30AM = formatter.parse("08:30");
        TIME_10_10AM = formatter.parse("10:10");
        TIME_11_30AM = formatter.parse("11:30");
        TIME_1_00PM = formatter.parse("01:00");
        TIME_2_20PM = formatter.parse("02:20");
        TIME_3_40PM = formatter.parse("03:40");
        TIME_5_00PM = formatter.parse("05:00");
        TIME_6_30PM = formatter.parse("06:30");
    }
}
