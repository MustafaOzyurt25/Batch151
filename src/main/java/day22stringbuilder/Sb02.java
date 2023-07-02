package day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java is easy");

        System.out.println(sb1);
        sb1.reverse();  // ysae si avaJ
        System.out.println(sb1);  // bu stringi reverse methodu kullanarak  ters cevirebilirim.
                                         // ama loop kullanarak da yapabilirim.


        sb1.deleteCharAt(6);
        System.out.println(sb1);// ysae s avaJ

        // baslangic indexinden bitis indexine(haric) kadar olan kismi silmek;
        sb1.delete(4,7);
        System.out.println(sb1); // ysaeavaJ


        sb1.replace(2,5,"X"); // (2,5,"X") : baslangic indexi dahil
                                              // ama bitis indx i haric olarak kullanilir/indx 2,3,4 dekiler degisti
        System.out.println(sb1);  // ysXvaJ

        sb1.insert(3,"2023");  // EKLEME ( 2 karakter gec 2023'u koy0
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Zava");

        int r1 =sb2.compareTo(sb3); //   -1 eksi

        System.out.println(r1);// 0==> alfabetik olarak ayni siradalar manasina gelir.
                                      // mesela sonuc - 3 ise - once demek 3 ise nekadar once
                                      // mesela sonuc + 3 ise + sonra demek 3 ise nekadar sonra



        int r2 =sb3.compareTo(sb2);
        System.out.println(r2);    // 16:   sb3 sb2 den 16 kadar kutu sonra


       String str = sb2.toString().toUpperCase();   //sb2.toString().toUpperCase(); artik String old .dan String
                                                    // variable a atamamiz gerekti

        System.out.println(str);            // JAVA


















    }

}
