package day24inheritancepoliymorphism;

public class Volvo extends Car {
    public void secure() {

        System.out.println("Volvo  dunyanin en guvenli arabasi...");

    }

    @Override  // bu bir "annotation" dir. @override annotation u Override kurallarini kontrol eder.
                 // ve java buda bedava yapar



    public void move() {

        System.out.println("Volvo moves...");





    }
}