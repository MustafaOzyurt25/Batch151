package day18constructerstatickeyword;

public class Otomobil {
    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;
    String kaza = "Hafif derecede";

    public Otomobil(String make, String model, int year, int price,String kaza){
        this.make = make;
        this.model=model;
        this.year = year;
        this.price=price;
        this.kaza=kaza;

    }

    public Otomobil(int year,int price,String kaza){
        this.price = price;
        this.year=year;
        this.kaza=kaza;
    }


}
