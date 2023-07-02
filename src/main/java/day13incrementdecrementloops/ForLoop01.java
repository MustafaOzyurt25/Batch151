package day13incrementdecrementloops;

public class ForLoop01 {


    public static void main(String[] args) {

        // ex 1 : 21 den 180 kadar hem 4 hem de 6 ile bolune bilen tam sayilari ekrana yazdiran kodu yaziniz

        for (int i = 21; i < 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }

        }

        // ex  : size veirlne kucuk harfle yazilmis Stringin indexi cift sayi olan karakterleri buyuk harfe cevir
        System.out.println();

        String str = "ankara";  // 012345   bir stringde

        for (int i = 0; i < str.length(); i++) {

            String ch = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase()+" ");
            }

        }


    }
}
