public class CokBoyutluDiziler {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kırıkkale";
        sehirler[2][0] = "Antalya";
        sehirler[2][1] = "Adana";
        sehirler[2][2] = "Mersin";

        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++) {
                System.out.println(sehirler[i][j]);
            }
            System.out.println("---------------");
        }

        int[][] uzaklik ={
            {0, 453, 939, 243, 783, 891},
            {453, 0, 490, 384, 620, 439},
            {939, 490, 0, 839, 863, 423},
            {243, 384, 839, 0, 544, 823},
            {783, 620, 863, 544, 0, 1045},
            {891, 439, 423, 823, 1045, 0}
        };
        for (int i = 0; i < uzaklik.length; i++) {
            for (int j = 0; j < uzaklik[i].length; j++) {
                System.out.print(uzaklik[i][j] + " ");
            }
            System.out.println();
        }
    }

}
/*
 * Çok boyutlu diziler birden fazla boyutu olan dizilerdir.
 * Satır ve sütun sayısı belirtilir.
 * Tek boyutlu dizilerdeki gibi indisler 0'dan başlar.
 * Tanımlama şekli;
 * veri_türü[][] dizi_ismi = new veri_türü[satır_sayısı][sütun_sayısı];
 */