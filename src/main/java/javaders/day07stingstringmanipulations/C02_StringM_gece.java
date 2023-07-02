package javaders.day07stingstringmanipulations;

import java.util.Scanner;

public class C02_StringM_gece {

    public static void main(String[] args) {

         /*
Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen paswordunuzu " +                                 // Aa123?.*
                "i) En az 8 karakterden olussun\n" +
                "        ii)Password space icermesin\n" +
                "        iii)En az 1 tane buyuk harf olsun\n" +
                "        iv) En az 1 tane kucuk harf olsun\n" +
                "        v) En az 1 tane sembol olsun\n" +
                "        vi) En az 1 tanede rakam olsun\n uygun olarak giriniz  ");

        String password = input.nextLine();

            // boolean first = password.length()>=0 ;
        boolean first  = password.length()>7;
        boolean second =  !password.contains(" ");  // contains("")====> icer            ! ====> icermesin
       boolean third = password.replaceAll("[^A-Z] ","").length()>0; //

        System.out.println("third = " + third);

         boolean fourth = password.replaceAll("[^a-z] ","").length()>0;  // method chain. metotlari
                                                                                          // yanyana ayni saturda yazmaya method cahoin deni

        boolean fifth = password.replaceAll("[A-Za-z0-9] ","").length()>0; // sembol kalsin

        boolean sixth  = password.replaceAll("[^0-9]" ,"").length()>0; //
        System.out.println(first&&second&&third&&fourth&&fifth&&sixth);
































    }
}
