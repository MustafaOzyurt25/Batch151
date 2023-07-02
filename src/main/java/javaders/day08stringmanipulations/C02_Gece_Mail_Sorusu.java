package javaders.day08stringmanipulations;

import java.util.Scanner;


public class C02_Gece_Mail_Sorusu {
    public static void main(String[] args) {


        /*
Kullanicidan email adresini girmesini isteyin,
Asagidaki kurallara gore kullanicinin
girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi /*\n" +
                "Kullanicidan email adresini girmesini isteyin,\n" +
                "Asagidaki kurallara gore kullanicinin\n" +
                "girdigi email adresini kontrol ediniz.\n" +
                "       i)mail adresi \"gmail\" icermeli\n" +
                "       " +
                "ii)Space characteri mail'de olmamali\n" +

                "       iii)mail adresinde buyuk harf olmamali\n" +

                "       iv)En az bir tane noktalama isareti bulunmali\nverniz");

        String mail = input.nextLine(); // Aerhjh652@
        boolean first = mail.contains("gmail");
        System.out.println("gmail icermeli = " + first);
        boolean second = !mail.contains(" ");
        System.out.println("space olmmali = " + second);
        boolean NoUpperCase = mail.replaceAll("[a-z0-9]", "").
                replaceAll("[\\p{Punct}]", "").replaceAll(" ", "").length() == 0;
        System.out.println("NoUpperCase =" + NoUpperCase);

        boolean isTherePunct = mail.replaceAll("[^\\p{Punct}]", "").length() > 0;
        System.out.println("isTherePunct = " + isTherePunct);

    }
}
