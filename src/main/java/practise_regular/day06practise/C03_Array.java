package practise_regular.day06practise;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[4];
        for (int i = 0; i < 4; i++) { // kullaniicdan 4 tane rakam alcagimiz icin 0 dan 4' e kadar for dongusune aldik
            System.out.println("bir rakam giriniz");
            int rakam = scanner.nextInt();
            arr[i]=rakam;// kullaniicdan aldigimiz her rakami arr'e assign ettik




        }
        System.out.println(Arrays.toString(arr));


        double toplam = 0;
        for (int w:arr) {

            toplam=w+toplam;

        }
        double ortalama = toplam/arr.length;

        System.out.println("ortalama = " +ortalama);

        for (int w:arr) {
            if(w>ortalama){
                System.out.print(w+" ");
            }

        }










    }


}
