package javaders.day10ifstatement;

public class Strings_Manipulations_Exercises_From_Mentor_Hakan {

    public static void main(String[] args) {
//***************** INDEXOF()**********************************************************************************************
     /* String text = "Good";
        System.out.println(text.indexOf('G'));       // G'nin indexi
        System.out.println(text.indexOf('d', 4));// -1
        System.out.println(text.indexOf("od")); //od nin indexi 2
        System.out.println("H harfinin indexi = " + text.indexOf('H')); // -1  : bulunamad&#x131;, yok
        int  gHarfininIndexi = text.indexOf("G");
        System.out.println("gHarfininIndexi = " + gHarfininIndexi);// 0

        String cicek = "Gunebakan";
        System.out.println(cicek.indexOf('a'));//5
      int indexOf_E = cicek.indexOf('e') ;
      System.out.println("indexOf_E = " + indexOf_E);//3

 //************** lastIndexOf()********************************************************************************************
      String cicek = "Gunebakan";
      System.out.println("cicek.lastIndexOf(\"bakan\") = " + cicek.lastIndexOf("bakan")); //4
        System.out.println("cicek.indexOf('n') = " + cicek.lastIndexOf('n')); //8
        String textt = "halukbilgin";
        System.out.println(" k' nin indexi = " + textt.lastIndexOf('k')); //4
        System.out.println(" k' nin indexi = " + textt.indexOf("k"));//4
 */

/*
 * charAt()
 * İstenen noktadaki karakteri verir,
 * karakterlerin sırası 0 dan başlar, buna index denir.
 * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
 *  0123456789012
 */



























        String sehir = "istanbul";
        System.out.println(sehir.charAt(4));// n
       // System.out.println(sehir.charAt(9));// Stringin karakter sayisinin disinda bir sayi girme! Exeption firlatir!

        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */

        String ss= "Her ders Java gibi olsa";
        System.out.println("14 ile 19 arasinadaki parca = " + ss.substring(14,19));                  //gibi parcasini al.
        System.out.println("5. indexdeki karakter veya 6. karaktr = " + ss.substring(5, 6)); // e
        System.out.println("ilk on karakter = " + ss.substring(0, 10)); // Her ders J
        System.out.println("son 10 karakter = " + ss.substring(13));// son 10 karakter    (birspace)gibi olsa
        System.out.println("ss.substring(8,8) = " + ss.substring(8, 8)); // hiclik
        //System.out.println(ss.substring(8, 7));// RTE
        System.out.println(ss.length());//23 boyu.uzunlugu. indexi 1 eksik olur yani 22. index var en son
        System.out.println("son karakter = " + ss.substring(22));//a
        System.out.println("Stringin son karakteri= " + ss.substring(ss.length() - 1));//  (lngth-1!) a
        System.out.println("ss.substring(23) = " + ss.substring(ss.length()));//hiclik .length yazilirsa hiclik olur
        // System.out.println("length'den buyuk yazarsan RTE " + ss.substring(24));  24>lenght. old.dan RTE

        // ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
        String str1 = ss.replaceAll("[a-zA-Z ]", "*");
        String str2 = ss.substring(10);
        System.out.println("= " +str1+str2);



//********** substring()**************************************************************************************************
         /* Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.


        String ss= "Her ders Java gibi olsa";


        System.out.println(ss.substring(10)); //ava gibi olsa: 10.index dahil(inclusive) sonuna kadar tum String
        System.out.println(ss.substring(ss.length()-10)); // gibi olsa: son 10 harfi yazdirin

        // ilk 10 karakteri alma
        System.out.println(ss.substring(0, 10));//Her ders J: substring(0, 10) yazildiginda
        // 0 inclusive, 10 exclusive
        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(ss.substring(10));//ava gibi olsa

        System.out.println(ss.substring(10, 10)); //"" :hiclik baslangic indexi olsun der, ama bitis indexi olmasin der, Java son soyleneni yapar

        //System.out.println(str.substring(8, 7)); // RTE

        System.out.println(ss.substring(22)); //a: length()-1 -> son karakter
        System.out.println(ss.substring(23)); //bosluk ...length() -> bos
        //System.out.println(str.substring(24)); // length()'den buyuk sayi yazarsak RTE


        // ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin

        System.out.println(ss.replaceAll("\\w", "*")+ss.substring(10)); //**********ava gibi olsa
        System.out.println("----------");


         */
//************** lastIndexOf()*

       /*  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
       *  indexOf un sondan olan hali fakat index numaraları değişmez.

       * System.out.println("sondaki n harfinin index >>>> " + cicek.lastIndexOf('n'));  //8
        System.out.println("----------");
        String textt = "halukbilgin";
        System.out.println("En sondaki i nun indexi = " + textt.lastIndexOf("i")); //9
        System.out.println("ilk baştan i nun indexi = " + textt.indexOf("i")); //6
        System.out.println("----------");
       *
       *
       *
       *
       *
       *
       * */











/*
          indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          // contains den farkı indexini verir, contains ise true false
        // 012345678
        String text = "Good";
        System.out.println("G harfinin indexi = " + text.indexOf("G")); // indexler 0 dan başlar
        System.out.println("d harfinin indexi = " + text.indexOf('d')); //3
        System.out.println("H harfinin indexi = " + text.indexOf("H")); // -1  : bulunamadı, yok
        System.out.println("od nin indexi = " + text.indexOf("od")); // 2 : var ise ilk harfin indexini verir
        int index = text.indexOf("o"); // int değişkene atanabilir. küçük o harfi
        System.out.println("index = " + index); // 1 :  aynı karakterden birden fazla var ise ilkini verir.

        String cicek = "Gunebakan";

        int index1 = cicek.indexOf('e');
        System.out.println("e harfi metinde kacinci indexte >>>>> " + index1); //3
        System.out.println("----------");
 */











    }// main
}//Class