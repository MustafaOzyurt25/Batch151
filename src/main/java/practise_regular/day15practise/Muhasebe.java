package practise_regular.day15practise;

public class Muhasebe extends Personel {

    protected int saatUcreti;
    protected String statu;
    protected int maas;


    protected  int maasHesaplama(){
        int maas =saatUcreti*8*30;
        return maas;
    }

}
