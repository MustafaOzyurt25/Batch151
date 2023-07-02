package javaders.day06typecastingstringmanipulation;

     //*********************** EXLICIP NARROWING ********************
public class TypeCasting {

    public static void main(String[] args) {
        /// short dat type'inde bir variable olusturup byte
        // data type'ina ceviren kodu yaziniz.

        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//4

        short num2 = 1023;
        byte num2Byte = (byte) num2;
        System.out.println("i = " + num2Byte);//-1


        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);// -24 (1000/256= )

        int intsayi =8880;
        short shortSayi = (short) intsayi;
        System.out.println("shortSayi = " + shortSayi); // data kaybi yok.
        /*
        Explicit Narrowing yaparken dikkat edilmeli.
        Cunku cok ciddi data kaybi hatta datanin deismesine bile yol acabilir.
        eger sayimiz ; donusturmeye calistigimiz variable'in sinirlari disinda ise
          java sayiyi mod islemine alir ve kalani yazdirir.
          Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
            bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir

         */

        
        
        
        




    }
}
