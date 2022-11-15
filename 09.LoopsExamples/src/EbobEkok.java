import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        int n1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz : ");
        int n2 = scanner.nextInt();
        int ebob,ekok = 0;
        if (n1 < n2) {
            ebob = n1;
        } else {
            ebob = n2;
        }
        while (n1 % ebob != 0 || n2 % ebob != 0) {
            ebob--;
        }

        int n1Katlari = n1;
        int n2Katlari = n2;
        
        while (n1Katlari != n2Katlari) {
            if (n1Katlari < n2Katlari) {
                n1Katlari += n1;
            } else {
                n2Katlari += n2;
            }
        }
        ekok = n1Katlari;

        System.out.println("Ebob :" + ebob);
        System.out.println("Ekok :" + ekok);
    }
}

/*
 * Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.

ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.

18’in bölenleri : 1, 2, 3, 6, 9, 18

24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.

EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.

ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.

6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …

8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.

EKOK = (n1*n2) / EBOB

Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */