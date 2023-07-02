package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Array01_Tekrar {

    public static void main(String[] args) {

        // Kullanicinin coklu datayi bir Arraya yerlestirebilmesi icin gereken kodu yaziniz
        // Scanner
        // coklu datayi olusturmak icin Array olustur
        // kullanicidan Arraya kac tane eleman koyacagini almaliyim.
        // loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen eleman sayisini giriniz");
        int elemanSayisi = scanner.nextInt();

        String names[] = new String[elemanSayisi];
        System.out.println("durmak icin q ya basiniz");
        String isim = "";
        for (int i = 1; i <= names.length; i++) {
            System.out.println(i + ".elamani giriniz: ");
            isim = scanner.next();

            if (isim.equalsIgnoreCase("q")) {
                System.out.println("SEE YOU AGAIN");

                break;
            }
            System.out.println(i + ".elaman : " + isim + "'dir");

            names[i-1] = isim;

        }
        System.out.println(Arrays.toString(names));


    }
}
