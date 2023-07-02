package practise_regular.day10practise;

public class C01_Instance {
                 /*

    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

*/


    int sayi;  // 0
    String isim; // null
    boolean ogrenciMi; // false

    char c;


    public static void main(String[] args) {


        C01_Instance obj = new C01_Instance();

        System.out.println(obj.sayi);


        System.out.println(obj.isim); //null

        System.out.println(obj.ogrenciMi); // false

        System.out.println(obj.c);//

        // Instance variable'lar objeye baglidir, hangi obje uzerinden degisiklik yapildiysa
        // yapilan bu degisiklik sadece o objeyi baglar
    }


}
