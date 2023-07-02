package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {
        String names [] = {"K","C","Laptop","A","S"};

        String el = "A";

        int counter = 0;

        for (String w : names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }

        if (counter>0){
            System.out.println("Array has >>> "+el);
        }else {
            System.out.println("Array hasn't >>> "+el);
        }


        // Second Way:   {"K","C","Laptop","A","S"};

        Arrays.sort(names);
        int result =Arrays.binarySearch(names, el); //( icinde arama yapilacak array ismi, arrayda aranacak eleman.)  int doner.

        if (result<0){
            System.out.println("Array does not ====>>> " + el);// OLMAYAN ISIMLERI - VERIR. olsaydi kacinci siorada olurdu.(index degil)
        }else {
            System.out.println("Array has ======>>>>>> "+ el);
        }





        // 1. binarysearch() methodunu , sort kullanmadan kullanamayiz. cunku mantik , sirali elemanlar icin gecerliir.
        // 2. bs methodu var olan elemanlar iocin index verirken, olmayan eleman icin eksi olarak sirasini verir.
        // 3. bs methodunda index 0 veya 0 dan buyukse aradigimiz eleman arrayde var demek.
        // 4. bs methodu olmayan eleman iicn negatif deger verir.



















    }

}
