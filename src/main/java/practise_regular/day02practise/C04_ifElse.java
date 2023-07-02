package practise_regular.day02practise;

import java.util.Scanner;

public class C04_ifElse {
    public static void main(String[] args) {

         /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise,
         konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kelimeyi girin");
        String ilkKelime = scanner.next();
        System.out.println("2. kelimeyi girin");
        String ikinciKelime = scanner.next();


        if (ilkKelime.length() % 2 == 0) {

            String ilkKelimeIlkYarisi = ilkKelime.substring(0, ilkKelime.length() / 2);
            String ilkKelimeIkinciYarisi = ilkKelime.substring(ilkKelime.length() / 2);  // mutlaka index ve
            // length leri gozunde iyicene canlandirmak icin ornek uzerinden yuru
            System.out.println(ilkKelimeIlkYarisi + ikinciKelime + ilkKelimeIkinciYarisi);

        } else {
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }


    }

}
