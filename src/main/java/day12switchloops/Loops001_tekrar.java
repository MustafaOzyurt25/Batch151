package day12switchloops;

public class Loops001_tekrar {

    public static void main(String[] args) {
// 1) 11 den 14 e kadar tumsayilari ekrana yaz. ("for" da i degisken ismi gelenekseldir.)
//2) 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
//3) 18 den 56 ya kadar tum tek sayilari ekrana yazdiriniz
///////////////////////////////    1)   /////////////////////////////////////////////////

for (int i= 11 ;i<15;i++){
    System.out.print(i);

}
        //////////////////////////////////     2)          /////////////////////////////////////////
        System.out.println();

        for (int i =40;i>22;i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
//////////////////////////////////     3)          /////////////////////////////////////////
        System.out.println();
for (int i =18;i<57; i++){
    if (i%2!=0){
        System.out.print(i+" ");
    }
}






















    }
}
