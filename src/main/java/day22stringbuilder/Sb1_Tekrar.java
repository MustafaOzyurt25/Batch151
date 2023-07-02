package day22stringbuilder;

public class Sb1_Tekrar {
    public static void main(String[] args) {
        StringBuilder m = new StringBuilder("Mustafa Ozyurt");
        String a ="Ayse yazici";

        System.out.println(m.capacity());  //30

        m.append("/Erz");
        System.out.println(m);  // Mustafa Ozyurt/Erz      degisti!!!!!!!!!!!!!


        a.replace("yazici","Ozyurt");  // Ayse yazici  !!!!!!! degismedi
        System.out.println(a);
        a =a.replace("yazici","Ozyurt");
        System.out.println(a);  // Ayse Ozyurt


        System.out.println(m.capacity());  // 30
        System.out.println(m.length());  //18




    }
}
