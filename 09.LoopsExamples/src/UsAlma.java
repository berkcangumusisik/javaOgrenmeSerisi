import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int n, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        n = scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        k = scanner.nextInt();
        int total = 1;
        
        for (int i = 1; i <= k; i++) {
            total *= n;

        }
        System.out.println("Sonuç = " + total);
    }
}
/*
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */