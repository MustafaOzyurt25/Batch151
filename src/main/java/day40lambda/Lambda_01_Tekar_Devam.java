package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda_01_Tekar_Devam {

    public static void main(String[] args) {
        List<String> iller = new ArrayList<>(Arrays.asList("Van","Mus","Kutahya","Ankara","Ordu",
                "Gaziantep","Hatay","Edirne","Mus"));

        uniqueupperCaccordingLengthThenNationalOrder(iller);//MUS VAN ORDU HATAY ANKARA EDIRNE KUTAHYA GAZIANTEP

        System.out.println();
        startWithHorendWithu(iller);
        System.out.println(iller);// [Van, Mus, Kutahya, Ankara, Gaziantep, Edirne, Mus]
        System.out.println();
        System.out.println(karakterSayilarininKaresiniAlanVeBirList(iller));// [9, 9, 49, 36, 81, 36, 9]
        System.out.println();
        System.out.println(karaketriSayisiCiftOlanlarinListi(iller));// [Ankara, Edirne]
    }// main


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar


    public static void uniqueupperCaccordingLengthThenNationalOrder(List<String> l){

        l.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(t-> System.out.print(t+" "));


    }

    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

    public static void startWithHorendWithu(List<String> listim){

        listim.removeIf(t->t.startsWith("H")||t.endsWith("u"));
    }

    // 6) List elemanlarinin karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


    public static  List<Integer> karakterSayilarininKaresiniAlanVeBirList(List<String> myList){

        List<Integer> yourList =myList.stream().map(t->t.length()*t.length()).toList();

        return yourList;
    }


    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> karaketriSayisiCiftOlanlarinListi(List<String> iller){

        List<String> stringList = iller.stream().filter(t->t.length()%2==0).toList();

        return stringList;
    }











}//Class
