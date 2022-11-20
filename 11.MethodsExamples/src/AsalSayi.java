import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayı : ");
            int number = scanner.nextInt();
            isPrime(number, 2);
            System.out.println("Devam Etmek İster Misiniz ? (1- Evet / 2- Hayır)");
            choice = scanner.nextInt();
        } while (choice != 2);
    }

    static boolean isPrime(int number, int m) {
        if(m == number ){
            System.out.println(number + " sayısı asaldır.");
            return true;
        }else if(number % m == 0){
            System.out.println(number + " sayısı asal değildir.");
            return false;
        }
        return isPrime(number, m + 1);
    }
}
/* 
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !


Sayı Giriniz : 2
2 sayısı ASALDIR !


Sayı Giriniz : 39
39 sayısı ASAL değildir !


Sayı Giriniz : 17
17 sayısı ASALDIR !
 */