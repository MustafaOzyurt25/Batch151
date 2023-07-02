package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.addFirst("Kemal");
        s.addLast("Ajdar");   // esasinda add ile ayni degilmi?


        System.out.println(s);

        s.add(2, "Esen"); /// biz iki diyince o node3 yapar. yani indeex olarak degil .
                                    // Arka planda nereye koyacagini bilir aslinda.index degil 2
        System.out.println(s);

//        s.remove(2);
        System.out.println(s);
//        s.remove();
        System.out.println(s);  // [Steve, Ajda, Muge, Cuneyt, Esra, Ajdar]

//        s.removeFirstOccurrence("Esra");

//        System.out.println(s);
//        s.removeLastOccurrence("Esra");
        System.out.println(s);// [Kemal, Esra, Esen, Steve, Ajda, Muge, Cuneyt, Ajdar] son gorunum silindi
/*
Retrieves, but does not remove, the head (first element) of this list.
Returns: the head of this list, or null if this list is empty
 */
        String r1 = s.peek(); // ilk elemani silmeden size verir/ copy+paste

        System.out.println(s);


        String r2 = s.poll();
        System.out.println(r2);//Kemal  Size ilk node u verir ama bunu siler / cut+paste
        System.out.println(s);//[Esra, Esen, Steve, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
Throws: NoSuchElementException – if this list is empty
note: peek() ile element() ikisi de ilk elemani size verir. AMA peek() list bos old.da size "null" verir.
 element() ise hata verir.
         */

        String r3 = s.element();
        System.out.println(r3); // esra
        System.out.println(s);


        /*
        Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
This method is equivalent to removeFirst().
Returns:
the element at the front of this list (which is the top of the stack represented by this list)
Throws:NoSuchElementException – if this list is empty

         */
        s.pop();
        String r4 = s.pop();
        System.out.println(r4); //  Esen
        System.out.println(s); //  [Steve, Ajda, Muge, Cuneyt, Esra, Ajdar]   esen



       /*
1) LinkedList'ler node silme ve eklemede cok basarili old.lari icin eklme ve silme islemlerini coklukla
      yapacaginiz zaman LinkedList kullaniriz.LinkedList'ler node bulma'da basarisizlardir.
      2) ArrayList ' ler indexleri adres gibi kullanir, bu yuzden ArrayLisler "search" islemlerinde cok basarilidirlar
      Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (muze ziyatretler giib) LinkedList,
      search islemleri yapacaksa(Amerika eyaletelri , birkere eyalet listesini olusturdunuzmu nufuslarina,
       ekonomik istatistiklerine vs arastirilabilir artik) ArrayList kullaniniz/
       ArrayList'ler eleman silme ve ekleme de tekrar indexleme yapmak zorunda old.dan eleman ekleme ve silme'de
       basarisizdirlar.Bunun icin LinkedList olusturulmus.ArrayListler eleman silme ve eklemede yavastirlar.
       Cunku tekrar indexlemeye ihtiyac duyarlar.ArrayListler eleman bulmada cok basariliidir
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz. LinkedList'ler tren vagonlarina benzerler.
        */
    }
}
