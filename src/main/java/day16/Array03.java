package day16;

import java.util.Arrays;

public class Array03 {

    public static void main(String[] args) {
// spesifik bir elemnin arrayde olup olmadigini bulan kodu yaziniz
        String names[] = {"K", "C", "Laptop", "A", "S"};

        String el = "S";

        int counter = 0;

        for (String w : names) {

            if (w.equals(el)) {
                counter++;
                break;
            }

        }

        if (counter > 0) {
            System.out.println("names Arrayinde "+ el+  " eleman var");
        } else {
            System.out.println("names Arrayinde "+ el+  " eleman yok");
        }

        // 2. way: binarySearch() method hizli arama yapar.

        Arrays.sort(names);

        // binarySearch() methodunu sort() kullanmadan kullanmayiniz. yani siralanmis elemnlerda kullanilir
        // cunku binarySearch() methodu mantigi sirali elemnlar iicin gecerliidr
        // binarySearch() methodu var olan elemen icin size o elemnin indexini verir
        // index 0 veya 0 dan buyukse o elemn Arrayda var
        // binarySearch metodu olmayan elemnlar icin negatif tamsayi degeri verir.
        // eksinin anlami o elemn yok demektir
        // eksinin yanindaki sayi ise o elman olsay di kacinci eleman olacagini belirtmektedir.
        // (index  degil!, kacinci sirada olacagini verir)
        int result = Arrays.binarySearch(names,el);
        System.out.println(result);
        if (result<0){
            System.out.println("names Arrayinde "+ el+  " eleman var");
        }else {
            System.out.println("names Arrayinde "+ el+  " eleman yok");
        }









    }
}
