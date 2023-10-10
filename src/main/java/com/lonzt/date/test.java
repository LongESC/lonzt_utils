package com.lonzt.date;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @projectName: lon_utils
 * @package: com.lon.utils.date
 * @className: test
 * @author: LONZT
 * @description: TODO
 * @date: 2023/10/9 17:20
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
        String day2 = format.format(d);
        System.out.println("方法六，当前时间前七天："+day2);

        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("方法六，当前时间过去一个月："+mon);

        //过去三个月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -3);
        Date m3 = c.getTime();
        String mon3 = format.format(m3);
        System.out.println("方法六，当前时间过去三个月："+mon3);

        //过去一年
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date y = c.getTime();
        String year = format.format(y);
        System.out.println("方法六，当前时间，过去一年："+year);

    }
}
