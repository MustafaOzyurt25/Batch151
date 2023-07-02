package day15;

import java.util.Arrays;

public class Array02_Tekrar {

    public static void main(String[] args) {
/////////////////////////////////////////  2. tekrar////////////////////////////////////////////////////////////
        //   Ex: grades arrayindaki en buyuk ve en kucuk grade in toplmaini bulunuz (-)

        int grades[] = {50,110,75,200,100}; //50+200


       Arrays.sort(grades);
        System.out.println(grades[0] + grades[grades.length - 1]);

// Ex: size verilen bir String Array deki isimlerden 5 karakterden az karakter icerenleri consola yazdirini

        String arry[] ={"Ayse","Fatma","Kuri","Buri"};


        for (String w:arry ) {

            if (w.length()<5){
                System.out.println(w);
            }
        }
        // Ex: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
//        // isimlerden onceki isimleri consola yazdiriniz.

        Arrays.sort(arry);
        for (String w:arry) {
            if (w.startsWith("F") ) {
               break;
            }
            System.out.println(w);
        }

        // Ex5: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
       // isimler  haric diger isimleri  consola yazdiriniz

        System.out.println("************************");
        for (String w:arry ) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }






  /////////////////////////////////////////////////// 1.tekrar     /////////////////////////////////////////////////////////////////////

//        int grades[] = {50,110,75,200,100};
//        System.out.println(Arrays.toString(grades));  //
//       Arrays.sort(grades);
//        System.out.println(grades[0]+grades[grades.length-1]); // 250
//
//        // Ex: size verilen bir String Array deki isimlerden 5 karakterden az karakter icerenleri consola yazdirini
//
//        String arry[] ={"Ayse","Fatma","Kuri","Buri"};
//
//
//        for (String w :arry){
//            if (w.length()<5){
//                System.out.println(w);
//            }
//        }
//
//        // Ex: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
//        // isimlerden onceki isimleri consola yazdiriniz
//
//        Arrays.sort(arry);
//        System.out.println(Arrays.toString(arry)); // [Ayse, Buri, Fatma, Kuri]
//
//        for (String w:arry
//             ) {
//           if ( w.charAt(0)<'F'){
//               System.out.println(w);
//           }
//        }
//
//        // Ex5: size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra 'F' ILE BASLAYAN
//        // isimler  haric diger isimleri  consola yazdiriniz
//
//        for (String w : arry){   // [Ayse, Buri, Fatma, Kuri]
//
//            if (w.startsWith("F")){
//                continue;
//
//            }
//            System.out.println(w);
//
//        }
//
//
//
















































    }
}
