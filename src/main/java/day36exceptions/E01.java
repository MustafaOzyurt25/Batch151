package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
/*
//Exception' lar handle edilebilir hatalardir.Lakin Error'lar asla handle edilemezler.
 1)Run Buton'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
         ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
         "Runtime Exception" a ornektir.
         "Runtime Exception" lara "Unchecked Exception" da denir.


2) Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir. bunlara "Compile Time Exception" denir
FileNotFoundException, IOException "Compile Time Exception" a ornektir.
"Compile Time Exception" lara "Checked Exception" da denir.

3)FileNotFoundException : Java'ya bir dosyayi bul dedigimizde , Java "dosyanin adresi" ve "dosyanin varligi" konusunda
hata olusursa ne yapmasi gerektigini soylemenizi ister.

4)IOException : "IO" Input Output demektir
  Note: IOException, FileNotFoundException'in parent'idir

5) Java'da hatalar temelde ikiye ayrilir
  i) Exceptionlar    ii) Error'lar : a) StackOverflow Error.(memory'nin dolmasi)   b) Out Of Memory Error  c) Virtual Machine Error
                                     a)StackOverflow Error(Stack Memory'nin dolmasi halinde olusur)   b)Out Of Memory Error(Heap Memory"nin dolmasi halinde olusur)
 */

    public static void main(String[] args) throws IOException {

        // 1.Way : Exception'u method signature satirina ekledik
        FileInputStream fis = new FileInputStream("C:\\Users\\MUSTAFA\\IdeaProjects\\Batch151\\src\\main\\java\\day36\\Text");  // dosyaya ulastik boylece
// FileInputStream classda input-outputla ilgili cok yararli methodlar var. bunlardan biri de read() methodu.


        int i = 0;

        while ((i = fis.read()) != -1) {

            System.out.print((char) i);

        }


    }
}
