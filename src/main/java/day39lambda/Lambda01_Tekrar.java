package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Tekrar {

    public static void main(String[] args) {



        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Mehmet");
        list.add("Tarik");
        list.add("Ali");
        list.add("Veli");
        list.add("Mehmet");
        list.add("Tarik");
        list.add("Hatun");

        //Task: bir listteki elemanlari konsola yazdiran methodu olusturunuz.
         printelemanOfListToConsol(list);

        System.out.println();

        // Example 2 : Bir List'teki T ile baslayanlar haric tum elemanlari consola yazdiran methodu olusturunuz
        tIleBaslayanlarHaricYaz(list); // Ali Veli Mehmet

        // Example 3 : Bir List'te karakter sayisi 4 den az olan tum elemanlari  consola yazdiran methodu olusturunuz

        System.out.println();
        karakterSayisiDortdenazOlanlariYaz(list);// Ali

        System.out.println();


        // Example 4 : Bir List'te karakter sayisi 4 den cok olan tum elemanlari buyuk harflerle consola yazdiran methodu olusturunuz

        karakterSayisiDortdenCokOlanlariBuyukHYaz(list);

        System.out.println();
        //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle
        // console'a yazdiran method'u olusturunuz.

        karSayDortCokOlanlariTekrarsizKucukHarflarleYaz(list);// mehmet tarik hatun

        System.out.println();

        //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

        elTekrarsizBuyukHarfAlfabetikYaz(list);// ALI HATUN MEHMET TARIK VELI
    }

    public static void printelemanOfListToConsol(List<String> list){

        list.stream().forEach(t-> System.out.print(t+" "));

    }

    public static void tIleBaslayanlarHaricYaz(List<String> list ){
        list.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+" "));
    }


    public static void karakterSayisiDortdenazOlanlariYaz(List<String> list){
        list.stream().filter(t->t.length()<4).forEach(System.out::println);

    }

    // Example 4 : Bir List'te karakter sayisi 4 den cok olan tum elemanlari buyuk harflerle consola yazdiran methodu olusturunuz

public static void karakterSayisiDortdenCokOlanlariBuyukHYaz(List<String> list){

        list.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));
}

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // console'a yazdiran method'u olusturunuz.


public static void karSayDortCokOlanlariTekrarsizKucukHarflarleYaz(List<String> list){
    list.stream().filter(t -> t.length() > 4).distinct().map(t->t.toLowerCase()).forEach(t-> System.out.print(t+" "));
}


//Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.


    public static void elTekrarsizBuyukHarfAlfabetikYaz(List<String> list){

        list.stream().distinct().map(m->m.toUpperCase()).sorted().forEach(t-> System.out.print(t+" "));
    }
}
