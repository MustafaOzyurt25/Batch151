package day13;

public class Loops002 {
    public static void main(String[] args) {

        // sadece buyuk harflerini ve digerlerini yaziniz

        String s = "Pwd12?Ab";


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue;   // bosveeer.devam et.  break loopu kirarken continou
                // bazi elemanlar icin is yapmaz. direk sizi increment/decrement disina artar
                // mesela burda continou kucuk harflerde is yapmamazi saglar ve increment kismina bizi goturur
            } else {
                System.out.print(ch);
            }
        }
// break switchin disina veya loopun disina cikmak icin kullanilir.
// continoue ise bize, bazi elemenlar icin is yapmamayi saglar

        // Bir sitringi ters ceviren yazdiran kodu yaziniz.
        System.out.println();

        // first way

        String t = "java"; // avaj
        String ters = "";  // yeni bir data olusturdugumuzda memory de bir acip konteynir olusturuyoruz.

        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);

            // System.out.println(ters);  // tum adimlari gosterir.

        }

        System.out.println(ters);


        System.out.println();

        //2.Way:

        String u = "Java";
        String ters2 = "";

        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);   // farkli data tiplerini concenation yapiyor.
        }
        System.out.println(ters2);


        // bir tamsayinin rakamlarinin toplamini yaziniz. 578==> 5+7+8


        int sum = 0;

        int n = -578;
        n = Math.abs(n);


        for (int i = 578; i > 0; i = i / 10) {  // i/=10

            sum = sum + i % 10;  // sum += i%10
        }

        System.out.println(sum);


    }
}
