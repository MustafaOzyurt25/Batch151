package practise_regular.day02practise;

import java.util.Scanner;

public class c03_ifElse {
    public static void main(String[] args) {
         /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("uc karakterden daha uzun bir kelime giriniz");
        String kelime = scanner.next();
        if (kelime.length()<4){
            System.out.println(" 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz ");

        }else {

            String sonUcHarf =kelime.substring(kelime.length()-3); // dinamik sekilde bir index vermek icin
                                                                            //mutlaka bir kelime uzerinden yuru.
                                                                           // yoksa kafanda tutarak  dogru sonuca ulasamayabilirisin. burda biz "burak" uzerinden gittik
            System.out.println(sonUcHarf+kelime+sonUcHarf);
        }






    }

}
