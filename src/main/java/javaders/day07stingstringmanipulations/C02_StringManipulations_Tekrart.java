package javaders.day07stingstringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations_Tekrart {
    public static void main(String[] args) {

         /*
        Asagidaki kurallara gora kullanicinin girdigi password'u kontrol ediniz.t/f

        i) En az 8 karakterden olussun
        ii) pass. space icermesin
        iii) en az bir tane buyuk harf olsun
        iv) en az bir tane kucuk harf olsun
         v) en az bir tane sembol olsun
         vi) en az bir tane rakam olsun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen password giriniz " +
                "         i)   En az 8 karakterden olussun\n" +
                "        ii)  pass. space icermesin\n" +
                "       iii) en az bir tane buyuk harf olsun\n" +
                "        iv)  en az bir tane kucuk harf olsun\n" +
                "         v)   en az bir tane sembol olsun\n" +
                "        vi)   en az bir tane rakam olsun             ");

        String password = scanner.nextLine(); //= "AbN123+*/ 4r"

        boolean isLengthChrctr  = password.length()>7;
        // boolean isThereSpace  = password.replaceAll("[^ ]", "").length()>0;
        boolean isThereSpace  =! password.contains(" ");
        System.out.println("isThereSpace : " +isThereSpace );

        boolean isThereUpperCase =password.replaceAll("[^A-Z]","").length()>0;
        boolean isThereLowerCase =password.replaceAll("[^a-z]","").length()>0;
        boolean isThereSymbol =password.replaceAll("[a-zA-Z0-9]","").length()>0;
        boolean isThereNumber =password.replaceAll("[^0-9]","").length()>0;

        System.out.println(isLengthChrctr&isThereSpace&isThereUpperCase&isThereLowerCase &isThereSymbol&isThereNumber);
    }



}
