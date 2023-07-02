package practise_regular.day09practise;

public class C03_Instance {

    // instance variable' lar obje'ye baglidirlar. Hangi object uzerinden variable'da
    // degisiklik yapildiysa yapilan bu degisiklik sadece o object'i baglar.(cizim yaparak cozulur)

    //static Variable'lar gokteki ay gibidirler, degisiklik herkesi baglar. Ancak static variable lar Classa baglidirlar.
    int sayi;                                //0
    String bransIsmi = "JAVA";
    boolean okuldaMi;                        // false

    static int sayi1;


    public static void main(String[] args) {

        C03_Instance obj = new C03_Instance(); //instance variable'lara static methoddan ulasabilmek icin obje olusturmamiz gerekir

        System.out.println(obj.bransIsmi + obj.okuldaMi + obj.sayi);  // JAVAfalse0
        obj.sayi = 10;
        System.out.println(obj.sayi);  // 10
            /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

*/


       C03_Instance obj2 = new C03_Instance();
        System.out.println(obj2.sayi);  // 0

        obj2.bransIsmi = "SQL";
        System.out.println(obj);

        System.out.println();


















    }


}
