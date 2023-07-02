package day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01_Tekrar {

    public static void main(String[] args) {


        // MD de spesifik bir elman nasil yazdirlir?

        int arr[][] ={   {2,3},                 {1,0},                     {2,2}                                   };


        System.out.println(arr[1][1]);  //0

        int arr1[] = {2,5,15,20,96};

        System.out.println(Arrays.toString(arr1)); // [2, 5, 15, 20, 96]


        System.out.println(Arrays.deepToString(arr)); // [[2, 3],               [1, 0],                [2, 2]]
        System.out.println(Arrays.toString(arr));// I@6d03e736                [I@568db2f2           [I@378bf509]




        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan  ", "Beyhan  ", "Seyhan  "}, {"Ceyhan", "Kayahan"}};


        //Example 2: Yukaridaki students array'inde, icinde "m" olan isimleri console'a yazdiriniz


//        for (String[] w :students) {
//            for (String s:w ) {
//               if ( s.contains("m")){
//                   System.out.println(s);
//               }
//            }
//        }




        for ( String[] w  : students ) {



            for (String k  :  w){

               if ( k.contains("m")){
                   System.out.println(k);
               }

            }
        }


        // Ex :   Array deki tum elemanlarin carpimini bulunuz.


        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

//        int carpim = 1;
//        for (int[] w:nums) {
//            for (int k :w ) {
//                carpim=carpim*k;
//            }
//        }
//        System.out.println(carpim);














        int carpim = 1;
        for ( int[] w   : nums ) {

                             // {5, 4}, {2, 3, 2}, {7}
            for (  int k :  w) {

               carpim= carpim*k;

            }
        }
        System.out.println(carpim);  // 1680










    }
}
