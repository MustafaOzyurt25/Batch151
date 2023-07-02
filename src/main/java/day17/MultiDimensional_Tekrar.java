package day17;

import java.util.Arrays;

public class MultiDimensional_Tekrar {
    public static void main(String[] args) {


        String s[][] = { {"A", "K"} , {"P","M"} , {"C","Z"} };  // [[Ljava.lang.String;@4dd8dc3,
                                                               // [Ljava.lang.String;@6d03e736,
                                                              //  [Ljava.lang.String;@568db2f2]
        System.out.println(Arrays.toString(s));

        System.out.println(Arrays.deepToString(s));  // [[A, K], [P, M], [C, Z]]


        System.out.println(s[1]);  //  [Ljava.lang.String;@6d03e736
        System.out.println(Arrays.deepToString(s[1]));//  [P, M]
        System.out.println((s[2][1]));  // Z


        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Set", "deli"}, {"ceyhan", "Kayahan"}};

        int sum = 0;
        for (String [] w : students ){

          sum=sum+ w.length;
        }



        System.out.println(sum);
        System.out.println();

        // bir int md Array olusutrunuz tum elemanlerin carpinmini hesapalyiniz


        int nums[][] = {{5, 4}, {2, 3, 2}, {7},{9,8}};
        int carpim = 1;
        for (int[] a :nums){
            for (int z :a) {

              carpim = carpim*z;

            }
            System.out.println(carpim);
        }


        // Ex 4: iki boyutlu bir Arrayi tek boyutlu bir Arraya ceviriniz

        int num[][] = {{5, 4}, {2, 3, 2}, {7},{9,8}};

        int[] y ={};
        for (int[] tek:num){
           y= tek;
        }
        System.out.println(Arrays.toString(y));












    }









    }

