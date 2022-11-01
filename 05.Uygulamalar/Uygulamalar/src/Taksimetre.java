import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yol uzunluğunu km cinsinden giriniz : ");
        int km = scanner.nextInt();

        double perKm = 2.20;
        double tutar = 10 + (km * perKm);

        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Toplam tutar: " + tutar);
    }
}

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */