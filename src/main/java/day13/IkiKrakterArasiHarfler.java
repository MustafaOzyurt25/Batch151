package day13;

import java.util.Scanner;

public class IkiKrakterArasiHarfler {
    public static void main(String[] args){

        String s = "first letter";// i ile ilk  e rasindaki harfleri length 12; index 11


        for (int i = 0;i<s.length() ; i++ ){

            String ch = s.substring(i,i+1);
            if (i>0 && i<8 ){
                System.out.print(ch + " ");
            }
        }
// verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz
        System.out.println("*****************************************");
        Scanner input = new Scanner(System.in);


        System.out.print("First Letter : ");
        char ch1 = input.next().charAt(0);

        System.out.print("Second Letter : ");
        char ch2 = input.next().charAt(0);

        if(ch1 > ch2)
        {
            for (char a = ch2; a < ch1; a++) {
                System.out.print(a + " ");
            }
        }

        else
        {
            for (char a = ch1; a < ch2; a++)
            {
                System.out.print(a + " ");
            }
        }






    }


}
