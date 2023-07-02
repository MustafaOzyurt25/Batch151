package day29collections;

import java.util.LinkedList;

public class LinkedList_Slaytlar2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ali");
        ll.add("Feyyaz");
        ll.add("Ali1");
        ll.add("Feyyaz2");
        ll.add("Alimas");
        ll.add("Feyyazcan");
        ll.add("Aliye");
        ll.add("Feyyaz huseyin");

        System.out.println(ll); //[Ali, Feyyaz, Ali1, Feyyaz2, Alimas, Feyyazcan, Aliye, Feyyaz huseyin]

        ll.add(2,"kucukmetin");//[Ali, Feyyaz,kucukmetin, Ali1, Feyyaz2, Alimas, Feyyazcan, Aliye, Feyyaz huseyin]
        System.out.println(ll);//              [Ali, Feyyaz, kucukmetin, Ali1, Feyyaz2, Alimas, Feyyazcan, Aliye, Feyyaz huseyin]


        System.out.println(ll.get(1));//Feyyaz

         System.out.println(ll); // [Ali, Feyyaz, kucukmetin, Ali1, Feyyaz2, Alimas, Feyyazcan, Aliye, Feyyaz huseyin]



    }
}
