package test.t12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDateTime startDa = LocalDateTime.of(2024, 11,8,0,0);
        LocalDateTime endDateTime =LocalDateTime.of(2024, 12,31,0,0,0);
        long remainDay = startDa.until(endDateTime, ChronoUnit.DAYS);
        System.out.println(remainDay);


    }
}
