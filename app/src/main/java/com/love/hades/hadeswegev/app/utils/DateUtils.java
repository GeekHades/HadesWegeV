package com.love.hades.hadeswegev.app.utils;

/**
 * 日期
 *
 * Created by Hades on 16/3/26.
 */
public class DateUtils {

    /**
     * 获取当前月的天数
     *
     * @param year
     * @param months
     * @return
     */
    public static int getMonthsDays(int year,int months){
        switch (months){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return getFebruaryDays(year);
            default:
                return 30;
        }
    }


    /**
     * @param year
     * @return
     */
    public static int getFebruaryDays(int year){
        if(isSpecialYear(year))
            return 29;
        return 28;
    }

    /**
     * 是不是 润年
     *
     * @param year
     * @return
     */
    private static Boolean isSpecialYear(int year){
        if(year%100 == 0){
            if(year%4 == 0){
                LogUtils.d(LogTAG.HADES," 闰年");
                return true;
            }
        }else{
            if(year % 400 == 0){
                LogUtils.d(LogTAG.HADES," 不是 闰年");
                return true;
            }
        }
        return false;
    }





}
