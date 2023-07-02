package day31Collectionsmaps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01_Tekrar {
    public static void main(String[] args) {


        Queue<String> wareHause = new LinkedList<>();// ilk girenin ilk cikacagi bir liste veya kuyruk

        wareHause.add("Milk");
        wareHause.add("Meat");
        wareHause.add("Bread");
        wareHause.add("Egg");
        wareHause.add("Cheese");

        System.out.println(wareHause); //[Milk, Meat, Bread, Egg, Cheese]
        System.out.println(wareHause.remove());  //Milk
        System.out.println(wareHause);  // [Meat, Bread, Egg, Cheese]

        System.out.println(wareHause.poll()); // Meat getirir
        System.out.println(wareHause);  //[Bread, Egg, Cheese]: listeden Meat i siler

        System.out.println(wareHause.peek()); // Bread i getirir.
        System.out.println(wareHause); // listeden Bread i silmez  [Bread, Egg, Cheese]

        wareHause.clear();
        System.out.println(wareHause);
        System.out.println(wareHause.poll());  // null




    }





}
