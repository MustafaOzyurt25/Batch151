package day33Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01_Tekrar {

    public static void main(String[] args) {

//  5 tane ulke ve baskentini en hizli nasil maplare yerlestirisiniz


        long t1 = System.nanoTime();
        TreeMap<String,String> baskentler = new TreeMap<>();

        baskentler.put("CIN","TAYLAN");
        baskentler.put("JAPAN","TOKYO");
        baskentler.put("KORE","ERZURUM");
        baskentler.put("ALMANYA","BERLIN");
        baskentler.put("INGILTERE","LONDON");

        System.out.println(baskentler);// {ALMANYA=BERLIN, CIN=TAYLAN, INGILTERE=LONDON, JAPAN=TOKYO, KORE=ERZURUM}

        long t2 = System.nanoTime();

        HashMap<String,String> baskentler1 = new HashMap<>();

        TreeMap<String,String> baskentler2 = new TreeMap<>(baskentler1);

        baskentler2.put("CIN","TAYLAN");
        baskentler2.put("JAPAN","TOKYO");
        baskentler2.put("KORE","ERZURUM");
        baskentler2.put("ALMANYA","BERLIN");
        baskentler2.put("INGILTERE","LONDON"); // {ALMANYA=BERLIN, CIN=TAYLAN, INGILTERE=LONDON, JAPAN=TOKYO, KORE=ERZURUM}

        System.out.println(baskentler2);


        long t3 = System.nanoTime();


        System.out.println("TreeMap ile sirala : "+(t2-t1));    //TreeMap ile sirala : 277900
        System.out.println("HashMap ile sirala : "+(t3-t2));    //HashMap ile sirala : 50000
        System.out.println("T/H : "+(t2-t1)/(t3-t2));           //T/H : 5










    }
}
