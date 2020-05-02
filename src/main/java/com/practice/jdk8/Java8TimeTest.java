package com.practice.jdk8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author shihao.ma
 * @since 2020/5/1
 */
public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        System.out.println(localDate1.getYear() + "," + localDate1.getMonthValue() + "," + localDate1.getDayOfMonth());

        LocalDate localDate2 = LocalDate.of(2020, 2, 2);
        LocalDate localDate3 = localDate2.plusYears(3);
        System.out.println(localDate2);
        System.out.println(localDate3);
        //在指定日期之前，之后
        System.out.println(localDate2.isBefore(localDate3));
        System.out.println(localDate2.isAfter(localDate3));

        //plus：增加 minus：减少
        LocalDate localDate4 = localDate2.plus(2, ChronoUnit.WEEKS).minus(2, ChronoUnit.YEARS);
        System.out.println(localDate4);
        System.out.println("---------------------------------------");
        MonthDay monthDay2 = MonthDay.of(localDate2.getMonthValue(), localDate2.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(localDate2);
        System.out.println(monthDay1 + " " + monthDay2);
        if (monthDay1.equals(monthDay2)) {
            System.out.println("equals");
        } else System.out.println("not equals");
        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = localTime.plusHours(2).plusMinutes(23);
        System.out.println(localTime + " " + localTime2);
        //时钟
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        //获取当前时区
        System.out.println(clock.getZone());
        //获取所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> strings = new TreeSet<String>() {{
            addAll(availableZoneIds);
        }};
        strings.stream().forEach(System.out::println);
        //带有时区的时间对象
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);
        System.out.println("----------------------");
        // YearMonth
        YearMonth yearMonth = YearMonth.of(2020,5);
        System.out.println(yearMonth.lengthOfMonth());//当月有多少天
        System.out.println(yearMonth.lengthOfYear());//当年有多少天
        System.out.println(yearMonth.isLeapYear());//是否是闰年
        //两个日期的间隔（周期性的）
        Period period = Period.between(LocalDate.of(2019,3,22), LocalDate.now());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        //不带时区的标准UTC时间
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
