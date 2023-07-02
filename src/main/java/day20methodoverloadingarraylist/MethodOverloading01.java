package day20methodoverloadingarraylist;

public class MethodOverloading01 {

    public static void main(String[] args) {
       /*
       1) Method overloading; ayni isimle farkli isler yapabilen methodlar
       olusturmak demek.
       2) daha derli toplu bir yapi olsun diye.
        her parametreye gore yeni method olusturmamak icin var

        ornek: substring methodu a) tek parametre  b) iki parametre

        */
        // java virgulsuz bir sayiyi otomatikmen int, virgullu sayilari ise double kabul eder.(floata bakmaz)

        add(3.0,5,3);

/*

1) Method overloading yaparken method ismi degistirilmez
2) MO yaparken parametreler degistirilir.
     i)parametre degistiriken , paarametrelerin data type lari degistirilebilir.
     ii) parametrelerin yerleri degistirilebilir, parametrelerin data type lari
         farkliysa yerleri degistirilebilir yoksa anlami olmaz
     iii) parametrelerin sayisini da degistirebiliriz.
3) Java icin ; ismi ve parametresi ayni olan (velevki acces m, met. body farkli olsun)  iki method tamamen aynidir

4) moverloading icin acces m i veya staticligin hic bir etkisi olmaz.
5) moverloading icin method body nin hic bir etkisi olmaz.
6) private methodlar da overloading edilebilir. cunku method overloading ayni Class icinde yapilir.
          baska classlara gidecegimiz zaman sorun olur
7) static methotlar overloding yapilabilir.
 */




    }
                         // method signature.(method ismi ve parametre)
    public static void add(int a, int b){         // acces m + return type + method ismi + () + {}

        System.out.println(a+b);
    }

    public void   addA(int a, int b){         // acces m + return type + method ismi + () + {}


    }






    public static void add(double a, double b){

        System.out.println(a+b);
    }


    public static void add( double a,int b){

        System.out.println(a+b);
    }



    public static void add( double a,int b,int c){

        System.out.println(a+b+c);
    }



















}
