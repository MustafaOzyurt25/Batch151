package day18constructerstatickeyword;

public class CarRunner {

    public static void main(String[] args) {
        Car  car1 = new  Car();
        Car  car2 = new  Car("Mercedes","C300",2023,30000);
        Car  car3 = new  Car("Audi", "R8",2023,50000);
        Car car4 = new Car("BMW");
        Car car5 = new Car();

        System.out.println(car3.price);
        System.out.println(car2.make);

        System.out.println(car5.make);

    }
}
