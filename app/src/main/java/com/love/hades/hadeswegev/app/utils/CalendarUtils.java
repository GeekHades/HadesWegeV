package com.love.hades.hadeswegev.app.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Hades on 16/3/27.
 */
public class CalendarUtils {

    private static CalendarUtils instance;
    private final Calendar mCalendar;

    private CalendarUtils(){
        mCalendar = Calendar.getInstance();
    }

    public static CalendarUtils getInstance(){
        if(instance == null){
            synchronized (CalendarUtils.class){
                if(instance == null){
                    instance = new CalendarUtils();
                }
            }
        }
        return instance;
    }

    public static final String FORMAT_1 = "yyyy-MM-dd";

    public String getYouWantTime(long time,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String currentTime = sdf.format(mCalendar.getTime());
        return currentTime;
    }

    public int getYear(){
        int year = mCalendar.get(Calendar.YEAR);
        return year;
    }

    public int getMonth(){
        // 0代表1月，11代表12月
        int month = mCalendar.get(Calendar.MONTH) + 1;
        LogUtils.d(LogTAG.HADES," month= "+month);
        return month;
    }

    public int getDay(){
        int day = mCalendar.get(Calendar.DAY_OF_MONTH);
        LogUtils.d(LogTAG.HADES," current day= "+day);
        return day;
    }

}
