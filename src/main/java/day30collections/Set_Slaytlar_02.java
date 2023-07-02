package day30collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_Slaytlar_02 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> ts = new TreeSet<>();

        Random r = new Random();


        long t1 = System.nanoTime();
        for (int i = 0; i < 100; i++) {

            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.size());

        long t2 = System.nanoTime();


        for (int i = 0; i < 100; i++) {

            ts.add(i);
        }
        System.out.println(ts);
        System.out.println(ts.size());
        long t3 = System.nanoTime();


        System.out.println("ts : "+(t3-t2));
        System.out.println("hs : "+(t2-t1));




    }


}
