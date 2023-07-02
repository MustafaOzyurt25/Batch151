package day27Interface;
/*
1) "Interface" icine Concrete method konulamaz.
2) Intrface icindeki methodlarin abstract oldugunu bilir.Bu yuzden abstract keywordunu kullanmaya gerek yok.
3) Interface icindeki abstract methodlarin tamami publictir. bu yuzden interface icinde abstract method olustururken
 "Acces M" yazmaya gerek yok.
 4) Bir interface'i bir child'in parenti yapmak ist.de implements keywordunu kullaniriz.
 5)  Concrete child Classlar parent interface'deki abstract methodlari override etmek zorundadirlar.
 6) Interface ler bir applicationda Concrete Child Class'larin yapmak zorunda olduklari fonksiyonlari barindirirlar
 Bu yuzden interface'lere "to do list" de denir.
 7)Birden fazla "parent Intereface" icinde ayni isimli abstract methodlar olusturabilirsiniz.Abstract methodlarin bodysi
 olm.dan child classlar ayni isimli methodlardan herhangi birini override ederek kullanirlar.
 8) birden fazla "parent Interface" icinde ayni isimli abstract methodlar olusturdugunuzda bu methodlarin
 return type lari ayni olmak zorundadir.
 9)Normalde , "Interface" icine Concrete method konulamaz.Ama bazi ozel durumlarda concrete method koymamiz gerekirse
                i) default keywordunu asagidaki gibi kullanarak  "Interface" icine Concrete method koyabiliriz
                  default void eco(){  System.out.println("Uses gas less....");}
                ii) static keywordunu asagidaki gibi kullanarak  "Interface" icine Concrete method koyabiliriz
                   static void stop(){  System.out.println("Stop securely");}

 10) default veya static keywordunu kullanarak olusturdunuz Concrete methodlarin
 concrete child classlar tarafindan kullanilma zorunlulugu yoktur.
 11) default  keywordunu kullanarak olusturdunuz Concrete methodlara object olusturarak ulasilabilir
 12) static keywordunu kullanarak olusturdunuz Concrete methodlara object olusturmaya gerek yok. Intreface ismi uzerinden
  static Concrete methodlara ulasilabilir.
13) Interface'lardan obj olusturulamaz.Interfacelaerin "constructoru" yoktur.

 */
public interface Engine {

    int x = 10;
    String s ="Hinis";

    public static void main(String[] args) {
        int d =x;
    }

     void start();
     void payment();

      default void eco(){
            System.out.println("Uses gas less....");

      }
      static void stop(){
          System.out.println("Stop securely");
      }
}
