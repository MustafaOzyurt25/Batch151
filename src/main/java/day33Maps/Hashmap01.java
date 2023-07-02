package day33Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Hashmap01 {
    public static void main(String[] args) {


        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurrenceOfLetters(s));

    }

    // Ex: Verilen bir stringde hangi harfin kac defa kullanildigini veren method olusturunuz

    // "Hello Henry!"==>H = 2, e=2, l=2, o=1, n=1,r=1, y=1


    public static TreeMap<String,Integer> getTheNumOfOccurrenceOfLetters(String s){
        // Stringdeki harf disi karakterleri sil
        s=s.replaceAll("[^A-Za-z]","");

        //  Gorunum sayilarini depolamak icin Map olustur.
        TreeMap<String,Integer> numOfOccurence = new TreeMap<>();

        // Harfleri al
        String[] letters= s.split("");

        System.out.println(Arrays.toString(letters));

        for (String w:letters ) {
            Integer numOfOcc =numOfOccurence.get(w);

            if (numOfOcc == null) {

                numOfOccurence.put(w,1);

            }else {
                numOfOccurence.replace(w,numOfOcc+1); // once put() ile yapmistik revize ettik
            }
        }
       return numOfOccurence; // methodumuz map return etmeli.
    }
}
