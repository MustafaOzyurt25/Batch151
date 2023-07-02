package day21arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */
        List<String> list = new ArrayList<>();   // NEDEN STRING list yaptik. Strin cok zengin bir class da ondan
        list.add("A");
        list.add("H");
        list.add("J");
        list.add("M");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int can =3;
        do {

            if(counter==can){
                System.out.println(list);
                break;

            }
            System.out.println(" Lutfen bir harf girin ");
            String harf = scanner.next().toUpperCase().substring(0, 1);


            if (list.contains(harf)) {
                list.set(list.indexOf(harf), "Buldum!");   // set methodu indexini verdigin karkterin yerine  "Buldum!" u yerlestirdi
                // set metodu ilgili karakteri update yapti
            } else {
                list.add(harf);
            }


           counter++;

        } while (true);


    }
}
