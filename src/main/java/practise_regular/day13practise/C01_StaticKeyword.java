package practise_regular.day13practise;

public class C01_StaticKeyword {
    // Bir tane static variable, bir tane instance variable olusturalim , bunlarin kullanimini main method icinde gorelim

    static int sayi1;

    int sayi2;

    public static void main(String[] args) {

// obj2 uzerinden static methodu artirabilir miyiz? Bu mumkun. obj2.sayi1++; Normalde object olmadan artirmayi zaten yapabiliyorduk.
        C01_StaticKeyword obj1 = new C01_StaticKeyword();
        C01_StaticKeyword obj2 = new C01_StaticKeyword();

        System.out.println(sayi1); //  0

        System.out.println(obj1.sayi2); // 0

        sayi1++;

        obj1.sayi2++;

        System.out.println(sayi1);
        System.out.println(obj1.sayi2);

        System.out.println(obj2.sayi2); // 0


        System.out.println(obj1.sayi1); // 1  // static olan variable'i object ismi ile birlikte sout icine yazinca calisabilir,
                                              // ama java bunu yalin haliyle yazmamizi tavsiye ediyor.

      obj2.sayi1++;

      obj2.sayi2++;


        System.out.println(obj2.sayi2); // 1


        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi2);//1

        System.out.println(obj1.sayi1);// 2

        obj1.sayi1++;

        obj1.sayi2++;

        System.out.println(obj1.sayi2);// 2


        System.out.println(obj2.sayi1);//3

    }
}
