package day15;

import java.util.Arrays;

public class Arrays01 {
    /*

       1) Array ;ayni data tipinde , coklu data depolamak icin ulusturulan bir yapidir(java olusturmus)
       2) Arraylar primitive dt veya referance'lar ile calisir.
       3) Arrayler " super fast" dir ve memoryde' de cok az yer kaplarlar.
       4) Arraylar ile isimizi halledebilirsek bununla isimizi hallecegiz yoksa collektionslara basvuracaz.



     */
    public static void main(String[] args) {

        //  Array nasil olusturulur
        String[] stdNames = new String[5];


        System.out.println(stdNames);  // @4dd8dc3 ; stdNames adli arrayin adresidir

        // array nasil yazdirilir:

        System.out.println(Arrays.toString(stdNames));

        //Data sayisini yazmazsak java nasil bilsin array' de ne kadarlik data oldugunu?

        // Array'a nasil  eleman eklenir:

        stdNames[0] = "Ajda";  // [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));

        // Array daki spesifik bir elemani nasil bulabiliriz?


        System.out.println(stdNames[3]);// Cuneyt

        // EX 1: stdNames arrayin daki her ismin sonuna yildiz koayrak yazdiriniz.


        for (int i = 0; i < stdNames.length; i++) { // length 5 dir. // length Stringlerde parantezli(method);
            // Arraylarda parantezsiz(method degil) kullanilir

            System.out.println(stdNames[i] + "*");

        }

        // 2.Way: for - each loop ==> Enhanced (Zenginlestirilmis) loop - mumkunse hep.


        for (String w : stdNames) {

            System.out.println(w + "*");
        }


        // Ex 2: bir integer Array olusturun. 5 eleman ekleyiniuz. elemenlarin toplamini bulup konsola yazdiriniz


        int notlar[] = new int[5];

        notlar[0] = 100;
        notlar[1] = 90;
        notlar[2] = 60;
        notlar[3] = 45;
        notlar[4] = 10;

        System.out.println(Arrays.toString(notlar));

        int sum = 0;


        for (int w : notlar) {  // [100, 90, 60, 45, 10]

            sum = sum + w;

            System.out.println(sum);

        }


        // Ex 3: bir char Array olusturun. 3 eleman ekleyiniuz. elemenlarin carpimini bulup konsola yazdiriniz


        char initials[] = new char[3];

        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';


        int carpim = 1;

        for (char w : initials) {   // J  P  A ===>  otomatikmen arrayin tum degerleri gelir w konteynirinin icine//


            carpim = carpim * w;

        }
        System.out.println(carpim);// 384800    // butun degerler biter java loopu kirar. ve sonrasindaki kod calisisr.


    }
}
