package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


        List<String> iller = new ArrayList<>(Arrays.asList("Van","Mus","Kutahya","Ankara","Ordu",
                "Gaziantep","Hatay","Edirne","Mus"));

        byHarfLengthArtanDistinct(iller);
        System.out.println();
        byHarfsonHArtanSiradaTekrarsiz(iller);
        System.out.println();
        upperCaseLenngthSortedDistinctSortedAlf(iller);
        System.out.println();
        System.out.print(KarakteriBesdenFazlaOlnSil(iller));//  [Van, Mus, Ordu, Hatay, Mus]
        System.out.println();
        System.out.println(StartWithHOrEndR(iller));


    }//main

            // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void byHarfLengthArtanDistinct(List<String> iller){
        iller.stream().
                distinct().map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));

    }



            // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void byHarfsonHArtanSiradaTekrarsiz(List<String> iller){

        iller.stream().distinct().map(t->t.toUpperCase()). // Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
    }


            // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
            // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void upperCaseLenngthSortedDistinctSortedAlf(List<String> iller){

        iller.stream().distinct().map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);


    }




            // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz


    public static List<String> KarakteriBesdenFazlaOlnSil(List<String> iller){

        System.out.println(iller.removeIf(t -> t.length() > 5));


        return iller;
    }




            // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String> StartWithHOrEndR(List<String> iller){

        iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
        return iller;
    }


            // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    // yapildi



            //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.



    // yapildi
        }


