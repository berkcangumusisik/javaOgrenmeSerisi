import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notu: ");
        int mat = scanner.nextInt();
        System.out.println("Fizik Notu : ");
        int fizik = scanner.nextInt();
        System.out.println("Kimya Notu : ");
        int kimya = scanner.nextInt();
        System.out.println("Türkçe Notu : ");
        int turkce = scanner.nextInt();
        System.out.println("Tarih Notu : ");
        int tarih = scanner.nextInt();
        System.out.println("Müzik Notu : ");
        int muzik = scanner.nextInt();
        int ortalama = (mat+fizik+kimya+tarih+turkce+muzik)/6;

        System.out.println("Ortalama: " + ortalama);
        System.out.println(ortalama >= 60 ? "Geçti" : "Kaldı");


    }
}

/**
 Not Ortalaması Hesaplayan Program
 Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 Ödev
 Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 Not : If ve Else kullanılmayacak...
 */