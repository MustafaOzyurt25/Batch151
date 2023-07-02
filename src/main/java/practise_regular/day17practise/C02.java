package practise_regular.day17practise;
// Bir tane txt dosyası olusturunuz.
// txt dosyasının icerisine cumleler yazınız
// Olusturdugunuz txt dosyasına ulasınız.
// icerisindeki cumleleri yazdırınız

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {

    public static void main(String[] args)  {

        /*
        Bir kod yazilirken olasi exceptionlari ongorup exception olustugunda javanin ne yapmasini istedigimize karar
        vermeliyiz.

        1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak;
        method isminin yanina olusabilecek exceptionu deklare ederiz

        2-  Eger exception olustugunda da kodun calismaya devam etmesini istiyorsak;
        sorun olusturabilecek kodu try blogunun icine yazmaliyiz.
        catch bloguna ise exception durumunda javanin ne yapmasini istedigimizi yazmaliyiz
         */

        String dosyaYolu ="practise_regular/day17pra111ctise/dosya.txt";  // elimde dosya yolu mevcut


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k=0;
            while ((k=fis.read())!=1){
                System.out.println((char) k);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


/*
Exceptionslar icin parent child iliskisi mevcuttur:
eger bir kod icin birden fazla exception olusma ihtimali varsa oncelikle olasi exceptinlar parent-child iliskisi tasiyormu
diye bakmamiz gerekiyor.eger parent-child iliskisi yoksa istedigimiz sirada catch cumleleri olusturabiliriz

eger parent child ilskisi varsa sadece parent exceptionu yazabiliriz.
veya ikisini de yazmak istersek child ' i once parenti sonra yazmaliyiz
 */