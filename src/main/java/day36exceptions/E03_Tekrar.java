package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03_Tekrar {


    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("day36exceptions/MOzyurtFile");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






    }


