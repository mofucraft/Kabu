package com.yiorno.kabu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DataManagement {

    public static void checkDate() {

        Date day1,day2,today;
        String todayStr;

        Date now = new Date();
        SimpleDateFormat daySDF = new SimpleDateFormat("dd");
        todayStr = daySDF.format(now);

        try {

            day1 = daySDF.parse("01");
            today = daySDF.parse(todayStr);

            boolean spoil = today.equals(day1);

            if(spoil == true){

                Random rand = new Random();
                rand.nextInt(10);

            } else if(spoil == false){

            }


        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
