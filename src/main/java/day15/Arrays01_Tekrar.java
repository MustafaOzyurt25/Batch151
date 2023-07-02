package day15;

import java.util.Arrays;

public class Arrays01_Tekrar {
    public static void main(String[] args) {


        String[] stdNames = new String[5];


        stdNames[0] = "Ajda";  // [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));

        // Array daki spesifik bir elemani nasil bulabiliriz?


        System.out.println(stdNames[4]);//Filiz


        // EX 1: stdNames arrayin daki her ismin sonuna yildiz koayrak yazdiriniz.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i]+"*");
        }






        // 2.Way: for - each loop ==> Enhanced (Zenginlestirilmis) loop - mumkunse hep
        for (String w : stdNames) {
            System.out.println(w + "*");

        }


        // Ex 2: bir integer Array olusturun. 5 eleman ekleyiniuz. elemenlarin toplamini bulup konsola yazdiriniz

       Integer[] arr = new Integer[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=60;
        arr[3]=10;
        arr[4]=10;

        Integer t = 0;
        for (Integer w:arr ) {
            t=w+t;
        }
        System.out.println(t);





        // Ex 3: bir char Array olusturun. 3 eleman ekleyiniuz. elemenlarin carpimini bulup konsola yazdiriniz


        Character crr[] = {'M','A','o'};

        Integer carpim = 1;
        for (Character w:crr) {
            carpim=carpim*w;
        }
        System.out.println(carpim);  // 555555



    }

}
