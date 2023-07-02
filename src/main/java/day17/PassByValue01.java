package day17;

public class PassByValue01 {

    public static void main(String[] args) {


        int shirtPrice = 200;
        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);
    }


    // Discount Methodu olusturunuz:

    public static int discount(String type, int price) {

        switch (type) {
            case "student":
                price = price - 20;
                   break;
            case "veterian":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;


        }
        return price;
    }


}
// method olusturmak icin> 1. Acces Modifier  2. return type 3. method ismi method parantezi ve method body si gerekir
// Pass by Value:
// java , methodlara deger yollarken. orj. degerin copyasini olusturur ve o kopyayi methoda yollar.
// method kopya uzerinde degisiklik yapar, boylece orj deger korunmus olur
// java esnek bir dilldr. istersek yazdigimiz kod ile orj degerin degismesini temin edbiliirz
// Pass by referance>>>> methoda referance yollanir. referance, adres demektir.
//adres  yollaninca  method, adresi kullanarak  orj degere ulasir ve orj degeri degistirir
// bu yuzden "C#" gibi dillerde methodlar, orjinal degeri korumaz.