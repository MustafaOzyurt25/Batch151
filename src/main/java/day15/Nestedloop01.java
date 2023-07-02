package day15;

import java.util.Scanner;

public class Nestedloop01 {

    public static void main(String[] args) {
/*
        1.Example:Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....


        for (int i=1;i<5;i++){                                 // icteki dongu bittikten sonra disa gelir.
                                                             // distdaki herbir durum icin icteki loop calisisr
            System.out.println("Week : " + i);

            for (int k = 1;k<8 ;k++){
                System.out.println("   Day: " + k);

            }


        }


        // Nested while loop
        System.out.println();

        int i =1;
        while (i<5){
            System.out.println("Week : " + i);

            int k = 1;
            while (k<8){
                System.out.println("   Day: " + k);
                k++;

            }






            i++;
        }


 */

     /*   2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user


// su sekli olusturmak icin bir java prg yazin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir sayisi");
        int rows = input.nextInt();

        System.out.println("lutfen sutun sayisi");
        int columns = input.nextInt();

        for (int r=1;r<=rows;r++){

            for (int k=1; k<=columns; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
 */

      /*  3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

       */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir sayisi");
        int row = input.nextInt();

       // System.out.println("lutfen sutun sayisi");  cunku sutun sayisi ile satir sayisi arasin
       // int column = input.nextInt();

        for (int i = 1;i<=row; i++){
            for (int j = 1 ; j<=i; j++ ){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

































    }
}
