package practise_regular.lambdaRecap;

import java.util.*;

// Lambdayi map hairicinde tum Collections uyelerinde kullanilir.
public class Lamda01 {

//SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın.
//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    //SORU4 : List elemanlarının karelerini , tekrarsiz yazdırın
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazir(sayi);
        System.out.println();
        ciftVePozitifMethRef(sayi);
        System.out.println();
        kareleriYazdir(sayi);
        System.out.println("   \n******");
        squareDistinctYazdir(sayi);
        System.out.println("\n******");
        buyuktenKucugeYazdir(sayi);
        System.out.println("\n******");
        pozitifKupleriniBulupBirlerBasBes(sayi);
        System.out.println();
        toplambyMethRefr(sayi);
        System.out.println();
        toplambyLambExp(sayi);
        System.out.println();
        System.out.println(ciftkareleriniToList(sayi));


    }// main


    public static void ciftVePozitifLamExYazir(List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
    }

    public static void ciftVePozitifMethRef(List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0).forEach(Utils::yazdir);

    }

    // -5,-8,-12,0,1,12,5,5,6,9,15,8
    public static void kareleriYazdir(List<Integer> sayi){
        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);
 }

    // -5,-8,-12,0,1,12,5,5,6,9,15,8
    public static void squareDistinctYazdir(List<Integer> sayi){
        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
    }

    // -5,-8,-12,0,1,12,5,5,6,9,15,8
    public static void buyuktenKucugeYazdir(List<Integer> list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }

    public static void  pozitifKupleriniBulupBirlerBasBes (List<Integer> list){
        list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplambyMethRefr (List<Integer> list){
        int  sonuc  =list.stream().reduce(Integer::sum).get();
        System.out.println(sonuc);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplambyLambExp (List<Integer> list){
        int  sonuc  =list.stream().reduce(0,(t,u)->t+u);
        System.out.println(sonuc);
    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    // -5,-8,-12,0,1,12,5,5,6,9,15,8
    public static List<Integer> ciftkareleriniToList(List<Integer> sayi){
       return sayi.
               stream().
               filter(t->t%2==0).
               map(Utils::kareBul).
               sorted().
               toList();
    }








}//Class
