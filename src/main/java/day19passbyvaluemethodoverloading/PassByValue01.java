package day19passbyvaluemethodoverloading;

public class PassByValue01 {
/*
 // shirt = 100

 ogrenci >>>>>>> 90
 gazi>>>>>>>>>>>  80
 yaslilara >>>>>>>>>>> 95

eger orjinal degeri koruyamazsa java zarar olur. Amac orjinal degeri korumak. yani shirt 100 olarak kalmali.
 */


    public static void main(String[] args) {
        int shirtPrice = 100;

   int studentShirtPrice = discount("student", shirtPrice);
        System.out.println("studentShirtPrice = " + studentShirtPrice);  //
        System.out.println(shirtPrice);
       int veteranShirtPrice = discount("veteran",shirtPrice);
        System.out.println(veteranShirtPrice);
        // baktigimizda yine 100. degismemis.

        // burada pass by value sayesinde shirtprice degeri koruma altina alinir.
        // java discount metoduna shirtPrice i gonderirken dur bir kopya olusturayim onu sana vereyim der ve bunu yapar.
        // dolayisiyla method bittikten , sonra shirtPrice in degismedigini gorduk.

    }
public static   int  discount (String type, int price) {
        switch (type){

            case "student" :
                price = price-10;
                break;
            case "veteran" :
                price = price-20;

                break;

            case "senior" :
                price = price-5;
                break;

            default:
                price = price;


        }
return price;
}


}
// pass by value
/*
1 java Pass by value kullanir.
2. yani java: methodlarin ; orjinal degeri degistirmesine izin vermiyor.
3. Bunu da methodlara deger yollarken orjinal degeri degilde kopyasini yollar.
4. Java esnek bir dildir. Dolayisiyla yazacagimiz kodla orjinal degeri de bile istiye degistirebiliriz. bunu da yaptik


// Pass By referance
1. Pass By referance da methoda referance yollanir
2. Refetancce adres demektir. ADres yollaninca methodlar, adresi kullanarak
orjinal degere ulasir ve orj. degeri degistirir. mesela C++, C# gibi diller..
javascript?
pass by referance da referance kopyalanip methoda gonderildigi icin,
method , referance uzerinden(kopya referance olsa dahi) orjinal degere ulasip onu degistirir.

 */