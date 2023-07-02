package day36exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E01_Tekrar {

    public static void main(String[] args) throws IOException {
 FileInputStream  fileInputStream = new FileInputStream("C:\\Users\\MUSTAFA\\IdeaProjects\\Batch151\\src\\main\\java\\day36\\MOzyurtFile");


        int a = 0;
        while (  (a=fileInputStream.read()) != -1 ){

            System.out.print((char)a);
        }


    }


}
