package day16;

import java.util.Arrays;

public class Array04_Tekrar {
    public static void main(String[] args) {

        // Size verilen bir cumlede kac kelime old. gosteren kodu yaziniz

        String s = "Hic bir kisiye calistigindan baskasi verilmez.";
        String arr[] = s.split(" ");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        // Size verilen bir cumlede kac harf old. gosteren kodu yaziniz.

        int result =s.replaceAll("[^A-z]","").length();
        System.out.println(result);

       String arr1[]=s.replaceAll("[^A-z]","").split("");
        System.out.println(Arrays.toString(arr1));


    }
}
