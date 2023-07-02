package practise_regular.day08practise;

public class C04 {
    public static void main(String[] args) {

/*


    10 sorumuz var
    ogrencilerin cevapları:

    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'Exception_soru10', 'E', 'E', 'A', 'Exception_soru10'},
    {'Exception_soru10', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'Exception_soru10'},
    {'E', 'Exception_soru10', 'Exception_soru10', 'A', 'C', 'B', 'E', 'E', 'A', 'Exception_soru10'},
    {'C', 'B', 'A', 'E', 'Exception_soru10', 'C', 'E', 'E', 'A', 'Exception_soru10'},
    {'A', 'B', 'Exception_soru10', 'C', 'C', 'Exception_soru10', 'E', 'E', 'A', 'Exception_soru10'},
    {'B', 'B', 'E', 'C', 'C', 'Exception_soru10', 'E', 'E', 'A', 'Exception_soru10'},
    {'B', 'B', 'A', 'C', 'C', 'Exception_soru10', 'E', 'E', 'A', 'Exception_soru10'},
    {'E', 'B', 'E', 'C', 'C', 'Exception_soru10', 'E', 'E', 'A', 'Exception_soru10'}};



    cevap anahtarı:

    char[] keys = {'Exception_soru10', 'B', 'Exception_soru10', 'C', 'C', 'Exception_soru10', 'A', 'E', 'A', 'Exception_soru10'};

    Her ogrencinin dogru cevap sayısını method olusturarak yazdıranız

    output:
    1nolu ogrencinin dogru cevap sayısı: 7
    2nolu ogrencinin dogru cevap sayısı: 6
    3nolu ogrencinin dogru cevap sayısı: 5
    4nolu ogrencinin dogru cevap sayısı: 4
    5nolu ogrencinin dogru cevap sayısı: 8
    6nolu ogrencinin dogru cevap sayısı: 7
    7nolu ogrencinin dogru cevap sayısı: 7
    8nolu ogrencinin dogru cevap sayısı: 7

*/


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};




        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


        dogruCevapSayisi(answers,keys);




    }

    public static void dogruCevapSayisi(char[][] answers, char[] keys) {

        for (int i = 0; i < answers.length; i++) { // 0 dan ogrenci sayisina kadar donguye  aldik

            int sayac=0;

            for (int j = 0; j < answers[i].length; j++) { // 0 dan ogrencinin cevap sayisina kadar donguye alalim


                if (answers[i][j]==keys[j]){ // ogrencinin cevabi cevap anahtarindakiyla esitmi kontrol edelim

                   sayac++;// ogrencinin cevabi cevap anahtarindakiyla esitmi esitse sayaci bir artiralim
                }

            }
            System.out.println(i+1 + " nolu ogrencinin dogru cevap sayisi: " + sayac);
        }


    }
}
