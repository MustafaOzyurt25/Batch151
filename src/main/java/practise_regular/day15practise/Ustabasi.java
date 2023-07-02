package practise_regular.day15practise;

public class Ustabasi extends Isci{


    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {



        Ustabasi ustabasi1 = new Ustabasi();

        ustabasi1.isim="Murat"; // personel
        ustabasi1.soyisim="Gokcek";//Personel
        ustabasi1.saatUcreti=15;   // muhasebe
        ustabasi1.maas= ustabasi1.maasHesaplama(); // muhasebe
        ustabasi1.statu="Isci";//muhasebeden
        ustabasi1.isciStatu="Ustabasi"; // isci clasindan aldik getirdik.

        ustabasi1.mesai();// isci

        System.out.println(ustabasi1.toString());

    }

}






