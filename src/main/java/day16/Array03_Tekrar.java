package day16;

import java.util.Arrays;

public class Array03_Tekrar {

    public static void main(String[] args) {
        // spesifik bir elemnin arrayde olup olmadigini bulan kodu yaziniz
        String names[] = {"K", "C", "Laptop", "A", "S"};

     String s ="K";
     int counter=0;
        for (String w :names ) {
           if (w.equals(s)){
               counter++;
               break;
           }
        }
        if (counter>0){
            System.out.println("Demekki names arrayinda "+s+" elemani var!");
        }else {
            System.out.println("Demekki names arrayinda "+s+" elemani yok!");
        }


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));  // [A, C, K, Laptop, S]

        int indxS=Arrays.binarySearch(names,s);
        System.out.println(indxS);



    }


}
