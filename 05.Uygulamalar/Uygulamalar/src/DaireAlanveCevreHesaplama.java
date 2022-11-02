import java.util.Scanner;

public class DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Çemberin yarıçapını giriniz : ");
        int r = scanner.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
    }
}


/**
 * Dairenin Alanını ve Çevresini Hesaplayan Program
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
 *
 * Alan Formülü : π * r * r;
 *
 * Çevre Formülü : 2 * π * r;
 *
 * Ödev
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 *
 * 𝜋 sayısını = 3.14 alınız.
 *
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */