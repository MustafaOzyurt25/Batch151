package introduction.day01variables;

public class Variables01 {
    public static void main(String[] args) {
        // Java bu satiri okumaz.
        /*
        jcj
        hsh
         */
        /*
         Variable olusturmak:

         */
        /*
         Java cumlesi= Statement
         java'da " = " assignment operator
         Eger variable decleration yapar, assignment yapmazsak Java kendisi Default degerlerini atar.
         Default degeri sayilar icin sifirdir.
         java'da temelde 2 tur data var:
         1- primitive data type.

         2- non primitive data type
         */
        String studentName = "Ali Can";
        char isminIlkHarfi = 'M';
        boolean emeklimisin = false;
        byte ogrenciYasi = 15;
        short okuldakiOgrenciSayisi = 30000;
        int ulkeNufusu = 10000000;
        long insandaHucreSayisi = 9000000000000000000L;
        long weight = 123650000;
        float gomlekFiyati = 1.99F;
        float ayakkabiFiyati = 17.99F;
        System.out.println(gomlekFiyati + ayakkabiFiyati);
        int a = 10;
        int b = 25;
        System.out.println(a + b);
          /*
          System.out.println (): Bu kod ekrana () icindeki kodu ekrana yazdirir ve bir alt satira gecer artik.

           */
        double hucre1Agirligi = 0.00000659;
        double hucre2Agirligi = 0.000006588;

        System.out.println(hucre1Agirligi - hucre2Agirligi);
        System.out.print((a) + (b));


    }
}
