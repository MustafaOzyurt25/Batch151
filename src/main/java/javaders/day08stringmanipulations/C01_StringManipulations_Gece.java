package javaders.day08stringmanipulations;


public class C01_StringManipulations_Gece {

    public static void main(String[] args) {
        //***************  replaceFirst ()  ****************
        // replaceFirst () : replace ile ayni isi yapmakla birlikte ilk gordugu datayi degistirr.

        // EX: str Stringindeki ilk gordugu "a" nin yerine "e"
        String str = " Bizimle Java Ogrenmek Cok Kolay";
        String str1 = str.replaceFirst("a", "e");
        System.out.println("str1 = " + str1);


        //*********************  trim () ***********************\\
// Bir strdeki bastaki ve sondaki space leri siler ortadakine dokunmaz.

        String isim = "   Mehmet Fatih Yildirim   ";
        System.out.println("******************************");
        System.out.print(isim);
        System.out.print("********************************");

        String isimYeni = isim.trim();
        System.out.print("isimYeni = " + isimYeni);
        System.out.println("**************************");

        System.out.println("******************************");
        System.out.println(isim);
        System.out.println("********************************");

        String isimYeni1 = isim.trim();
        System.out.println(isimYeni);
        System.out.println("**************************");

        // Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv ="599.99$"   String laptop ="299.99tl"
        String tv = "599.99$";
        String laptop = "299.99tl";
        String tv1 = tv.replace("$", "");
        String laptop1 = laptop.replace("tl", "");

        double tv2 = Double.valueOf(tv1);
        Double laptop2 = Double.valueOf(laptop1);
        System.out.println(tv2 + laptop2);

//*************************** valueOf():*******************************************

        String tamIsim = "  mehmet fatih ";
        // verilen tamIsim Stringinin icindeki ilk ismin ilk harfi ile
        // son ismin ilk harfini buyuk olarak yanyana yazdiirniz

        char first = tamIsim.trim().toUpperCase().charAt(0);//M
        System.out.println("first = " + first);

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second);

        char secondd = tamIsim.trim().toUpperCase().split("F")[1].charAt(3);
        System.out.println("secondd = " + secondd);

        System.out.println(first+""+second);



    }
}


