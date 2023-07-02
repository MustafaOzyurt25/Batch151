package day31Collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        //kuyruk demek
        Queue<String>  wareHause = new LinkedList<>(); // FIFO(first in-first out) ILK GIREN ILK CIKAR. Kaynak yapmak yok!
                                                       // arka tarafta kapi yok.alt taraftan cikis yok

        wareHause.add("Milk");
        wareHause.add("Meat");
        wareHause.add("Bread");
        wareHause.add("Egg");
        wareHause.add("Cheese");
        System.out.println(wareHause);  // [Milk, Meat, Bread, Egg, Cheese]   elemanlari verdigimiz siraya gore dizdi

        // Constructor olarak LinkedList KULLANILDIGI ICI Queu da mecburen o siraya gore yapti


        wareHause.remove();
        System.out.println(wareHause);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHause.peek()); // Meat
        System.out.println(wareHause); // [Meat, Bread, Egg, Cheese]

        System.out.println(wareHause.element());//Meat  eger Que bossa hata verir
        System.out.println(wareHause); // [Meat, Bread, Egg, Cheese]


        System.out.println(wareHause.poll()); // Meat
        System.out.println(wareHause); // [Bread, Egg, Cheese]     cut yapti


        wareHause.clear();

        System.out.println(wareHause.poll());  // null
        System.out.println(wareHause.remove());  // Exception



















    }
}
