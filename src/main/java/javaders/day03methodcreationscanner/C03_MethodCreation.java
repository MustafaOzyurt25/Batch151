package javaders.day03methodcreationscanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Scope == Kapsam Alani bir variable'in bir degerin,hangi
        // alanda kapsam icinde oldugunu gosterir.
        // Dikdortgenin alani hesplatan bir method olusturunuz:
        dikdortgenAlani(); // void kullandik
        // karenin alanini hesaplatan metodu olusturunuz:

        int kareninAlani = kareAlani(6);
        System.out.println("kareninAlani = " + (kareninAlani+9));
        System.out.println("kareAlani(9) = " +( kareAlani(9)+9));

        System.out.println("toplamaYap(5,6) = " + toplamaYap(5, 6));
        multiply(5,9);

    }// main

    private static void multiply(int a , int b) {
        System.out.println("carpma metodu= "+a*b);
    }

    private static double toplamaYap(double a, double b) {
        return a+b;


    }

    private static int kareAlani(int mehmet) {

        return mehmet * mehmet;
    }

    private static void dikdortgenAlani() {
        System.out.println(10 * 20); //200
    }
}// class


