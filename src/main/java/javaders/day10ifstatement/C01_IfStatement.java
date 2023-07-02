package javaders.day10ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // if it rains, I will cancel the picnic.

        // ex: verilen karakter buyuk harf ise ekrana buyuk harf yazdiran kodu yaz

        String str = "If it rains, I will cancel the picnic.  ";


        //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("lutfen sayi giriniz");

        //    int sayi = scanner.nextInt();

      /*     char ch = '*';

        if (ch>='A'&& ch<='Z'){

            System.out.println("buyuk harf");
        }
       int sayi = -657;
*/

        //  if (sayi % 2 != 0) {

        //    System.out.println("tek sayi");


// Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz

        // verilen bir sayi 300 den kucuk veya 1200 den buyuk isa harika sayi yaz.

        int sayi1 = 506;
        if (sayi1 < 300 || sayi1 > 1200) {

            System.out.println("harika sayi");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir asyi giriniz");

        int sayi = scanner.nextInt();
        if( sayi%2==0){
            System.out.println("girdiginiz sayi cift");}
            if (sayi%2!=0){
                System.out.print("girdiginiz sayi tek sayi");
            }


    }
    }
 // Class
