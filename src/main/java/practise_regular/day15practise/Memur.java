package practise_regular.day15practise;

public class Memur extends Muhasebe{
   //memur1 obj'i , memur classinin objesi olmasina ragmen, inherit ettigi muhasebe ve onunda parenti olan personel
    // classlarindaki tum datalari alabilir


    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    // toString() metodu tum objelerin ozelliklerini yazdirmak icin pratik bir yontemdir.
    public static void main(String[] args) {

        Memur memur1 = new Memur();

        //Personel Cals'indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="03124558795";

        //Muhasebe classindan
        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesaplama();


        System.out.println(memur1.persNo);// 1001
        System.out.println(memur1.maas); // 2400

        System.out.println(memur1.toString());



        Memur memur2 = new Memur();


        memur2.persNo=1002; // Personel Clasindan
        memur2.saatUcreti =10;// Muhasebe Classindan
        memur2.maas=memur2.maasHesaplama(); // muhasebe

        System.out.println(memur2.toString());


    }

}
