package day28interface;

public class Cat implements Mammal{
    @Override
    public void eat() {

    }

    @Override
    public void drink() {


    }

    public static void main(String[] args) {
        // interface larda variable cagirirken "interface" adini kullanarak cagirin.
        // Bu hem "static" variable olmanin geregiidir, hem de okunurlulugu artirir.
        System.out.println(Animal.age);  // 4

        System.out.println(Mammal.age);
        System.out.println(feedBaby);


//        System.out.println(Mammal.feedBaby); // Milk
    }



}
