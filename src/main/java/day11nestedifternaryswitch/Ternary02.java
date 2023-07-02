package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {


    // kullanicidan bir sayi aliniz , o sayi pozitif ise
    // ekrana pozitif yazdiriniz. degilse ekrana poz. degil yazdiriniz.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("pleae enter an integer.");

        int num = scanner.nextInt();

        String result = num>0 ? "pozitif" : "poz. degil";
        System.out.println(result);


    }
}
