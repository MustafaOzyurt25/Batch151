package practise_regular.lambdaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayisinaGoreBuyuktenKucugeKarakSayEnBuyukIlk3ToList(List<String> meyve){
//       return meyve.stream().
//                sorted(Comparator.comparing(t->t.toString().
//                        length()).
//                        reversed()).
//                limit(3).
//                toList();
        return meyve.stream().
                sorted(Comparator.comparing(String::length).
                        reversed()).
                limit(3).
                toList();
    }



    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım
    public static void ilkHarfeVeyac( List<String> meyve){

        meyve.stream().filter(t->t.charAt(0)=='e'||t.charAt(0)=='c').forEach(Utils::yazdir);
        System.out.println();
       meyve.stream().filter(t->t.startsWith("e")||t.startsWith("c")).forEach(Utils::yazdir);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void yildizEkle( List<String> meyve){
        meyve.stream().map(t->"*"+t+"*").forEach(Utils::yazdir);
    }



    public static void main(String[] args) {


    List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));


    ilkHarfeVeyac(meyve);
        System.out.println();
        yildizEkle(meyve);
        System.out.println();
        System.out.println(karakterSayisinaGoreBuyuktenKucugeKarakSayEnBuyukIlk3ToList(meyve));

    }// main



}// class
