package day33Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap01_Tekrar {
    public static void main(String[] args) {
        // Ex: Verilen bir stringde hangi harfin kac defa kullanildigini veren method olusturunuz
        // "Hello Henry!"==>H = 2, e=2, l=2, o=1, n=1,r=1, y=1

        String s = "Hello Henry!";
        System.out.println(occOfLetters(s));  // {r=1, e=2, H=2, y=1, l=2, n=1, o=1}
        // {H=2, e=2, l=2, n=1, o=1, r=1, y=1}

    }

    public static Map<String,Integer> occOfLetters(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");

        HashMap<String, Integer> harfGorunum = new HashMap<>();



        String[] harfler = s.split("");

        System.out.println(Arrays.toString(harfler));



        for (String w : harfler) {

            Integer valueOfharfler = harfGorunum.get(w);
            if (valueOfharfler == null) {
                harfGorunum.put(w, 1);
            } else {
                harfGorunum.replace(w, valueOfharfler + 1);
            }



        }
        TreeMap<String, Integer> harfGorunum2 = new TreeMap<>(harfGorunum);
        return harfGorunum2;
    }


}
