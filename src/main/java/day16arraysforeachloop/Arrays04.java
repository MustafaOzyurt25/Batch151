package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String words[] =s.split(" ");
        System.out.println(words);
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


        // ornek 2:
        // verilen cumlede kac harf oldunu gosteren kod yaziniz.

       String letters[] =s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);































    }
}
