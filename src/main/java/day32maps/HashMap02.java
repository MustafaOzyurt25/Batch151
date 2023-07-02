package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1


        // like ile like! ayni yapabilmek icin
        String s = "I like to move it, move it do you like it?";

        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);  // I like to move it move it do you like it

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));// [I, like, to, move, it, move, it, do, you, like, it]




        HashMap<String, Integer> occ = new HashMap<>();  // ici bos suan

                             // [I, like, to, move, it, move, it, do, you, like, it]
        for ( String w : words ) {

            Integer numOfOccurance = occ.get(w);

            if (numOfOccurance==null){
                occ.put(w,1);

            }else {
                occ.replace(w,numOfOccurance+1);

            }

        }

        System.out.println(occ);  // {move=2, like=2, I=1, to=1, it=3, do=1, you=1}


    }
}
