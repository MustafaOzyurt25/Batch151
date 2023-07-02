package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Tekrar {











    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Haci Musa");
        list.add("Haci Isa");
        list.add("Haci Mehmet Giyasettin");
        list.add("Ferit");
        list.add("Nusrettin");
        list.add("Ferit");
        list.add("Nusrettin");

        System.out.println(list);// [Haci Musa, Haci Isa, Haci Mehmet Giyasettin, Ferit, Nusrettin, Ferit, Nusrettin]

        //6
   //        System.out.println(karSayKare(list));// [81, 64, 484, 25, 81]


        uniqueUpperCaseLengthSorted(list);// FERIT HACI ISA HACI MUSA NUSRETTIN HACI MEHMET GIYASETTIN
        System.out.println();
        uniqueUpperCaseSortedAccLastLetter(list);// HACI MUSA HACI ISA HACI MEHMET GIYASETTIN NUSRETTIN FERIT
        System.out.println();
        uniqueUpperCaseSortedAccLength(list);//FERIT HACI ISA HACI MUSA NUSRETTIN HACI MEHMET GIYASETTIN
        System.out.println();
        karakteriBesdenFazlaOlanalariSil(list);
        System.out.println(list);// [Ferit, Ferit]

    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdiriniz
//    public static List<Integer> karSayKare(List<String> list) {
//        List<Integer> list1 = list.stream().map(t -> t.length() * t.length()).toList();
//
//          return list1;
//    }



    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz



    public static void uniqueUpperCaseLengthSorted( List<String> list){


        list.stream().
                distinct().
                sorted(Comparator.comparing(t->t.length())).
                map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));




    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void uniqueUpperCaseSortedAccLastLetter( List<String> list){

        list.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void uniqueUpperCaseSortedAccLength( List<String> list){
        list.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));


    }
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz.

    public static void karakteriBesdenFazlaOlanalariSil(List<String> myList){

       myList.removeIf(t -> t.length() > 5);
    }




}
