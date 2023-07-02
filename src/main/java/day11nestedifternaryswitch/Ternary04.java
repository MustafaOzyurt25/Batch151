package day11nestedifternaryswitch;

import java.io.Serializable;
import java.util.Scanner;

public class Ternary04 {

    // Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
/*

   1)ternaryde true ve false durumlari icin size verilen data type'lari farkli
  ise olusturdugunuz conteynirin data type'ini "Object" yapin.Object, javada
  bir Class dir. javadaki butun Classlarin "Parent" i dir.Yani babasidir.
  Hz Adem gibi.
Object Classin "Parent"i yoktur...
java'da Parenti olmayan tek Class "Object Class" dir.

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();
        // Serializable serializable = num % 2 == 0 ? num / 2 : " bu sayi ikiye bolunmez";

        Object result = num % 2 == 0 ? num / 2 : "Bu sayi ikiye bolunmez";

        System.out.println(result);


    }
}
