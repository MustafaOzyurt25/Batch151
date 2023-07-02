package javaders.day09stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatement_tekrar {


    public static void main(String[] args) {

        // 1 .sayi poz ise ekrana poz yazan kodu yaz

        double number = 65.6;
        if(  number>0   )  {
            System.out.println("sayi pozitiftir");
        }
       //***************************************************************************\\


        int sayi = 8;
        if (-1<sayi && sayi<10   ){
            System.out.println("rakam");
        }

        //***************************************************************************\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz...");
       int ucBasamakliSayi = scanner.nextInt();
       if (Math.abs(ucBasamakliSayi)>99 && Math.abs(ucBasamakliSayi) < 1000) {
           System.out.println("Girdiginiz sayi uc basamakli bir sayidir...");
       }
        else {
           System.out.println("Girdiginiz sayi uc basamakli bir sayi degildir...");
       }


        // EX: sayi -1 ila  10  arasindaysa ekrana "Rakam" yaz

    }/// sayi uc basamakli ise ekrana ucb

}
