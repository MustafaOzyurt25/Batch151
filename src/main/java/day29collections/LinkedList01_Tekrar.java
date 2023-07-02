package day29collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01_Tekrar {
    public static void main(String[] args) {

        LinkedList  <String> ll = new LinkedList<>();

        ll.add("Mustafa");
        ll.add("Mehmet");
        ll.add("Ayse");
        ll.add("Goktug");
        ll.add("Mustafa");
        ll.add("Mehmet");
        ll.add("Ayse");
        ll.add("Goktug");

        System.out.println(ll.remove(2)); // Ayse
        System.out.println(ll);
        System.out.println(ll);  //[Mustafa, Mehmet, Ayse, Goktug, Mustafa, Mehmet, Ayse, Goktug]
        System.out.println(ll.size());// 8
        Collections.sort(ll);
        System.out.println(ll); // [Ayse, Ayse, Goktug, Goktug, Mehmet, Mehmet, Mustafa, Mustafa]

        ll.add(0,"M.Giyasettin");// [M.Giyasettin, Ayse, Ayse, Goktug, Goktug, Mehmet, Mehmet, Mustafa, Mustafa]
        System.out.println(ll);
        ll.addFirst("Isa");
        System.out.println(ll);
        //[Isa, M.Giyasettin, Ayse, Ayse, Goktug, Goktug, Mehmet, Mehmet, Mustafa, Mustafa]

        ll.addLast("Mehmet");
        System.out.println(ll);

//[Isa, M.Giyasettin, Ayse, Ayse, Goktug, Goktug, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]

        System.out.println(ll.removeAll(Collections.singleton("Goktug")));

        System.out.println(ll);
//[Isa, M.Giyasettin, Ayse, Ayse, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]

        System.out.println(ll.pop());// Isa( pop ilk elemani veya nodu silerek getiriyor cut + paste

        System.out.println(ll);// [M.Giyasettin, Ayse, Ayse, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]

        System.out.println(ll.peek());// M.Giyasettin  (ilk elemani getiriyor ama ll den silmiyor copy+paste)
        System.out.println(ll);//[M.Giyasettin, Ayse, Ayse, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]
        System.out.println(ll.poll());//M.Giyasettin(ilk elemani veya nodu silerek getiriyor cut + paste)
        System.out.println(ll); // [Ayse, Ayse, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]

        System.out.println(ll.element());//Ayse ilk elemni verir ama silmez.
        System.out.println(ll); // [Ayse, Ayse, Mehmet, Mehmet, Mustafa, Mustafa, Mehmet]


    }
}
