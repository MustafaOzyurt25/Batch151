package practise_regular.day14practise;

public class C01_Varargs {
    public static void main(String[] args) {

       // parametere olarak bir int ve istediginiz kadar String alan bir method olusturun.
        // Bu method ,  En uzun Stringin harf sayisiyla ile int parametre degeri carpip sonucu yazdirsin

        int sayi = 5;

        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        System.out.println(carpim(sayi, str1, str2, str3));


    }// main

    // int'i varargs yapmaya gerek yok. Ama String istedigimiz kadar denildigi icin String'i varargs yapiyoruz
    //Bir Method'da varargs disinda prametre kuillanacaksak once varargs disindaki paramtreler yazilmali, enson varrargs yazilmalidir.

    // Bir Methodad birden fazla varargs olamaz.

    private static int carpim(int sayi,String...str) {
       String enUzunString="";
        for (String w:str) {

            if (w.length()>enUzunString.length()){
                enUzunString=w;

            }


        }
        System.out.println(enUzunString.length()*sayi);// iki kez yazdirdim

        return enUzunString.length()*sayi;
    }


}
