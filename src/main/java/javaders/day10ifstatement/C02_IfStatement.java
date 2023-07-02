package javaders.day10ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen gun icin sayi giriniz");
        int sayi = input.nextInt();

        if (sayi==1){
            System.out.println("pazar");
        }

        else if (sayi==2){
            System.out.println("pazartesi");
        }
        else if (sayi==3){
            System.out.println("sali");
        }
        else if (sayi==4){
            System.out.println("carsamba");

        }
        else if (sayi==5){
            System.out.println("persembe");
        } else if (sayi==6) {
            System.out.println("cuma");
            }

        else if(sayi==7) {
            System.out.println("c.tesi");
        }
        else {
            System.out.println("lutfen gecerli bir numara giriniz..");
        }
























    }
}
