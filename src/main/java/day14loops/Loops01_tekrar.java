package day14loops;

import java.util.Scanner;

public class Loops01_tekrar {

    public static void main(String[] args) {
     /*
        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz (-)
        //1838 ==> 1 + 3 = 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleae enter an integer");
        String number = scanner.next(); // 1838
        int sum = 0;


        for (int i = 0; i < number.length(); i++) {
            String ch = number.substring(i, i + 1);//1

            if (number.indexOf(ch) == number.lastIndexOf(ch)) {
                sum = sum + Integer.valueOf(ch); //sum =4


            }
        }
        System.out.println(sum);

      */


        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz (+)
        //Alabala ==> la
        String t = "Alala"; // la   // length=5\\
        String y = "";

        for (int i =0 ; i<t.length(); i++){
            String d = t.substring(i,i+1);
            if (t.indexOf(d)!=t.lastIndexOf(d)&&!(y.contains(d))){
                y = d+y; // "la"
            }
        }
        System.out.println(y);

























    }

}
