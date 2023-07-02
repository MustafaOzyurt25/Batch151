package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        int n = 12;
        // "n" yazip "nokta" koyarasaniz hic metod goremezsiniz, cunku "primitive"
        // ler method icermez.

        Integer m = 12;

        // "m" yazip noktaya basarsaniz bircok metod gorebilirsiniz; Cunku Wrapper
        // Class'lar method icerir.

        // ornegin: m.toString() gibi

        // orn: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.

        byte p = 13;
        Byte r = 13;
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2: int data type'inin minimum degeri
        // ile byte data type'inin maximum degerinin toplamini bulunuz

        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte + minInt);

        //Ornek 3: i) Primitive int'i Wrapper Integer'a ceviriniz.

        int num = 13;
        Integer numb = num;
        // primitive yani method bulunmayan bir kutudaki degeri alarak icinde
        // bazi methodlar bulunan Wrapper kutuya atama yaparsak bu isleme autoboxing
        // denir.
                  //)Wrapper Byte' i primitive byte 'a ceviriniz.
        Byte numW = 22;
        byte nuPrimitive = numW;
        //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme
        //un boxing denir.

        //Ornek 4: i) Primitive char'i Wrapper Character'e ceviriniz(Autoboxing)

        char pNum = 'T';
        Character wNumber =  pNum;
        //ii) Wrapper Boolean'i primitive boolean'a ceviriniz. (Unboxing )
         Boolean isOld = true;
         boolean isOldPr =isOld;






















    }
}
