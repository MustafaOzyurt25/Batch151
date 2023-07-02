package practise_regular.day05practise;

import java.util.Scanner;

public class C06_While {



    public static void main(String[] args) {


        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız



        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scanner = new Scanner(System.in);
        System.out.println(" bir sayi giriniz");
        int sayi = scanner.nextInt();


        int i =sayi;
        while (i%10!=0){

            System.out.print(i +" ");

            i++;

        }









    }
}
