package com.example.mybatis.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {
    public static void main(String []args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStr = simpleDateFormat.format(date);
        String str = "this is a test_";

        //System.out.println(simpleDateFormat.parse(dateStr).getTime());
       // System.out.println(str+date.getTime());

        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.SECOND,0);
//        calendar.set(Calendar.MILLISECOND,0);

        Long timestamp = new Long(1555900639);

        calendar.setTimeInMillis(timestamp*1000);

        calendar.set(Calendar.SECOND,0);
        calendar.add(Calendar.MINUTE,3);

        System.out.println(calendar.getTime());
        for (int i=1;i<=10;i++){
            calendar.add(Calendar.MINUTE,-1);
            System.out.println(calendar.getTime());
        }
    }
}
