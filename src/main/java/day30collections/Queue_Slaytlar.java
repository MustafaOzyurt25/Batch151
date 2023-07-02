package day30collections;

import java.util.*;
import java.util.stream.IntStream;

public class Queue_Slaytlar {

    public static void main(String[] args) {

        Random r = new Random();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 100; i++) {

            queue.add(r.nextInt(200));

            queue.add(456);
        }


        System.out.println(queue);
        System.out.println(queue.size());




    }
}
