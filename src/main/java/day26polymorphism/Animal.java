package day26polymorphism;

public class Animal {
/*
1) Parent Classdaki methodu Child Clasinda ozellestirerek kullanamaya overriding denir.
2) Overridin'de Methodun imzasina(method ismi + parametereler) dokunulmaz.
3) Bir kere private methodlar override edilemezler.
4) Child Classindaki override edilmis methodun Acces Modifeir' i , Parent Classindaki methodun Acces Modiferindan daha dar olamaz
 */
    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }


}
