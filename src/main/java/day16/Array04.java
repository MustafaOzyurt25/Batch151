package day16;

import java.util.Arrays;

public class Array04 {

    public static void main(String[] args) {

        // Size verilen bir cumlede kac kelime old. gosteren kodu yaziniz


        String s = "Java is easy.Learn Java earn money.";  // bosluklardan kesersek 7 kelime olusur.
                                                            // Bir Stringi kestimizde java onu Array'e yerlestirir.

        String[] words =s.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(words.length);


        // Size verilen bir cumlede kac harf old. gosteren kodu yaziniz.

        String letters[]=s.replaceAll("[^A-z]","").split("");  // ?
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);

















    }
}
