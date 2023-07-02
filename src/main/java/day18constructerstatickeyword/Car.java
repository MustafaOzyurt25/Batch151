package day18constructerstatickeyword;


/*
Constructor nasil olusturulur?
Access m +class ismi+() + {}
                Methodlar ile Contructor arasindaki farklar:
1) "Methodlar" da return type olur ama Constructor olmaz.
2)"Methodlar" yaptiklari ise gore isimlendirilirler; "Constructorlar" ise herzaman
Clas ismine gore isimlendirilirler.
3)"Methodlar" lar bir aksiyon yapmak icin olusturulur;"Constructorlar" ise
object olusturmak icindir
4)"Methodlar" isimleri kucuk harfle baslar; "Constructorlar" ise buyuk harfle baslar

Parametreli Constructor'lar olusturarak
ayni classdan farkli ozelliklre  sahip objectler olusturabiliirz

 */
public class Car {
    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;


    // Default Constructor
    // Default Constructor ' lar parametre kullanmazlar
    // Default Constructor ' larin bodysi bostur
    // Java kiskanctir. biz  // Default Constructor 'i elle yazdigimizda
    // java Object Class icindeki default Constructoru  kullandirtmaz
   // Parametreli Cons lar olusturaraak farkli ozelliklere sahip objeler olusturabiliriz

    public Car(){

    }


// CUSTOM CONSTRUCTOR{kendimiz olusturursak}


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

public  Car (String make){
        this.make = make;
}
    // Custom Constructor:

    public  Car (String make, int price){
        this.make = make;
        this.price = price;
    }


}













