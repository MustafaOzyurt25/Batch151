package day29collections;

import java.util.*;

public class LinkedList_Slaytlar1 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ali");
        ll.add("Feyyaz");
        ll.add("Ali1");
        ll.add("Feyyaz2");
        System.out.println(ll.element()); // Ali yi silmeden getirir
        System.out.println(ll);
        System.out.println(ll.poll()); // [Feyyaz, Ali1, Feyyaz2]
        System.out.println(ll);
        try {
            System.out.println(ll.remove(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("O INDEX YOKSA SON INDEXI SIL");
            System.out.println(ll.remove(ll.get((ll.size()) - 1)));
        }
         // Feyyaz
        System.out.println(ll);//[Ali1, Feyyaz2]

        List<Integer> ll1 = new LinkedList<>();
        Queue<Integer> ll2 = new LinkedList<>();
        Deque<String> ll3 = new LinkedList<>();
        Collection<String> ll4 = new  LinkedList<>();
        Iterable<Integer> ll5 = new LinkedList<>();




    }
}
