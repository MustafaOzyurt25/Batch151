package day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {

    // kullanicinnn girdigi harf,
    // listtte varsa o harfi "Buldum"a cevirin yoksa o harfi List in icine ekleyin

    public static void main(String[] args) {
        //List<Integer> m = List.of(12, 21, 34, 53);
        List<String> mYlist = new ArrayList<>();
        mYlist.add("A");
        mYlist.add("H");
        mYlist.add("J");
        mYlist.add("K");
        mYlist.add("M");
        int size = mYlist.size(); // "size",  5 degismiyor.
        // List<String> mYlist = List.of("A", "H", "J", "K", "M");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == size) {
                System.out.println(mYlist);
                break;   // loopu kiracagi icin
            }
            System.out.println("Harf girin");

            String letter = scanner.next().toUpperCase().substring(0, 1);   // H GIRDI

            if (mYlist.contains(letter)) {
                mYlist.set(mYlist.indexOf(letter), "Buldum");   // set(index,String)

            } else {
                mYlist.add(letter);
            }



            counter++;

        } while (true);
    }
}
    /*
    List.of() kullanarak kisa yoldan list
    olusturabiliriz ama bu list lerin elemanlarini degistiremeyiz
    yeni eleman eklenemez.
    elemanlar silinemez
     */