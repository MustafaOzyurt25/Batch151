package practise_regular.day18practise;

import java.util.*;

public class C02_Iterator {
    public static void main(String[] args) {
              /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz

     */


        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));

        Iterator itr = st.iterator();  // setlerde index yapisi yoktur. bu nedenle iterator kullanilir
                                          // List haric hicbir collections uyesinde index yapisi yoktur.

        while (itr.hasNext()){  // yaninda eleman varmi diye kontrol ediyoruz/ varsa true yoksa false dondurecek/ true oldugu surece while devam eder

            Object sayi =itr.next(); // itr objesini bir adim ileriye atiyorum/ uzerinden gectigi elemani bize dondurur

            if ((Integer) sayi%2==0){   // sayi  cift mi kontrolu
               itr.remove();  // cift sayiyi siliyorum
            }
        }


        System.out.println(st);

    }
}
