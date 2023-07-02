package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02_Tekrar {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\MUSTAFA\\IdeaProjects\\Batch151\\src\\main\\java\\day36\\MOzyurtFile");
            int i =0;
            while ((i = fileInputStream1.read())  != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Dosya yolu ya yanlis yada dosya yok");
        }catch (IOException e){

            System.out.println("Bazi karakterler okunamadi");
        }

    }
}
