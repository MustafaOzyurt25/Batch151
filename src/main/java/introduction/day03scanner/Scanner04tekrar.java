package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04tekrar {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen 1.sayiyi giriniz...");
        double sayi1 = input.nextDouble();
        System.out.println("Birinci sayiniz = " + sayi1);
        System.out.println(" Lutfen 2.sayiyi giriniz...");
        double sayi2 = input.nextDouble();
        System.out.println("Ikinci sayiniz = " + sayi2);
        System.out.println("iSLEM SONUCLARI SU SEKILDEDIR:");


        double toplama = sayi1 + sayi2;
        double cikarma = sayi1 - sayi2;
        double bolme = sayi1 / sayi2;
        double carpma = sayi1 * sayi2;
        System.out.println("carpma sonucu = " + carpma);
        System.out.println("bolme sonucu = " + bolme);
        System.out.println("cikarma sonucu = " + cikarma);
        System.out.println("toplama sonucu = " + toplama);
        System.out.println("TESEKKURLER!");






    }
}
