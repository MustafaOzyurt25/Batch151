package day18constructerstatickeyword;

public class OtomobilRunner {

    public static void main(String[] args) {
        Otomobil m1= new Otomobil("hyundai","Getz",2011,20000,"kazasi yok");

        Otomobil m2 = new Otomobil("bmw","l200",2019,30000,"ky");

        Otomobil m3 = new Otomobil("mercedes","m300",2013,60000,"hafif");


        Otomobil m4 = new Otomobil("unu","32",2000,10000,"agir");

        Otomobil m5 = new Otomobil("h","u",2015,200,"ky");

        Otomobil m6 = new Otomobil(2021,3000,"kaza yok");
        Otomobil m7 = new Otomobil(2014,2021,"nxs");
    }

}
