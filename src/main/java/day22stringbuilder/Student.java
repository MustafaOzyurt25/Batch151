package day22stringbuilder;

public class Student {

    public  String stdName = "Ali Can";
// stdName public ol.dan her Clasda ulasilir  //(public yaptik Acces M i)

    int age = 23;//(default yaptik Acces M i)
// Acces M i default olan ile Acces Modifeir i  public olan clas memberler ayni package icinde kullanildiklarinda
//    ayni ozellekleri gosterirler fakat farkli package'a
//    gectiginizde public olanlara ulasilir ama default olanlara ulasilmaz


    private String healthCondition = "Cancer";

// Acces M i private olan Class memberler sadece olusturulduklari Class icinde gorulebilirler.
// Olusturulduklari Classin disina cikildiginda gorulemez ,ulasilamazlar.


// Acces M i "protected"  olanlar ayni package'da public gibi davranirlar
// Farkli package'a gectimizde protected olanlar sadece child classlardan gorulebilir

protected  int salary =3000;


// Classlar; public ve default olabilirler ama private veya protected olamazlar.













}
