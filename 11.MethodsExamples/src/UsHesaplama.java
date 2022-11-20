import java.util.Scanner;

public class UsHesaplama {
    
    public static void main(String[] args) {
        int choice ;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Taban Sayı : ");
            int base = scanner.nextInt();
            System.out.print("Üs Sayı : ");
            int exponent = scanner.nextInt();
            System.out.println("Sonuç : " + power(base, exponent));
            System.out.println("Devam Etmek İster Misiniz ? (1- Evet / 2- Hayır)");
            choice = scanner.nextInt();
        }while(choice == 1);
        

    }

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}

/*
 * Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */