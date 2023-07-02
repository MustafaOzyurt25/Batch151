package day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        // Bir array'in elemanlari array ise buna Multidimensional array denir.

        //Multidimensional array nasil olusturlur:
        // int a
        int a[][] = new int[3][2];// distaki arrayin eleman sayisi , ictekinin eleman sayisi.


        //md arraylera  eleman nasil eklenir

        a[0][0] = 5;
        a[1][1] = 45;

        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        //Multi dim. ARRAYLERI KONSILA YAZDIRMAK ICIN deepToString () methodunu kullaniriz.

        System.out.println(Arrays.toString(a)); // [[I@4dd8dc3, [I@6d03e736, [I@568db2f2]

        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        // MD de spesifik bir elman nasil yazdirlir?
        System.out.println(a[1][1]);  // 45   burda zaten adresi tarif etmisim neden method kullanayim?

// spesifik bir eleman nasil yazdirilir
        System.out.println(Arrays.toString(a[1]));  // [81, 45]  cunku bu bir array. (icteki array)


        // kisa yoldan  md array nasil olusturulur:

        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan  ", "Beyhan  ", "Seyhan  "}, {"Ceyhan", "Kayahan"}};


        int sum = 0;   //  {          {"Ali","Kemal"},    {"Cemal"},         {"Ayhan  ","Beyhan  ","Seyhan  "},     {"Ceyhan","Kayahan"}                    };
        for (String[] w : students) {


            sum = sum + w.length;  // 2 + 0 = 2  .
                                    // 2+1= 3
                                    // 3+3 = 6
                                    // 6+2 =8

        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde, icinde "m" olan isimleri console'a yazdiriniz

        //String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan  ", "Beyhan  ", "Seyhan  "}, {"Ceyhan", "Kayahan"}};

        for (String[] w : students) {


            for (String k : w) {


                if (k.contains("m")) {
                    System.out.println(k);
                }


            }


        }


////////////////////////////////////////////////   example:            /////////
// Ex :   Array deki tum elemanlarin carpimini bulunuz.

        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};



        int result = 1;

        for (int[] w : nums) {

            for (int k : w) {

                result = result * k;
            }
        }

        System.out.println(result);   // 1680
    }


}
