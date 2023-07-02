package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    /*
1) AYNI DATA TIPINDEKI COKLU DATAYI DEPOLAMAK IICN ARRAY KULLANIRIZ
2)ICINE KOYACAGIMIZ ELEMAN SAYISINI ONCEDEN BELIRTMEK ZORUNDA KALMAMIZ ARRAYLARIN NEGATIF YANIDIR.
3) Iste  bu esneklik probleminden dolayi java array list olusturmus,
      hic eleman koymazsak eleman sayisini 0 olarak ayarlar. 1000 eleman koyarsak eleman sayisini1000 olarak ayarlar
4) "Array list" yerine sadece "list" de diyebiliriz.
5) Cava ARRAYLIST LERI OLUSTURDUKTDAN SONRA Arrayleri SILMEDI. NEDEN?
    1 - ARRAYLAR SUPER HIZLIDIR 2-ARRAYLAR MEMORYDE COOOK AZ YER KAPLAR

6)ARRAYLAR "PRIMITIVE DATA" TYPELARI VE "REFERANCE" LARI DEPOLAYABILIR AMA
ARRAYLIST' LER NON-PRIMITIVE DATA TYPELARINI DEPOLARLAR. BU YUZDEN ARRAYLISTLER ARRAYLAR DEN DAHA COK YER KAPLARLAR
ve buyuk data type icerdiklerinden daha yavaslar
     */
    public static void main(String[] args) {

        // ARRAYLIST NASIL OLUSTURULUR
        ArrayList<Integer> ages =   new ArrayList<>();
        System.out.println(ages); // []
        ArrayList<String>names= new ArrayList<>(); //

        // ARRAYLIST' E ELEMAN NASIL EKLENIR
// 1. way
        ages.add(12);
        ages.add(24);
        ages.add(9); //add metodu elemanlari giris sirasina (insertion order) gore liste yerlestirir. bknz  : [12, 24, 9]

        System.out.println(ages);  // [12, 24]

// 2. Way
        ages.add(1,99);  // 99 u 1. indexe yerlestirmek istedik ve yaptik

        ages.add(2,100);
        System.out.println(ages);
        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        // 3. way


    ages.addAll(price);  // bir listi diger listin icin e yerlestiriyor
        System.out.println(ages);

        System.out.println(price);

        //  4. way

         ages.addAll(3,price);// bekledigimiz 3. indexe price yerlestirmek.
        System.out.println(ages);

// ARRAY LIST DE ELEMAN SAYISI NASIL BULUNUR:

        int numOfElement =ages.size();
        System.out.println(numOfElement);  // 8     [12, 99, 24, 23, 33, 9, 23, 33]
        System.out.println(ages);


        // spesifik bir eleman nasil alinir

        int sectigimEleman =ages.get(3);  // 23   get() methodu index kullanarak istedimiz elemani verir

        System.out.println(sectigimEleman);  // 23

        // spesifik bir eleman nasil degistirilir:

        ages.set(6,111);
        System.out.println(ages);  // 23 yerine 111 gormeliyiz  [12, 99, 24, 23, 33, 9, 111, 33]


        // spesifik bir eleman var mi?

       boolean r = ages.contains(99);
        System.out.println(r);  // true   199 icin false

        boolean r2 =ages.isEmpty();
        System.out.println(r2);// false

        ages.clear();
        System.out.println(ages); //  []  beklentim [  ]

        boolean r3 =ages.isEmpty();   /// beklentim true
        System.out.println("r3 = " + r3);
        // EXAMPLE 1: bIR LISTIN BOS OLUp OLMADIGINI KONTROL EDEN KODU YAZINIZ

        ArrayList<String> name = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("cuneyt");
        names.add("Brad");

        // 1. yol(not recommended)
        if (names.size()==0){
            System.out.println("list is empty");

        }else {
            System.out.println("list has at least 1 element");
        }

// 2.yol
        if (names.isEmpty()){          // ( recommended)
            System.out.println("list is empty");

        }else {
            System.out.println("list has at least 1 element");
        }















    }


}

