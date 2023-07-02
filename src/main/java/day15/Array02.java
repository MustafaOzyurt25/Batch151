package day15;

import java.util.Arrays;

public class Array02 {
    /*
    1) Application larda "data" ile bu datalari isleyen kodlar (Logic) birbirinden ayrilir
      yani logic dataya bagimli olmamali.
      dataya bagimli olrak yazilan kodlar "hard kod" dur; bakiniz asagidaki ornege.

     */

    public static void main(String[] args) {


        // Arraylar i kisa yoldan nasil olusturabiliriz?

        int grades[] = {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));  // [67, 98, 100, 34, 76]


      //   Ex: grades arrayindaki en buyuk ve en kucuk grade in toplmaini bulunuz

        Arrays.sort(grades);  // kucukten buyuge siraliyor bu kodu calistirdigimizda;
        System.out.println(Arrays.toString(grades));  // [34, 67, 76, 98, 100]
        System.out.println(grades[0]+grades[grades.length-1]);



        // Ex: size verilen bir String Array deki isimlerden 5 karakterdendn az karakter icerenleri consola yazdirini

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";     // tom ve ajda
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

                              // Ajda Cuneyt .....
        for (String w : stdNames){

            if (w.length()<5){
                System.out.println(w);
            }

        }

        // Ex: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
        // isimlerden onceki isimleri consola yazdiriniz



        String stdName[] = new String[5];
        stdNames[0] = "Ajda";     // tom ve ajda
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "BAyhan";
        stdNames[4] = "Filiz";

        // Ajda Cuneyt .....

       Arrays.sort(stdName);
        for (String w : stdName){


            if (w.startsWith("F")){
               break;
            }
            System.out.println(w);

        }

        // Ex4: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
        // isimlerden onceki isimleri consola yazdiriniz

/// ??????????????????????????????????????????? gectim





        // Ex5: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
        // isimler  haric diger isimleri  consola yazdiriniz






        Arrays.sort(stdName);

        for (String w : stdName){


            if (w.startsWith("F")){
               continue;
            }else {
                System.out.println(w);
            }


        }









    }
}
