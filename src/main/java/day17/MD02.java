package day17;

import java.util.Arrays;

public class MD02 {
    public static void main(String[] args) {  // amaca gore kod yazacaz.

//Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        // bu soruda best practise olmayan yontem: tek boyutlu bir array olustur. sort yap ilk eleman ile son elemani al topla.


        int ages[][] = { {15, 4}, {12, 43, 21} }; // mesela soyle birmd array olsun  // ==> 4 + 43 = 47

        int small = ages[0][0];    // Arraydaki herhangi bir elemani veririz.
                                         // farzederiz ki en kucuk o olsun. zaten kiyaslama yapacaz. o degilse degisecek.
        // oysa kalcak.

        for (int []  w : ages ) {

            for ( int  k :  w ) {

                small=Math.min(small,k);   // iki tane sayi verirsin kucugunu verir. Ama sayilar nerde?

            }

        }
        System.out.println(small);


        int big = ages[0][0];
        for (int []  w : ages ) {

            for ( int  k :  w ) {

                big=Math.min(big,k);   // iki tane sayi verirsin buyugunu verir. Ama sayilar nerde?

            }

        }

        System.out.println("big" + big);















    //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
    int numbers[][] = { {5, 4}, {2, 3, 2} };  // ==> { 5, 4, 2, 3, 2 }

    // 1.step: iki boyutlu arary da oncelikle kac  eleman oldugunu dinamik olarak  bulalim. niye?
        // cunku yeni bir array olusturacam. o arraye aktaracagim eleman sayisina ihtiyacim olacak
        // ve dinamik olmali length i bulunca.

int toplamElemanSayisi =0;  // buna ihtiyacim olacak.

                            //{ {5, 4}, {2, 3, 2} }
        for (int [] w : numbers) {

            toplamElemanSayisi = toplamElemanSayisi+ w.length;  //5
        }

        System.out.println(toplamElemanSayisi);

      //  2.step: tek boyutlu arrayi elde ettigimiz eleman sayisini kullanarak olusturalim

        int newArr [] = new int [toplamElemanSayisi]; //bunu mecburen ayarlamamaiz lazim. kalip hazir  [0, 0, 0, 0, 0,]


        int idx = 0;
                                // { {5, 4}, {2, 3, 2} }
        for ( int []  w : numbers  ) {

            for (  int k  : w  ) {

                newArr [idx] = k;
                idx++;                          // elemanlarimizi tek tek buraya transfer yapacaz.
            }
           // System.out.println(Arrays.toString(newArr));
        }

        System.out.println(Arrays.toString(newArr));





    }

}
