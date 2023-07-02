package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01_Tekrar {
    public static void main(String[] args) {

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);


        System.out.println(myCurrentTime.getHour());
        System.out.println(myCurrentTime.plusMinutes(10));

        System.out.println(myCurrentTime.minusSeconds(30).plusMinutes(5));
        System.out.println(myCurrentTime.getNano());

        // Zaman formati nasil degistirilir:

        DateTimeFormatter dtfmy = DateTimeFormatter.ofPattern("hh-mm-ss ");

        System.out.println(dtfmy.format(myCurrentTime));

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);  // 2023-03-21
      DateTimeFormatter d = DateTimeFormatter.ofPattern("YYYY/MM/dd");

        System.out.println(d.format(myCurrentDate));

        LocalDate localDateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));  // 2023-03-21
        System.out.println(localDateInTokyo);
        LocalTime localTimeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localTimeInTokyo);  // 15:26:14.598617500
        LocalTime localTimeInParis = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(localTimeInParis); // 07:29:00.224471400
    }
}
