package javaders.day04memorykullanimiwrapperclass;

public class Runner04 {

    public static void main(String[] args) {

        OgrenciEmrah ogrenci = new OgrenciEmrah();
        Araba araba = new Araba();
        String renk = araba.renk;
        String model = araba.model;
        int fiyat = araba.fiyat;
        araba.hareket();
        araba.dur();
        araba.yakit();




        System.out.println(ogrenci.name);
        System.out.println(ogrenci.brans);
        System.out.println(ogrenci.yas);
        ogrenci.study();
        ogrenci.derseDevam();


    }//main
}//class