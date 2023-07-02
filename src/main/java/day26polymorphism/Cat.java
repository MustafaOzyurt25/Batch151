package day26polymorphism;

public class Cat extends Animal{

    @Override  // Override Annotation; oveeride kurallarini java tarafindan kontrol edilmesini saglar
    public void eat() {
        // Child daki override edilmis eat() methoduna "overriding method " denir.
        // Parent daki override edilmis eat() methoduna "overriden method " denir.
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
}
