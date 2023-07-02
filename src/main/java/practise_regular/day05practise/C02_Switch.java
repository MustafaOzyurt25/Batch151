package practise_regular.day05practise;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-4 Arasi Islem Numarasini Giriniz : işlem 1: Bakiye Sorgulama\n" +
                "     işlem 2: Para Cekme\n" +
                "     işlem 3: Para Yatırma\n" +
                "     işlem 4: İşlemi Sonlandırın" );
        int islemNo = scanner.nextInt();

        int bakiye =1000;


        switch (islemNo){
            case 1:
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;
            case 2:
                System.out.println("Cekmek istediniz para miktarini giriniz");
                int cekilecekPara=scanner.nextInt();
                if (cekilecekPara<=bakiye){
                    bakiye = bakiye-cekilecekPara;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz: " + bakiye + " TL");
                }else {
                    System.out.println("Bakiyeniz Yetersiz!");
                }
                break;

            case 3:  //    işlem 3: Para Yatırma
                System.out.println("Lutfen yatirmak istediginiz tutari giriniz");
                int yatirilicakPara = scanner.nextInt();
                if (yatirilicakPara<=2000){
                    bakiye +=yatirilicakPara;  // bakiye=bakiye+yatirilicakPara;
                    System.out.println("Para Yatirma isleminden Sonraki mevcut bakiyeniz "+ bakiye + " TL");
                }else {
                    System.out.println("ATM' de Gunluk Para Yatirma Limiti 2000 TL");

                }
                break;
            case 4:
                System.out.println("Techpro Banki kullandiginiz icin tesekkur ederiz");
                break;
            default:
                System.out.println("Gecerli bir islem nurasini giriniz");




        }

















    }
}
