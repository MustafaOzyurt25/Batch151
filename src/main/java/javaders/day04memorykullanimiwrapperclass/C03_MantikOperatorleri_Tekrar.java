package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri_Tekrar {
    public static void main(String[] args) {

        System.out.println(5+2 ==8);//false

        boolean sonuc1 =5>4 && 7>9 && 6+3 == 9 && 5+2 != 7;
        System.out.println("sonuc1 = " + sonuc1);


        short a= 1000;
        System.out.println(a<15000 || a>28000 || a < -23);//true


        System.out.println( a<=1000 && a==1000  );


    }
}
