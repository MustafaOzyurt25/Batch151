package day31Collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {


        Queue<String> line = new  PriorityQueue<>();  //siralamayi (ONCELIGI) belirleyebiliriz  Priority ile!

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);  // [Egg, Milk, Meat, Orange, Tomatoes]  : burada biz Priority ile simdilik bir
                                  // siralama(oncelik) belirlemedigimiz icin Java kendisi nir siralama yapti.
                                 //  Bizim ekledigimiz gibi bir siralama olmadi.


        //iki uclu : Deque(Double ended senaryolar gunluk hayatta vardir. iki kapili otobus , golf cantasi)
        ////Deque'daki add(), get(), peek(), poll() remove() methodlari , first-last seklinde iki uclu olarak bulunur
        // java her methodu hem last hemde first yapmis.(iki uclu old.dan)


        // Deque => Double ended Queue ==> iki uclu queue
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur

        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");






























    }
}
