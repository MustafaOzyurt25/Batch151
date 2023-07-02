package day14loops;

import java.util.Scanner;

public class Loops03_Tekrar {

    public static void main(String[] args) {
     /*
        //Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin

        // >100 kazandiniz <= 100 >>>>>>>>>>>>kaybettiniz

        Scanner scanner = new Scanner(System.in);


        int n = 0;
        do {

            System.out.println("Lutfen bir sayi giriniz..");
            n = scanner.nextInt();
            if (n < 100) {

                System.out.println("Kazandiniz");
            }

        } while (n < 100);

        System.out.println("Kaybettiniz");


      */

        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile
        // bittigini kontrol eden kodu yaziniz

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("lutfen bir cumle giriniz.  cumlen buyuk harfle baslayip nokta ile bitmeli!");
            String s = scanner.next();
            char ch = s.charAt(0);
            boolean r1 = 'A' <= ch && ch <= 'Z';
            boolean r2 = s.charAt(s.length() - 1) == '.';
            if (r1 && r2) {
                System.out.println("Cumle dogru. Tekrar dene");
            } else {
                System.out.println("Cumle yanlis");
                break;

            }


        } while (true);


    }
}
