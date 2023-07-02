package day25poliymorphism;

public class Animal {
/*
1)  Parent'taki method ile Child'da Override edilen methodun acces modiferi ayni olabilir.
2)  Child'da Override edilen methodun acces modiferi  Parent'taki methodun Acces Modifeir'indan dar olamaz.(baba'ya kisit koyamazsin)
3)  Child da Override edilen methodun acces modiferi  Parent taki methodun Acces Modifeir'in dan genis olabilir.
4)  methodun return type'i "primitive" ise, Overriding yapildiginda "return type "  degistirilemez.
5)  methodun return type'i void  ise   Overriding yapildiginda "return type "  degistirilemez.
6)  Child'da Override edilen methodun "return type" ile Parent'taki methodun return type'i arasinda "IS A" iliskisi varsa
return type degistirilebilir aksi takdirde degistirilemez.
Mesela Integer wrapper clas ile Long Wrapper Clas arasinda IS-A iliskidsi yoktur.
 O yuzden RETURN TYPE  Integer oldugundda Long a degistirilemez.
7) Return type Wrapper Class old.da Overriding yaparken " return type" degistirilimez.
 8)"final method"lar override edilemezler.
    "final method"larin body'si degistirilemezler ama override ederken method body i degistiririz.Bu bir celiskidir bu
    yuzden java final methodlarin override edilmesine musade etmez

 9) "Static methodlar " override edilemezler.(gokteki ay.).Cunku static methodlar
  tum chldlerin ortak metodudur. Cunku bir child methodu degistirirse diger childlar bundan etkilenir .Bu etkilenme ummadik
  sonuclar dogurur. bu yuzden java static methodlarin Override edilmesine musade etmez.
 10) "private method" lar Override edilemez.
 */
   public void move(){
        System.out.println("Animals move....");
    }


    public int add(int a, int b){
       return a+b;
    }

    public Animal create(){
       return new Animal();
    }

    public  Integer multiply(Integer a, Integer b){
       return a*b;
    }

public final double circleArea(double r){
      return  3.14*r*r;
}

}
