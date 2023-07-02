package practise_regular.day13practise;

public class C03_Varargs { // VARIABLE ARGUEMENTS

    public static void main(String[] args) {

// kac tane kelime verilirse verilsin
// iclerinden en uzun olanı yazdıran bir method olusturun (Varargs kullanarak)

// bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız

// bu methodun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classdan calıstırınız

// bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız


        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";

        String str5 = "Abdullah AHMET";
        String sonuc =enUzunKelime(str1,str2,str3,str4,str5);
        System.out.println(sonuc);

        }

    public static String enUzunKelime(String...s) {

        String maxL = "" ;

        for (String w :s ) {

            if (w.length()>maxL.length()){
                maxL=w;
            }
        }
      return maxL;
    }


}





