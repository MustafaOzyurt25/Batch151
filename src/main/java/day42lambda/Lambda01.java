package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
       //  Ex1. list elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir listin icinde return ediniz
        //Ex2. list elemanlarini karakter sayilarina  gore ters sirada kucuk harfle bir listin
               // icinde return ediniz/Ancak ayni karakter sayisina sahip olanalar kendi icinde alfabetik olarak sirada olsun

        //Ex3. list elemanlarinin tamaminin  karakter sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz

        //Ex.4 list elemanlarinin hicbirinin   karakter sayisinin 3 den kucuk olup olmadigini kontrol eden methodu olusturunuz

        // eX5:  list elemanlarinin enaz birinin   karakter sayisinin 4 den kucuk olup olmadigini kontrol eden methodu olusturunuz


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInLIst(names));// [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]

        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));

        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));

        System.out.println(atLeastOneLengthLessThanFour(names));
    }


    public static List<String> sortWithLastCharDistinctUpperInLIst(List<String> names){


        // istedigimiz bir karaktere gore ve sonucu list olarak kullanmak icin collect kulllaniriz
       return names.stream().
               distinct().map(String::toUpperCase).
               sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
               collect(Collectors.toList());// Normalde distinct elemanlari depolamak icin "Set" kullanilir
        // ama Lambdadaki collect(Collectors.toSet()) methodu yerine mecburen Collectors.toList() methodunu kullandik
//                Normalde distinct elemanlari depolamak icin Set kullanilir. Ama Lambda'daki toSet methodu elemanlari rastgele siralar.
        //yapisi sort() methoduna aykiri.
//

//        siralar. Sorumuzda siralama istenmeseydi, distinct de olunca toSet kullanmak okunurluk acisindan daha dogru olurdu.
//       Eger collect methodunu Set ile kullanmak istersek, kodumuz kizarir. Bu durumda methodumuzun data type'ini
//        List yerine Set olarak degistiririz. Bu durumda problem cozulmus olur. Ancak baska bir problem ile
 //       karsilasiriz. Yukarida kodumuz icine yazdigimiz sorted methodunu kabul etmez. Cunku toSet icinde HashSet kullanilir
        //       ve HashSet elemanlari sirali olarak degil rastgele siralar. Bu sekilde kodumuzu tamamlayamadik.
        //        Oyleyse kodumuzda toSet degil to List kullanmamiz gerektigini anladik.
    }


    //Ex2. list elemanlarini karakter sayilarina  gore ters sirada kucuk harfle bir listin
    // icinde return ediniz/Ancak ayni karakter sayisina sahip olanalar kendi icinde alfabetik olarak sirada olsun

    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){

        return names.stream().map(String::toLowerCase).

                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).toList();
    }


    //Ex3. list elemanlarinin tamaminin  karakter sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz


    public static boolean isLengthMoreThanTwo(List<String> names){

        return names.stream().allMatch(t->t.length()>2);// allMatch() ; Bir listteki elemanlarini tamamainin spesifik bir ozellige sahip olup olmadini anlamak iicn kullan
    }

    //Ex.4 list elemanlarinin hicbirinin   karakter sayisinin 3 den kucuk olup olmadigini kontrol eden methodu olusturunuz


    public static boolean noLengthLessThanThree(List<String> names){

        return names.stream().noneMatch(t->t.length()<3);
    }


    // EX5:  list elemanlarinin enaz birinin   karakter sayisinin 4 den kucuk olup olmadigini kontrol eden methodu olusturunuz

    public static boolean atLeastOneLengthLessThanFour(List<String> names){
       return names.stream().anyMatch(t->t.length()<4);
    }
}


  /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */