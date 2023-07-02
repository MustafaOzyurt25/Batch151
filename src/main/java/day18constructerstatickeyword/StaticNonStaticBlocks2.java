package day18constructerstatickeyword;

public class StaticNonStaticBlocks2 {

    // non- static blok constructor'larda calistirilmasi gereken ortak kodlari icerir
    // birden fazla non-static blok varsa ustteki blk once calistirilir
    // non-static blok icine yazilan kodlar her Constructor icin calistirilir
    public StaticNonStaticBlocks2(){

        System.out.println("Constructor 1");
    }

    public StaticNonStaticBlocks2(int price){
        System.out.println("Constructor 2");
    }
    public StaticNonStaticBlocks2(String name){
        System.out.println("Constructor 3");
    }
    public StaticNonStaticBlocks2(Boolean isOld){
        System.out.println("Constructor 4");
    }

    {
        System.out.println("I am constructor - ilk");
    }
    {
        System.out.println("I am constructor - ikinci");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks2 obj1 = new StaticNonStaticBlocks2();
        StaticNonStaticBlocks2 obj2 = new StaticNonStaticBlocks2(12);
        StaticNonStaticBlocks2 obj3 = new StaticNonStaticBlocks2("Shirt");
        StaticNonStaticBlocks2 obj4 = new StaticNonStaticBlocks2(false);




    }




}
