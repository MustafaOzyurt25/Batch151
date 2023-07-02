package practise_regular.day18practise;

import java.util.*;

public class C03_Iterator {

    public static void main(String[] args) {
            /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */

        Deque<Integer> deque = new LinkedList<>(Arrays.asList(1,8,3,6,7));

        List<Integer> list = new ArrayList<>();

        System.out.println(deque);//[1, 8, 3, 6, 7]

        Iterator iterator = deque.iterator();  // Deque'lerde index yapisi olmadigindan iterator kullanilir.

        while (iterator.hasNext()){

            Object sayi =iterator.next(); // iterator'u bir adim ileriye atiyorum uzerinden gectigi elemani bize dondurur.

            if ((Integer)sayi>5){
                System.out.print(sayi + " ");
                list.add((Integer) sayi);


            }
        }




    }
}
