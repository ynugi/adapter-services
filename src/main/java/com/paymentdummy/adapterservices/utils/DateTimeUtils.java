package com.paymentdummy.adapterservices.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Slf4j
public class DateTimeUtils {

    static SimpleDateFormat formatter;
    static Date date;

    public static String DateTimeConverter(String timeString, String oldPattern, String newPattern){

        formatter = new SimpleDateFormat(oldPattern);
        try {
            date = formatter.parse(timeString);
        } catch (ParseException e) {
            log.error(e.getMessage());
        }

        return new SimpleDateFormat(newPattern).format(date);

    }

    public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static String convertYearMonthToString(YearMonth yearMonth, String format){
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern(format);
        return yearMonth.format(outputFormat);
    }
}
