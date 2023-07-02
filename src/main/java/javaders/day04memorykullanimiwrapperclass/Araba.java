package javaders.day04memorykullanimiwrapperclass;



public class Araba{
    public String model = "v60";  // ==> Variable' lar pasif ozellikler tasir.
    public  String renk = " Beyaz ";
    public  int fiyat = 1500000;


    public static void main(String[] args) {
       hareket();
       dur();
       yakit();


        //   Class ismi +   obje ismi =  new +  Class ismi()==>Consructor+ ;
        //       |               |         |        |
               Araba           volvo  =   new     Araba();

        System.out.println("volvo.fiyat = " + volvo.fiyat);
        System.out.println("volvo.model = " + volvo.model);
        System.out.println("volvo.renk = " + volvo.renk);


    } // main

    public static void yakit() {
        System.out.println("az yakit tuketir");
    }

     static void dur() {
        System.out.println("Volvolar guvenle durur..");
    }

    public static void hareket() {
        System.out.println("Volvo hizli gider...");
    }


    /*
    Class ==> Variable(pasif)
          ==> Methodlar(aktif oz)
          ==>Object

     */



} // Class
