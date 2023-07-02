package practise_regular.day18practise;

import java.util.Scanner;

public class c01_IlegalArgumentExceptions {
          /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
        Kullanıcı yas olarak 0'dan kucuk esit veya
        120'den buyuk esit bir sayı girerse
        IllegalArgumentException olusacak sekilde
        bir program yazınız
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz");
        int yas = scanner.nextInt();

        if (yas <= 0 || yas >= 120) {
                throw new IllegalArgumentException();
            // Java bizim istedigimiz durumlarda exception firlatabilir.


        } else {
            System.out.println("Uygun bir yas girdiniz");
        }
    }
}