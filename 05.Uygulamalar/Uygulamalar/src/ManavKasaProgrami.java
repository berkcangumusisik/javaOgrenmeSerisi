import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut Kaç Kilogram : ");
        double armut = scanner.nextDouble();
        System.out.println("Elma Kaç Kilogram : ");
        double elma = scanner.nextDouble();
        System.out.println("Domates Kaç Kilogram : ");
        double domates = scanner.nextDouble();
        System.out.println("Muz Kaç Kilogram : ");
        double muz = scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilogram : ");
        double patlıcan = scanner.nextDouble();

        double armutFiyati = 2.14 * armut;
        double elmaFiyati = 3.67 * elma;
        double domatesFiyati = 1.11 * domates;
        double muzFiyati = 0.95 * muz;
        double patlicanFiyati = 5.00 * patlıcan;

        double toplam = armutFiyati + elmaFiyati + domatesFiyati + muzFiyati + patlicanFiyati;
        System.out.print("Toplam tutar : " +toplam  + " TL");
    }
}
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */