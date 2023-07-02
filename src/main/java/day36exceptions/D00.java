package day36exceptions;

public class D00 {



    public static void main(String[] args) {
        // Değişken Tanımlaması:
        int a=100, b=50, c=0;

        try{
 System.out.println("--------------\n-> Try Bloğu İçerisindeki İlk İşlemimiz (a+b) : "+(a+b)+"\n-> İkinci İşlemimiz ((a+b)/c) : "+((a+b)/c)+"\n--------------");

        }
        catch(ArithmeticException ae){
System.out.println("--------------\n< Hata İle Karşılaştınız >\n--------------\n-> Hatanın Teknik Mesaji: "+ae.getMessage()+"\n-> Hatanın Tanımı: "+ae+"\n--------------");
        }
    }
}
