package day33Maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        /*
        //Java Hashing Technic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
//Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
//Bir bucket'a istediginiz kadar entry koyabilirsiniz.
//Java bucket'larin icinde LinkedList kullanir.(istediginiz kadar node ekleme-silme(owerwrite))
//Eger daha once ayni entry ile bir "HashCode" uretildiyse Java tekrar bir "HashCode" uretmez ama "value" degisti ise "overwrite" islemi yapar.
//Java 12 bucket doldugunda,(dahada bucket'larin dahada hantallasmamasi icin) yeni 16 adet bucket verir.(bu durumda artik hashcode'lari 32 ye bolmemiz gerek)
         */
        //HashMap arkasinda calisan mekanizma nasil calisir?


        HashMap<String,String> capitals = new HashMap<>(); // bknz SS'ler java ders---> day33Maps ekran goruntuleri

        System.out.println(capitals);  // {}

        capitals.put("Turkey","Ankara");  // {Turkey=Ankara}
        System.out.println(capitals);
        capitals.get("Turkey");


        capitals.put("USA","Wahington");

        capitals.put("Italy","Roma");

        capitals.get("Turkey");

        capitals.put("Turkey","Istanbul");

        System.out.println(capitals.get("Turkey"));

    }
}
