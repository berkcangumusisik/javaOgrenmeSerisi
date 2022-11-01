import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat değeri girin : ");
        double fiyat = input.nextDouble();
        double oran = fiyat < 1000 ? 0.18 : 0.08;
        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV'li Fiyat : " + (fiyat + oran * fiyat));
        System.out.println("KDV oranı : " + oran);
    }
}
/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */