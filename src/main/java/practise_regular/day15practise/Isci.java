package practise_regular.day15practise;

public class Isci extends Muhasebe{


    protected  String isciStatu = "Surekli isci";


    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisir");
    }

    // Bu classdan da obje olusturabiliriz. Bu classin child classlarinin olmasi obje olusturmaya engel degildir
    // fakat isciler icin ; surekli isci ve ustabasi olmaktan baskja ihtimal olmdan isci clasindan isci uretmeye gerek yok
}
