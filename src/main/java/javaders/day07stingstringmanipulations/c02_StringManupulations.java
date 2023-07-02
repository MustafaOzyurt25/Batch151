package javaders.day07stingstringmanipulations;

import java.util.Scanner;

public class c02_StringManupulations {
    public static void main(String[] args) {

        /*
        Asagidaki kurallara gora kullanicinin girdigi password'u kontrol ediniz.

        i) En az 8 karakterden olussun
        ii) pass. space icermesin
        iii) en az bir tane buyuk harf olsun
        iv) en az bir tane kucuk harf olsun
         v) en az bir tane sembol olsun
         vi) en az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu ");

        String pwd = input.nextLine();

   // iii) en az bir tane buyuk harf olsun

        boolean isUpper = pwd.replaceAll("[^A-Z]","").length()>0;

       //  iv) en az bir tane kucuk harf olsun
        boolean isLower= pwd.replaceAll("[^a-z]","").length()>0;

        // v) en az bir tane sembol olsun
        boolean isSymbol = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

        //  vi) en az bir tane rakam olsun
        boolean isNumber = pwd.replaceAll("[0-9]","").length()>0;
        System.out.println("password gecerlimi : " +(isUpper&isLower));




    }


}
