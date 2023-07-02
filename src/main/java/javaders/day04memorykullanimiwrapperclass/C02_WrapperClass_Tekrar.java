package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass_Tekrar {

    // Verilen iki String datanin toplamini veren kodu yaziniz

    public static void main(String[] args) {
        String ca = "123456";
        String cb = "987";
        System.out.println("String a + String b  = " + (Integer.valueOf(ca) + Integer.valueOf(cb)));

        String harf = "A";
        int sayi = 7;
        System.out.println(harf+sayi);
        System.out.println("8+3+\"K\" = " + 8 + 3 + "K");
        System.out.println("\"K\"+3*5/2 = " + "K" + 3 * 5 / 2);
        String a="K";
        int b=3, c=5,d=2;
        System.out.println(a + b * c / d); // K7
        System.out.println("K" + b * c / d); //K7


    }
}
