package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        /*
        Kullanicidan data olmak icin Scanner classdan scan/input/scanner objesi
        olusturuz.
        bu sekilde kullaniciyi yonlendirerek gerekli datayi elde ederiz.
         */

            // 1. Adim Object olusturma

        Scanner input = new Scanner(System.in);//Nur hanim==> input objesi
        // 2. Adim kullaniciya ne yapacagini soyluyoruz:

        System.out.println("Lutfen cinsiyetinizi giriniz K/E seklinde");
        // 3.Adim Kullanicidan alinan data yapisina buyuklugune uygun bir Varible'in icine yerlestirilit

        char cinsiyet =input.next().charAt(0);

        // 4.Adim Ekranda gorebilmek icin ve kullanicininda verdigi bilgileri teyit edebilmesi icin yazdiriyoruz.

        System.out.println("cinsiyet = " + cinsiyet);


        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , maasini soran bir program yaziniz

        Scanner input2 = new Scanner(System.in); // input 2 Mustafa Bey,

        System.out.println("Lutfen cinsiyetinizi giriniz K/E seklinde");
        char gender = input2.next().charAt(0);
        System.out.println();

        System.out.println("Lutfen isminizi yazin");
        System.out.println();
        String isim = input2.nextLine();


        System.out.println("Lutfen memleketinizi giriniz..");
        String memleket = input2.next();

        System.out.println("Lutfen yasinizi giriniz..");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz..");
       short boy = input2.nextShort();

        System.out.println("Lutfen ulkenizi sevip sevmediginizi giriniz..true/ false olarak");
       boolean seviyorMu =input2.nextBoolean();

        System.out.println(" lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("********* Mustafa Bey*********** ");
        System.out.println("gender = "+ gender +"\nisim = " + isim+"\nmemleket ="+memleket+
                "\nyas ="+yas+"\nboy = "+ boy +"\nseviyorMu = "+seviyorMu+"/nmaas ="+ maas );






















    }
}
