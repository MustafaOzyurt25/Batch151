package day21datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02_Tekrar {

    public static void main(String[] args) {

        LocalDate lcdt = LocalDate.now();
        System.out.println(lcdt);


        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("M/dd/yyy - hh:mm");

       String formattedlcdt = myDateTimeFormatter.format(lcdt);
        System.out.println(formattedlcdt);
    }
}