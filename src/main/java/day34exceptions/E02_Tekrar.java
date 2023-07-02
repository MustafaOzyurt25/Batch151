package day34exceptions;

import introduction.day03scanner.Scanner04;

public class E02_Tekrar {

    public static void main(String[] args) {

// Bir String arrayden istenilen bir elemani eleman sirasi ile alan method olusturunuz


        //System.out.println(getelement(4));

        System.out.println(getelement(8));

    }



    private static String getelement(int numberOfElement) {
        String[] arr = {"a","b","t","o","g"};
        String s = null;
       try {
          s = arr[numberOfElement-1];

       }catch (IndexOutOfBoundsException e){
         if (numberOfElement-1> arr.length-1){
             s= arr[arr.length-1];
         }else {
             s=arr[0];
         }


           System.out.println("Don't use index so that");
           System.out.println(e.getMessage());
       }

       return s;

    }
}
