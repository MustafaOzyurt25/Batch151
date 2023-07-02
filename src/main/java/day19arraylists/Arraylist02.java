package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barselona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");


        // ARRAYLIST'TE BIR ELEMANIN ILK GORUNUMU NASIL SILINIR?
        System.out.println(cities);
        cities.remove("Miami");
        System.out.println(cities);   // [Giresun, Yozgat, Barselona, Miami, Giresun]



        System.out.println(cities); // beklentim barcelona nin gitmesi  [Giresun, Yozgat, Miami, Giresun]
        // cities bir object. object kullanarak gorulen methodlar non statik tirler hatirla!



        // Arraylist te bir eleman indexi kullanilarak nasil silinir
        String citiesYeni =cities.remove(2);
        System.out.println(citiesYeni);  // Barselona yi sildim diyor java

        // bir method ogrenirken asagidaki uc seyi ogrenin:
        // methot ne is yapar , methot nasil kullanilir  , o   methot ne verir




        List<Integer> ages = new ArrayList<>();   // Arraylist olustururken en basa
                                                    // Arraylist yerine sadece List yazilabilir
 // 12 elemanini List ten sil:
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

       // primitive int removun icinde kullanirsak java onu index zanneder.
                                 // javaya 12 nin index olmadigini soylemek
                                               // icin primitive int yerine Wrapper Class Integer kullaniriz
        ages.remove((Integer)12);
        System.out.println(ages); //  [23, 7, 4] 12 yok artik.


        // Bir Arrylisteki bir elemanin tum gorunumlarini nasil silriz




    List<String> citiesToRemove = new ArrayList<>();

    citiesToRemove.add("Giresun");
    citiesToRemove.add("Yozgat");             // silmek istedigini bir list e ekle o list i removeAll ile kullan.

    cities.removeAll(citiesToRemove);
        System.out.println(cities);  // sadece [Miami] kaldi .



        // IKI Arraylist' in birbirine esit olup olmadigini nasil anlariz

        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);  // [a, k, c, d]
        //kisa yolsdan bir list olusturmak icin List.of () methodunu kullanabiliriz`

        List<Character> letters =List.of('a','c','k','d','k');
        System.out.println(letters);  // [a, c, k, d]

        boolean r1 = initials.equals(letters); //
        System.out.println(r1); // false  ( equals ayni elemanlar ayni index de oldugu surece true verir)

       int r2 = initials.indexOf('k');
        System.out.println(r2); // 1 indexOf('k') yazarsak k nin ilk gorunumunun indexini verir
        int r3 =initials.lastIndexOf('k');

        System.out.println(r3); //// 4

 //        Ex > bir list teki tekrarsiz elemanlari consola yazdiran kodu yaziniz

            List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0)  ;
        for (Double w :  prices ) {
            if ( prices.lastIndexOf(w)==prices.indexOf(w)){
                System.out.print(w+" ");
            }
        }

// Ex: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.0) ;

        int counter = 0;
        for ( Double w : heights) {

            if (heights.indexOf(w)==heights.lastIndexOf(w)){
                counter++;
            }

        }

        if(counter==0){
            System.out.println("unique");  // tekrarsiz
        }else {
            System.out.println("Not unique"); // tekrarli
        }



    }
}
