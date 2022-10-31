import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);

        Scanner inp = new Scanner(System.in);

        String adSoyad = inp.nextLine();

        int yas = inp.nextInt();
        double maas = inp.nextDouble();

        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);
    }
}

/**
 Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz.
 Scanner sınıfı java.util paketinde bulunuyor.
 Veri alırken input olarak kullanacağımız nesneyi oluşturuyoruz.
 input. ile gelen metotlarla kullanıcıdan veri alabiliriz.
 input.nextBoolean() ile kullanıcıdan boolean tipinde veri alabiliriz.
 input.nextInt() ile kullanıcıdan int tipinde veri alabiliriz.
 input.nextDouble() ile kullanıcıdan double tipinde veri alabiliriz.
 input.nextLine() ile kullanıcıdan String tipinde veri alabiliriz.
 input.nextByte() ile kullanıcıdan byte tipinde veri alabiliriz.
 input.nextShort() ile kullanıcıdan short tipinde veri alabiliriz
 input.nextLong() ile kullanıcıdan long tipinde veri alabiliriz.
 input.nextFloat() ile kullanıcıdan float tipinde veri alabiliriz.

 */