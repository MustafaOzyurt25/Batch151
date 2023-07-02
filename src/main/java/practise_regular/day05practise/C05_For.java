package practise_regular.day05practise;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {
         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("5 sayi giriniz");


        int toplam = 0;

        for (int i= 1;i<6;i++){  // 1 den 6 ya kadar donguye aldik ki, kullanicidan 5 adet sayinin sisteme girmesini sagladik
            System.out.println(" bir sayi giriniz");
            int sayi = scanner.nextInt();

            if (sayi>=5&&sayi<=10){  // 5 ile 10 arasindaki sayilari isleme almadik
                System.out.println("girdiginiz sayi 5-10 arasinda old.dan isleme alinmayacaktir");


            }else {
                toplam=toplam+sayi; // degilse sayilari topladik
            }


        }

        System.out.println("toplam " + toplam);




    }
}
