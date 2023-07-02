package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Tekrar {













    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");


        System.out.println(distincLastLetterNaturelOrderInList(names));//[MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
        System.out.println(lowerCsortedLengthReverseInList(names));//[alexander, michael, alex, alex, mary, jim, tom]

        System.out.println(isAllCharactersLengthGraterThanTwo(names));//true

        System.out.println(isNoneOfElementsLengthLessThanThree(names)); //true

        System.out.println(atLeastOneOfElementsLengthLessThanFour(names));// true
    }//main
////////////////////////////////////////////////    Ex1.    ///////////////////////////////////////////////////////////////////////

    //  Ex1. list elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir listin icinde return ediniz
 public static List<String> distincLastLetterNaturelOrderInList( List<String> names){

       return names.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).map(String::toUpperCase).toList();
 }
////////////////////////////////////////////////    Ex2.    ///////////////////////////////////////////////////////////////////////
    //  Ex2. list elemanlarini karakter sayilarina  gore ters sirada kucuk harfle bir listin
// icinde return ediniz/Ancak ayni karakter sayisina sahip olanalar kendi icinde alfabetik olarak sirada olsun
    public static List<String> lowerCsortedLengthReverseInList(List<String> names){
        return names.stream().map(String::toLowerCase).sorted(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder())).toList();
    }
/////////////////////////////////////////////////////    Ex3             ////////////////////////////////////////////

    //  Ex3. list elemanlarinin tamaminin  karakter sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz

public static boolean isAllCharactersLengthGraterThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2);
}
///////////////////////////////////////////////////////  Ex.4  //////////////////////////////////////////////////////////
    // Ex.4 list elemanlarinin hicbirinin   karakter sayisinin 3 den kucuk olup olmadigini kontrol eden methodu olusturunuz
public static boolean isNoneOfElementsLengthLessThanThree(List<String> names){
       return names.stream().noneMatch(t->t.length()<3);
}
/////////////////////////////////////////////////   Ex.5    ////////////////////////////////////////////////////////////////

// eX5: list elemanlarinin enaz birinin   karakter sayisinin 4 den kucuk olup olmadigini kontrol eden methodu olusturunuz

public static boolean atLeastOneOfElementsLengthLessThanFour(List<String> names){

       return names.stream().anyMatch(t->t.length()<4);
}

















}//Class
