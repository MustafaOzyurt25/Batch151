package day24inheritancepoliymorphism;

public class Honda extends Car {

    public void eco() {

        System.out.println("Honda economic  tir ...");
    }


    public  String model = "Civic";

    public  int price = 20000;


    public Honda(){
        System.out.println(this.model);  // bu classdaki modeli cagirir(yani model degiskenindeki civic yazdirdik)
        System.out.println(super.model);//  parent  classdaki modeli cagirir(yani model degiskenindeki "Car" i yazdirdik)
    }
}