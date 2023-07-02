package day24inheritancepoliymorphism;

public class Toyota extends Car {


public void hybrid(){

        System.out.println("Toyota uses hyrid ...");

}


public Toyota(){
this("Prius");
        System.out.println("Toyota Constructor 1");

}

 public Toyota(String s){
super(7);
    System.out.println("Toyota Constructor 2");
        }



}
