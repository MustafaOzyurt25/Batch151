package day34exceptions;

public class E02 {
    public static void main(String[] args) {


        String a[] = {"A","V","A","J"};
        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, -3)); //a array'imizde 4 eleman var, 6. elemani istersek hata verir. Cunku 6. eleman yok. 6. eleman index 5'tedir ve index 5 olmadigi icin, yazdirma islemi yaptigimizda ekranda problem exception olarak yazilir ve hangi satirda problem oldugu belirtilir.

        System.out.println(getElement(a, 6));

    }

    // Bir String arrayden istenilen bir elemani eleman sirasi ile alan method olusturunuz

    public static String getElement(String[] a ,int numOfElement){

        String result="";
        try {
          result= a[numOfElement-1] ;
        }catch (ArrayIndexOutOfBoundsException e){ // ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullanildiginda atilir
            if (numOfElement-1<0){
                result = a[0];    // A
            }else {
                result = a[a.length-1];
            }
        }


        return result;
    }

}
