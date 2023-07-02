package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
     Javada method nasil olusturulur:
     1) main metodun disinda olusturulur.
     2) Access Modifier + return type + methodIsmi + () + {}

     Olusturulan methodlar nasil kullanilir?:
     1)main method'un icinden kullanilir
     2)methodun ismi + () yazin.
     3)islem yapacaginiz parametreler parantezin icine konulur
     ===>main method static oldugu icin main method icerisinde kullanacaginiz
         her sey static olmalidir.

     */

    /*
    ornek1) : Toplama islemi yapan bir method olusturunuz.

    ornek2) : iki sayiyi carpma islemi yapan bir method olusturunuz.

    ornek3) : Verilen uc sayidan ilk ikisini carpan ve sonuncu sayiyla
              toplayan bir method olusturunuz.

    ornek4) : Verilen bir ondalik sayinin kupunu hesaplayan method olusturup kullaniniz
    NOTE    : Acces Modifier' i "Default " yapmak istersek
              " Default " u yazmaya gerek yok.
    ornek5) : Girilen bir kelimeyi ekrana yazdiran bir method
              olusturunuz ve kullaniniz.

     */
    /*
    Note 1 : Primitive data type' lari Java olusturmustur. Biz olusturamayiz
    Note 2 : Primitive data type'larin isimlerinde sadece kucuk harf kullanilir.
    Note 3 : Primitive data'lar , data type'larina gore memory'de farkli farkli yer kaplar.
    Note 4 : Primitive data'lar , iclerinde sadece kullanicinin atadigi degerler vardir.

     */

    /*
    Non primitive Data Types:
     Note 1 : Ornegin String non-primitive bir data type ornegidir.
     Note 2 : Uretilen her bir class ayni zamanda bir " non- primitive data type"
              dir. Bu yuzden " non- primitive data type " lar sinirsiz sayidadir.
     Note 3 : Non-Primitive data type' larin isimleri buyuk harfle baslar.( Class'lar )
     Note 4 : Non- Primitive data type'larin tumu icin Java,memory' de ayni miktarda yer ayirir.

   */
    /*
    Ornek1) :Sehir ismi icin bir variable olusturun ve bir deger atayip onu
             ekrana yazdiriniz.
     */

    /*
     Interview sorusu : " Primitive " ve " Non Primitive " data type'lar arasindaki farklar:

     1) "Primitive"ler sadece bizim atadigimiz degeri icerir. " Non-Primitive" ler bizim atadigimiz
         deger ve metodlari icerir.
     2) " Primitive"ler kucuk harfle baslarken; " Non-Primitive"ler buyuk harfle baslar.
     3) "Primitive" leri Java uretmistir. Sayilari 8 dir.
        "Non- P.'leri Java ve Developerlar uretebilir.Bu yuzden sayilari sinirsizdir.
     4) "Primitive"ler memory' de data type'larina gore yer kaplar.(1, 2 , 4, 8 Byte gibi)
        "N-Primitive"ler icin Java memory'de hep ayni buyuklukte yer ayirir.


    */
    public static void main(String[] args) {
        int ozelIslemSonucu = ozelIslem(3,5,8);
        System.out.println( ozelIslemSonucu );
        byte ucluToplamaYontemi = toplama((byte) 1, (byte) 0, (byte) 1);
        System.out.println( ucluToplamaYontemi );
        float carpmaHesabi = carpmaIslemi(3.99F,6.99F );
        System.out.println( carpmaHesabi);
        int istenenIslemSonucu  = istenenIslem( 10,98, 6 );
        System.out.println( istenenIslemSonucu );
       double kupHesaplamaSonucu = kupHesaplama(6.999);
        System.out.println(kupHesaplamaSonucu);
       kelime("merhabalar");
        String dogumYeriniz = " ERZURUM ";
        System.out.println( dogumYeriniz );
    }


       public static void kelime( String abc) {

        System.out.println( abc );
       }



    static double kupHesaplama( double a ){
        return a*a*a;

    }





    private static int istenenIslem ( int a, int b, int c ){
        return a*b+c ;

    }



    protected static  float carpmaIslemi(float a, float b ){
        return a*b;
    }


    public static byte toplama( byte x , byte y , byte z ){

        return (byte) (x +y + z);
    }




     private static int ozelIslem ( int a, int b, int c) {
         return a * b + c;
     }

    }


