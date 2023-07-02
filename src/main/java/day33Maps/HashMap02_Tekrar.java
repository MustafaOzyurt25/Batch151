package day33Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap02_Tekrar {
    public static void main(String[] args) {
// Bir HashMap calisma mantigi anlatiniz



        HashMap<String,String> baskentelr = new HashMap<>();

        baskentelr.put(null,null);// TreeMap musade etmez

       // System.out.println(baskentelr);  HashMaplarde null key bir tane olabilir, value da sinir yok

        System.out.println(baskentelr);
        baskentelr.put("IRAN","Tarhan");
        System.out.println(baskentelr.put("TURKIYE", "ANKARA"));
        System.out.println(baskentelr.get("iran"));
        baskentelr.put("SURIYE","SAM");
        System.out.println(baskentelr);


       TreeMap<String,String>baskentler2  =new TreeMap<>(baskentelr);

        System.out.println(baskentler2);

    }
}
