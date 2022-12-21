package org.example.datetime;

import javax.management.Query;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.Queue;

public class DateTest {

    public static void main(String[] args){
        //Основные типы данных
        LocalDateTime localDateTime = LocalDateTime.of(2023, 12, 20, 17, 39); //replace Timestamp
        LocalDate localDate = LocalDate.of(2022, 12, 19); //Date
        LocalDate localDateEnd = LocalDate.of(2022, 12, 25);
        LocalTime localTime = LocalTime.of(23, 40, 50); // Time
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of(ZoneId.SHORT_IDS.get("NET"))); // Calendar
        OffsetTime offsetTime = OffsetTime.of(localTime, ZoneOffset.UTC); // время + зона
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.UTC); // дата + время + зона
        Instant instant = Instant.now();// 2022-12-21T13:18:53.271634800Z or smth

        //Работа с периодами
        //Важно, что Period содержит не абсолютное значение, но значение, которое может быть, как больше, так и меньше нуля (в зависимости от даты)
        Period period = Period.between(localDate, localDateEnd); // year = 0, month = 0, day = 6
        Period period2 = Period.between(localDateEnd, localDate); // year = 0, month = 0, day = -6 (!)


        DateTimeFormatter dateTimeFormatterISO_LOCAL_DATE_TIME = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter dateTimeFormatterISO_LOCAL_DATE = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dateTimeFormatterISO_DATE = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dateTimeFormatterISO_OFFSET_DATE = DateTimeFormatter.ISO_OFFSET_DATE;
        DateTimeFormatter dateTimeFormatterISO_ZONED_DATE_TIME = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        DateTimeFormatter dateTimeFormatterISO_ORDINAL_DATE = DateTimeFormatter.ISO_ORDINAL_DATE;
        DateTimeFormatter dateTimeFormatterBASIC_ISO_DATE = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter dateTimeFormatterISO_INSTANT = DateTimeFormatter.ISO_INSTANT;

        //String dateStrISO_OFFSET_DATE = localDateTime.format(dateTimeFormatterISO_OFFSET_DATE); //Unsupported format
        //String dateStrISO_ZONED_DATE_TIME = localDateTime.format(dateTimeFormatterISO_ZONED_DATE_TIME); //Unsupported format
        //String dateStrISO_INSTANT = localDateTime.format(dateTimeFormatterISO_INSTANT); //Unsupported format
        String dateStrISO_LOCAL_DATE_TIME = localDateTime.format(dateTimeFormatterISO_LOCAL_DATE_TIME);//2023-12-20T17:39:00
        String dateStrISO_LOCAL_DATE = localDateTime.format(dateTimeFormatterISO_LOCAL_DATE); //2023-12-20
        String dateStrISO_DATE = localDateTime.format(dateTimeFormatterISO_DATE);//2023-12-20
        String dateStrISO_ORDINAL_DATE = localDateTime.format(dateTimeFormatterISO_ORDINAL_DATE); //2023-354
        String dateStrBASIC_ISO_DATE = localDateTime.format(dateTimeFormatterBASIC_ISO_DATE);

        DateTimeFormatter formatterFromLocalized = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); //only date
        DateTimeFormatter formatterFromLocalizedDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL);
        DateTimeFormatter formatterOfPattern = DateTimeFormatter.ofPattern("yyyy MMM dd");

        String strFormatterOfPattern = formatterOfPattern.format(localDateTime); //2023 дек. 20
        String strFormatterFromLocalized = formatterFromLocalized.format(localDateTime); // среда, 20 декабря 2023 г.
        //String strFormatterFromLocalizedDateTime = formatterFromLocalizedDateTime.format(localDateTime); // java.time.DateTimeException: Unable to extract ZoneId from temporal 2023-12-20T17:39
        TemporalAccessor temporalAccessorFromStr = formatterOfPattern.parse("2011 янв. 11"); //{},ISO resolved to 2011-01-11

        //LocalDateTime.of(2023, 12, 20, 17, 39).toLocalDate().compareTo(LocalDateTime.of(2023, 12, 17, 17, 39).toLocalDate())
        LocalDate localDateFromDateTime = localDateTime.toLocalDate();
        LocalTime localTimeFromDateTime = localDateTime.toLocalTime();
        //ChronoLocalDateTimeImpl chronoLocalDateTime;
        int diffBetweenDates =  localDateTime.compareTo(LocalDateTime.of(2023, 12, 20, 17, 40));
        //TemporalField field = new Runnable()
        //localDateTime.get() ??
        int tmp = 0;

    }
}
