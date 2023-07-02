package day38enumsitarator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

    // Verilen bir listeyi tersten yazdiran bir kodu olusturunuz
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator itr = list.listIterator();

        while (itr.hasNext()){
            itr.next();
        }

        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" !");// 5 !4 !3 !2 !1 !
        }



    }
}
