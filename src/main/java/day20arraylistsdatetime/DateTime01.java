package day20arraylistsdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {


        // icinde bulundugunuz zaman diliminde ki tarihi nasil aliri
        LocalDate mYCurrentDate = LocalDate.now();
        System.out.println(mYCurrentDate);   // 2023-03-15  sahsi bilfisayaradan veya cloud dan alir java

        int monthValue = mYCurrentDate.getMonthValue();
        System.out.println(monthValue); // 3


        int yearV = mYCurrentDate.getYear();
        int gun = mYCurrentDate.getDayOfMonth();

        System.out.println(yearV + " / " + gun);  //  2023 / 15


        // String monthName = String.valueOf(mYCurrentDate.getMonth());  // MARCH

        Month monthName = mYCurrentDate.getMonth();

        System.out.println(monthName);

        mYCurrentDate.getDayOfWeek();

        LocalDate s = mYCurrentDate.plusDays(5);
        System.out.println(mYCurrentDate.minusYears(5).minusMonths(7).minusDays(20)); // 2017-07-26

        System.out.println(mYCurrentDate.plusDays(10).plusMonths(10).plusYears(10)); // 2034-01-25

        //Enum; java da sabit degerleri depolamak icin kullanilir. Month bir Enum dir.
        // mesela AY isimleri , Gun isimleri, sehir isimleri, samanyolu galk. deki gezegen isimleri.


        LocalDate gokhanDob = LocalDate.of(1986, 6, 10);

        LocalDate fatihDob = LocalDate.of(1985, 2, 25);

        boolean r = fatihDob.isAfter(gokhanDob);  // false
        System.out.println(r);   // false

        boolean r1 = fatihDob.equals(gokhanDob);
        System.out.println(r1);  // false

        boolean r0 = fatihDob.isBefore(gokhanDob);

        System.out.println("r0 = " + r0);  // r0 = true


// EX : kkullaniicdan aldiginiz tarih gecmise aitse gecersiz tarih girdiniz mesaji veriniz
        // kkullaniicdan aldiginiz tarih gelecege aitse Zamani girebilirsiniz  mesaji veriniz


        Scanner scanner = new Scanner(System.in);
        System.out.println("pleae enter year, month, and day numbers in the given order ");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();


        LocalDate givenDate = LocalDate.of(year, month, day);  // bir tarih  objesini olusturduk

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println(givenDate + " invalid date");
        } else {
            System.out.println("Enter time for the ticket");
        }


        int lengthOfMonth = mYCurrentDate.lengthOfMonth();

        System.out.println(lengthOfMonth);


        // kullanicinin girdigi tarihin gun ismini bulan kodu bulunuz


        System.out.println("pleae enter year, month, and day numbers in the given order ");

        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();


        LocalDate date = LocalDate.of(y, m, d);

        System.out.println(date.getDayOfWeek());  // TUESDAY


    }
}
