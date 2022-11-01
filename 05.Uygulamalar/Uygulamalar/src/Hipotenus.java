import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.print("Lütfen üçgenin birinci kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();

        System.out.print("Lütfen üçgenin ikinci kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();

        System.out.print("Lütfen üçgenin üçüncü kenar uzunluğunu giriniz: ");
        c = scanner.nextInt();

        double u = (a+b+c) / 2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin çevresi: " + cevre );
        System.out.println("Üçgenin alanı: " + alan);
    }
}
/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */