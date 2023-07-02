package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
/*
kullanicidan alinan iki sayidan kucuk olanini ekrana yaziniz
 */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer");
        int first = input.nextInt();
        int second = input.nextInt();
        // 1. yol
        if (first<second){System.out.println(first);}else {System.out.println("second");}


        // 2.yol: use ternary
        int result =  first<second ? first : second;
        System.out.println(result);







    }
}
