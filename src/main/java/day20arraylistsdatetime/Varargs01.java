package day20arraylistsdatetime;

public class Varargs01 {

    public static void main(String[] args) {
        //EX 1: Toplama islemi yapan bir method olustur;
// 1 yol: Asagidaki gibi parametere sayisina gore ayri bir method olusturamayiz.

//        System.out.println(add(5));
//        System.out.println(add(5,2));
        System.out.println(add(5,2,3,9,10));
//        System.out.println(add()); // 0

        getInitials("ALI CAN", "KAMAL HAN", "HASAN ALI");

    }

    // Farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu .Bu yapiya Varargs denir
// Varrargs arkada Array yapisini kullanir
    
    /*
     note 1 : bir method parantezinde birden fazla varargs kullanilamaz.
                  BIR METHOD PARANTEZINDE BIRDEN FAZLA PARAMETRE KULLANILACAKSA VARARGS EN SONDA KULLANILIR
     */
    public static   int add(int... a){
     int sum = 0;            // bir yapi
     for (int w: a){
         sum= sum+w;
     }
     return sum;
    }


// EX 2: VERILEN ISIMLERIN ILK HARFALERINI CONSOLA YZDIRAN METHODU OLUSTURUNUZ    ALI CAN >>>> AC    

    public static  void getInitials(String...s){
        
        
        String initials = "";

        for (String w:s ) {
            initials =initials+w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";
        }

    }

}
