package practise_regular.day15practise;

public class Surekliİsci extends Isci{

    @Override
    public String toString() {
        return "Surekliİsci{" +
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



        Surekliİsci surIsci1 = new Surekliİsci();

        surIsci1.persNo =5001;// Personel
        surIsci1.isim= "Cem";// Personel
        surIsci1.soyisim="Oz";//Personel
        surIsci1.statu="Isci";//muhasebe
        surIsci1.saatUcreti=11;//muhasebe
        surIsci1.maas=surIsci1.maasHesaplama(); // Muhasebeden

        System.out.println(surIsci1.toString());
    //Surekliİsci{isciStatu='Surekli isci', saatUcreti=11, statu='Isci', maas=2640, persNo=5001, isim='Cem', soyisim='Oz', adres='null', tel='null'}


    }


}
