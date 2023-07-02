package day12switchloops;

public class Loops001 {

    public static void main(String[] args) {

        // EX 1 : Ekrana 5 kere "Hi" yazdiriniz

        // 1. yol:(tavsiye edilmez)
        System.out.println("Hi.....");
        System.out.println("Hi.....");
        System.out.println("Hi.....");
        System.out.println("Hi.....");
        System.out.println("Hi.....");


        /*
        CODE STANDARTS
        1) tekrarlar olmamali(Repetition)
        2) Dynamic olmali.
        3) Tamir (Fix) ve update kolay yapilabilmeli.

         */

        // Ayni adimlar tekrar tekrar yapilmasi gerektiginda loop lar kullanilir:
        // 4 tane loop vardir:
        // 1) for-loop  2) while-loop  3) do-while loop   4) for-each loop

        //*******************************  1) for : for(b.d ;calsma.kosulu  ; yapacagi is ){}

        //for (Baslangic degeri     ;      loop calisma sarti         ; artirma/EKSILTME) {
        //  calisacak kodlar   }

        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");

        }

        // 11 den 14 e kadar tumsayilari ekrana yaz. ("for" da i degisken ismi gelenekseldir.)

        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }

        // ex 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz


        for (int i = 40; i > 22; i--) {

            if (i % 2 == 0)
                System.out.println(i);
        }


        //Example 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiriniz


        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }


    }

}
