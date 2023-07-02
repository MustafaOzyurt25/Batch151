package day14loops;

import java.util.Scanner;

public class Loops02_tekrar {
    public static void main(String[] args) {
       /*
        //3'den 6'e kadar tum tamsayilari console'a yazdiran kodu yaziniz
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        //3'den 6'e kadar tum tamsayilari console'a yazdiran kodu yaziniz
        int k = 3;
        while (k < 7) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        int j = 24;
        while (j < 181) {
            if (j % 4 == 0 && j % 6 == 0) {
                System.out.print(j + " ");
            }

            j++;
        }





        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan
        // character'lerini buyuk harfe donusturunuz    (-)

        //miami ==> MiAmI

// hata yi anlamak lazim burda. index i kullaninca sikinti oluyor.
        String s = "miami";  // length ==>5 TRK(tarik icin calisti)
        String result = "";
        int i = 0;
        while (i < s.length()) {
            String t = s.substring(i, i + 1); // t =m

            if (s.indexOf(t) % 2 == 0) {
                System.out.print(t.toUpperCase());
            } else {
                System.out.print(t);
            }


            i++;
        }


        //Size verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.
        int r = 578;

        // String s ="578";


        int i = 578;
        int sum = 0;
        while (i>0){
            int k=i%10;  // k =8 7 5
            sum = sum + k;//8   20

        i= i/10;
        }
        System.out.println(sum);



        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz (+)
        //3x1=3  3x2=6  3x3=9 ... 3x10=30


        Scanner scanner = new Scanner(System.in);


        System.out.println("sayi");
        int n = scanner.nextInt();
        int i = 1;


        while (i < 11) {

            System.out.println(n + " x " + i + " = " + (n * i));

            i++;
        }


        */

        //Kullanicidan aldiginiz String'deki sessiz harfleri console'a yazdiran kodu yaziniz
        //Alabama ==> lbm


        Scanner scanner = new Scanner(System.in);


        System.out.println("kelime giiriniz");  // Alabama===> lbm (-)
        String n = scanner.next();  // Alabama

        int i = 0;
        while (i < n.length()) {    // length 7

            char ch = n.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.print(ch);


            }


            i++;
        }


    }
}
