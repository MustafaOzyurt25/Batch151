package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {
        //  anlik zamani nasil aliriz
        LocalTime mYCurrentTime = LocalTime.now();
        System.out.println(mYCurrentTime);  // 21:04:21.190080400


       int second= mYCurrentTime.getSecond();

        System.out.println(second);

        int nanos = mYCurrentTime.getNano();
        System.out.println(nanos);



      LocalTime next = mYCurrentTime.plusMinutes(20);

        System.out.println(next);// 21:31:12.975044400


        LocalTime next1 = mYCurrentTime.minusSeconds(30);
        System.out.println(next1);

// Zaman formati nasil degistirilir:

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss  a");

        String formattedmYCurrentTime= dtf1.format(mYCurrentTime);

        System.out.println(formattedmYCurrentTime);

        //Date formati nasil degistirilir:


        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);  // 2022-08-25


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

       String formattedMyCurrentDate = dtf2.format(myCurrentDate);

        System.out.println(formattedMyCurrentDate);  // 08/25/2022


        // Tarihi Gun/ Ayismi/ Yil 25/Aug/202


        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(d.format(myCurrentDate));  // 25/August/2022


        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);  // 2023-03-17
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));  // 2023-03-16
        System.out.println(dateInTashkent);



        // Koln de saat kac


       LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);  // 19:49:24.285052







    }
}
