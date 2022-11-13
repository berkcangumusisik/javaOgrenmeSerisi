import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz : ");
            n = input.nextInt();
            if(n % 2 == 1){
                toplam += n;
            }
        } while (n > 0);

        System.out.println("Toplam = " + toplam);
    }
}

/**
 * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
 */