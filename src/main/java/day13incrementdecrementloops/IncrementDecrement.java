package day13incrementdecrementloops;

public class IncrementDecrement {


    public static void main(String[] args) {

     // Increment
        int a = 5;

        System.out.println(a); //5

       a = a + 2 ;

        System.out.println(a);//7

        a+=2;

        // Ex:

        a = a+5;
        a+=5;

        int b = 10;
        System.out.println(b);//10
        b=b+5;
        System.out.println(b);//15
        b += 5;
        System.out.println(b);//20
//********************************************  decrement   **********************************************************\\


        int c = 8;

        c = c-3;

        c -= 3;
        System.out.println(c); //2


        //***************************** increment2  *****************************************



        int d = 6;
        System.out.println(d);

        d = d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);


        //********************************** decrement2  ******************************************



        int e = 24;
        System.out.println(e);
        e =e / 2 ;
        System.out.println(e);
        e /= 2;
        System.out.println(e);

        // System.out.println(Math.divideExact(24, 2));


        // "1 " ile increment

       int  f = 12;

       // f = f + 1;

       // f += 1;

        f++;

        // "1 " ile decrement

        int h = 10;
        h -= 1;
        h = h-1;
        h--;

        //********************* post-increment  ve pre increment **********************\\

        int i = 10;

     System.out.println(i);


        int k = i++; //  post-increment : cunku variable isminden sonra inrement islemi yapildi

     System.out.println(k); // i artirilmadan k sepetine konuldugu icin.
     System.out.println(i); // i satir sonunda artirildigi icin  i nin degeri 11 oldu


     int m = 15;

     int n =  ++m;    // pre  : cunku variable isminden once increment islemi yapildi.
     System.out.println(m); // 16. m nin degeri satir sonunda artirildigi icin
     System.out.println(n);  // m artirildiktan sonra n sepetine konuldugu icin m nin degeri 16 oldu.


     int p = 17;
     int r = p--;

     /*
     1) Increment artirmak ; Decrement azaltmak demektir.
     2) increment , toplama ve carpma ile; decrement cikarma ve bolme ile yapilabilir.
     3) inc. ve dc 3 yolla yapilabilir.

     a) int i = 12; ==> i = i + 5;
     b) int i = 12; ==> i  += 5;
     c) int i = 12; ==> i++;( 3. yol sadece 1 ile artirma ve azaltma da kullanilir.)



     a) int i = 12; ==> i = i - 5;
     b) int i = 12; ==> i  -= 5;
     c) int i = 12; ==> i--;( 3. yol sadece 1 ile artirma ve azaltma da kullanilir.)





      */



























    }
}
