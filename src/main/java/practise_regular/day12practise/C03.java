package practise_regular.day12practise;

public class C03 {

    // Bu class calıstıgında output ne olur. Calısma mantıgını anlatınız

    int fiyat = 300000;
    int yil =2023;
    String marka = "Opel";

    public C03(int fiyat, int yil, String marka) {
        this.fiyat=fiyat;
        this.yil=yil;
        this.marka=marka;
    }

    public C03() {

    }


    public static void main(String[] args) {
        C03 obj1 = new C03();

        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel","Mercedes"));

        C03 obj2 = new C03(500000,2021,"Citroen");


        System.out.println(obj2.fiyat+ ", "+obj2.yil+ ", "+ obj2.marka);

        // Instance variable'lar obje'ye baglidirlar .Hangi obje uzerinden variable'da degisiklik yapildiysa ,
        // yapilan bu degisiklik  sadece o objeyi baglar.




    }
}
