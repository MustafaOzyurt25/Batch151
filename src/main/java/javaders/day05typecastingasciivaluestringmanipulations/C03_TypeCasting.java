package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*
        Numeric Data Type ' larinin birbirine donusturulmesine Type Casting
        denir
        Numeric Data Type'lari byte<short<int<long<float<double
        Kucuk data type ' nin buyuk data type ' ina donusturulmesine auto
        Widening (otomatik genisletme) denir.
        Buyuk data type'nin kucuk data type' na donusturulmesine Explicit
        Narrowing denir.
        */
byte age = 13;
int ageInt = age;  // BUNA AUTOWIDENING denir.


long longY = 12545587l;
short shortS = (short) longY;    // BUNA EXPLICIT NARROWING denir.

int intI= 1254;
float floatF= intI;
















    }



}
