package day19passbyvaluemethodoverloading;

public class PassByValue2 {

    public static void main(String[] args) {

        String name = "Tom Hanks";
        String updateName =updateName(name,"ali");
        System.out.println(name);
        System.out.println(updateName);
        System.out.println(name);

    }


    public  static  String updateName (String name,String add){

        name =name+" "+add;
        return name;
    }




}
