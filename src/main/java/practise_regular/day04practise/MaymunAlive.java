package practise_regular.day04practise;

public class MaymunAlive {

    /* INTERWIEW SORUSU


Adada yalnız bir maymun var
Her gün 4 muz yemesi gerekiyor
o adada sadece 165 muz var
Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/

    public static void main(String[] args) {
        int numberOfBananas= 165;
        int survivalDays = 1;

        boolean isMonkeyAlive = true;


        do {

            numberOfBananas -=4; // toplam muz sayisinda hregun 4 muz eksilir.


            survivalDays++;

            if (numberOfBananas<4){
                isMonkeyAlive =false;
                System.out.println("Bugun "+ survivalDays+ " .Yeterli muz kalmadi Mymun rahmetli. Ret in peace");
            }else {
                System.out.println("Bugun " + survivalDays + " .gun; mAYMUN HALA YASIYOR");
            }
        } while (isMonkeyAlive);




    }
}
