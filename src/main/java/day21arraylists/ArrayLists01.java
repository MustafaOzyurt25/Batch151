package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);// [Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]


        // //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
////////////////////// remove() methodu bir elemanin ilk gorunumunu siliyor. iki kullanimi var.
        cities.remove("Miami");// [Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        System.out.println(cities);
      // indexli nasil sileriz. remov () methodu eleman ile kullanilirsa ilk gorunumu siler.
        //  remov () methodu eleman ile kullanilirsa silip slmediginin bilgisini true veya false oilarak verir
        System.out.println(cities.remove(2));//Barcelona >>> yi sildigini

        System.out.println(cities);  // [Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]



        // EX 1: bIR Integer List olusturun ve 12 elemanini siliniz
      /*
      Arraylist olustururken sag tarafa (Constructor) Arraylist yazmak zorundayiz. ama Arraylist yerine sadce List tazabiliirz
       */



       List<Integer> ages = new  ArrayList<>();
       ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
       // ages.remove(12);
//      Integer nonPrimitive = 12;
//      ages.remove(nonPrimitive);


     //   2. yol
//        ages.remove((Integer)12);
//        System.out.println(ages);
        System.out.println(ages);

        System.out.println(ages.remove(ages.indexOf(12)));
        System.out.println(ages);  // 12 yi silmisiz

        // KIsa yoldan bir LIST olusturma methodu

        // List. of () methodu degistirilemez bir List oluturmak icin kullanilaabilir.
        // Bu methotla olusturulan list degistirmeye yonelik methodlari desteklemez

        List<Character> initials = List.of('a','b','a','c','d');

        System.out.println(initials);

    // initials.add('e');
      // initials.remove(0);

      //initials.set(0,'u');

        System.out.println(initials);

        // bir elemanin indexini (ilk gorunumunun) veren method: girdigin karaketrin indexini verir
        int r1 =initials.indexOf('c');



        int r2 =initials.lastIndexOf('a');

        System.out.println(r2);  // 2

        // lastIndexOf('a') : aranan karakterin son gorunumunun indexini verir.


      // Ex 2 : Bir Listteki tekrarsiz elemanlari konsola yazdiriniz.

        List<Double> price = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);//
        for (double w : price) {
           if (price.indexOf(w)==price.lastIndexOf(w)){
               System.out.print(w+" ");
            }
        }

      // Ex 3 : Bir Listte tekrarli eleman olup olmadigini gostern kodu yaziniz

        System.out.println();
        List<Double> price1 = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        int count=0;
        for (double w:price1) {
            if (price1.indexOf(w)!=price1.lastIndexOf(w)){
               count++;
            }
        }
        if (count>0){
            System.out.println("Bu list te en az bir tekrarli eleman var");
        }

        // yukardaki sorunun devami var . Benim cozumum bu.











    }

}
