package practise_regular.day05practise;

import java.util.Scanner;

public class C04_Agac {

    public static void main(String[] args) {
        /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsola yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("yaprak satir sayisini giriniz");
        int yaprakSatirSayisi = scanner.nextInt();

        System.out.println("gövde satir sayisini giriniz");
        int govdeSatirSayisi = scanner.nextInt();

        String yaprak = "";
        for (int i = 1; i <= yaprakSatirSayisi; i++) {

            yaprak = yaprak + "^";
            System.out.println(yaprak);

        }

        for (int i = 1; i <= govdeSatirSayisi; i++) {

            System.out.println("|||");
        }


    }



    }

