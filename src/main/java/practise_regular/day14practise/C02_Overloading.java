package practise_regular.day14practise;

public class C02_Overloading {
    // Ayni Class'da  ayni isimde methodlar olusturunuz
        /*
         Ayni Classda ayni isimde method olusturmak icin
         1- parameterelerin data turleri degistirilebilr
         2- parameterelerin sayisi degistirilebilir
         3- parameterelerin data turleri farkli old.da parameterelein yeri degistirilebilir.

         */

    public static void main(String[] args) {

     toplama(55,25);

     toplama(2.3,3.5);

     carpma(1,2,3);

     carpma(2,3,6,5);

     cikartma(5.3,1.3f);

     cikartma(3.7f,5.4);
    }

    private static void toplama(int a, int b){

        System.out.println("Iki int deger toplandi " + (a+b));

    }

    private static void toplama(double a, double b){

        System.out.println("Iki double deger toplandi : " + (a+b));

    }


    private static void carpma(int a, int b, int c){

        System.out.println("uc int deger carpildi : " +(a*b*c));
    }


    private static void carpma(int a, int b, int c,int d){

        System.out.println("dort int deger carpildi : " +(a*b*c*d));
    }


private static void cikartma(double a , float b){

    System.out.println("ILKI double , ikincisi float cikartma islemio yapildi : "+ (a-b));

}


    private static void cikartma(float  b, double a){

        System.out.println("ILKI float , ikincisi double cikartma islemio yapildi : "+ (a-b));

    }



}// Class
