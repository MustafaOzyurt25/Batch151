package javaders.day08stringmanipulations;

public class C02_StringManipulations_Gunduz {

    //          ************* replaceFirst ************       \\
    // replace () de ayni isi yapiyor. Ancak replaceFirst () ilk gordugu
    // datayi degistiriyor.


    public static void main(String[] args) {



        String str = "Hayirli Olsunda ";
// EX : str String'indeki ilk gorunen "a"'yi "e" ile degistiriniz

        String str2 = str.replaceFirst("a", "e");
        System.out.println("str2 = " + str2);  //Heyirli Olsunda


        //****************** trim ()  *****************\\

        //bir String deki basindaki ve sonundaki space
        // karakterlerini siler
        // Aradaki spacelere dokunmaz. Saclar icin uclarindaki
        // kiriklarin aldirilmasi gibi. Cumledeki spacelerin silinmesi


        //EX : strx String'indeki bas ve sonda varsa space karakterlerini siliniz

        String strx = "           Ali  Can    ";
        System.out.println("strx = " + strx);
        String str3 = strx.trim();
        System.out.println("******");
        System.out.println("str3 = " + str3);


        // asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz

        // String tv = 599.99 $     String laptop  = 299.99 $ //

        String tv = "599.99$";
        String laptop = "299.99$";

        String tv2 = tv.replace("$", "");

        String laptop2 = laptop.replace("$", "");

        System.out.println(tv2 + laptop2);//599.99299.99// Burada + isareti concatination yapar

        System.out.println("laptop2 = " + laptop2); // cunku tv2 ve laptop2 hala string.

        // *************                valueof ()             ***********************
   /*
   valueOf(): String olan datayi bize sayi haline getirir.

   */
        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);

        System.out.println("totalPrice = " + totalPrice);

        // Ex : verilen ismin ilk  isminin ve son
        // isminin ilk harfini ekrana yazdiriniz

        String tamIsim = "  mehmet fatih  ";
        tamIsim.trim().toUpperCase().charAt(0);// M
        tamIsim.trim().toUpperCase().charAt(7);// F
        System.out.print(tamIsim.trim().toUpperCase().charAt(0));
        System.out.println(tamIsim.trim().toUpperCase().charAt(7));


    }


}



