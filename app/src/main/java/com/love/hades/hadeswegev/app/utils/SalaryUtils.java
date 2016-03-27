package com.love.hades.hadeswegev.app.utils;

/**
 * Created by Hades on 16/3/26.
 */
public class SalaryUtils {
    /**
     * 工资
     * 获取剩余天数的算法
     *
     *
     * @return
     */
    public static String getEndDay(){
        int curDays = CalendarUtils.getInstance().getDay();
        if(curDays >= APPParams.SEND_SALARY_DAYS){
            int currentMonthDays = DateUtils.getMonthsDays(CalendarUtils.getInstance().getYear(),
                    CalendarUtils.getInstance().getMonth());
            int leftDays = currentMonthDays - curDays;
            return leftDays + APPParams.SEND_SALARY_DAYS+"";
        }else{
            int endDays = APPParams.SEND_SALARY_DAYS - curDays;
            return endDays+"";
        }
    }


}
