package practise_regular.day06practise;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {



      /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */

    Scanner scanner = new Scanner(System.in);
        System.out.println("yuksekligi giriniz");
        double yukseklik = scanner.nextDouble();
        double  toplamYol = 0;
        int yerevurmaSyisi=0;

        do {

            toplamYol=yukseklik+toplamYol;
            yerevurmaSyisi++;
            toplamYol=yukseklik*05;
            yukseklik=yukseklik*0.5;




            yerevurmaSyisi++;


        }while (yukseklik>=1);

        toplamYol = toplamYol+yukseklik;
        yerevurmaSyisi++;

        System.out.println("Yere vurma Sayisi: " + yerevurmaSyisi);
        System.out.println("TOPLAM ALINAN YOL " + toplamYol);





}
}