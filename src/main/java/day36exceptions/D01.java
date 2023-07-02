package day36exceptions;

public class D01 {

    public static void main(String[] args) {

        // Bu sefer bir dizi tanımlayalım:
        int[] dizi = {10, 15, 27, 30, 37};
        try {
            System.out.println("--------------\n< Dizi Elemanları >\n--------------");
            for (int i = 0; i <= dizi.length; i++) {
                if (i == dizi.length) {
                    System.out.println("-> Dizinin " + i + " indisindeki eleman: " + dizi[i - 1]);
                } else {

                    System.out.println("-> Dizinin " + i + " indisindeki eleman: " + dizi[i]);
                }
                System.out.println("--------------");
            }
        }catch(Exception e){
                System.out.println("--------------\n< OOPS! ERROR >\n--------------\n -> Hata Mesajı: " + e.getMessage() + "\n--------------");

            } finally
            {
                System.out.println("-> Hata ile karşılaşsak ya da karşılaşmasak bile buradaki işlemler gerçekleştirilir.\n--------------");
            }
        }
    }







