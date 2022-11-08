import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik , kimya, turkce, muzik;
        int ortalama;
        int toplamDersSayisi = 0;
        int toplamNot = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        if(!(matematik <= 0 || matematik > 100)) {
            toplamNot += matematik;
            toplamDersSayisi++;
        }
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            toplamNot += fizik;
            toplamDersSayisi++;
        }

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            toplamNot += kimya;
            toplamDersSayisi++;
        }

        System.out.println("Türkçe  Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            toplamNot += turkce;
            toplamDersSayisi++;
        }
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            toplamNot += muzik;
            toplamDersSayisi++;
        }

        ortalama = toplamNot / toplamDersSayisi;

        if(ortalama <= 55) {
            System.out.println("Geçme durumu: Kaldınız, seneye görüşürüz!");
        } else {
            System.out.println("Geçme durumu: Geçtiniz, tebrik ederiz!");
        }

        System.out.println("Ortalamanız: " + ortalama);
    }
}
/**
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */