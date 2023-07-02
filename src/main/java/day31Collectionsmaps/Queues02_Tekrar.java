package day31Collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02_Tekrar {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");


        System.out.println(line);  // [Egg, Milk, Meat, Orange, Tomatoes]  : onceligi java belirlemis


        Deque<String> deque = new LinkedList<>();
        deque.add("Milk");
        deque.add("Meat");
        deque.add("Egg");
        deque.add("Orange");
        deque.add("Tomatoes");

        System.out.println(deque);  // [Milk, Meat, Egg, Orange, Tomatoes]  bizim verdigimiz sira (LinkedList<>() kullandik!)

        System.out.println(deque.pollLast()); // Tomatoes
        System.out.println(deque); //  Tomatoes i  siler  [Milk, Meat, Egg, Orange]


    }
}
