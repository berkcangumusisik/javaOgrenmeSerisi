import java.util.Scanner;

public class BasamakSayisiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = input.nextInt();
        int basValue, basSum = 0;

        while (number != 0) {
            basValue = number % 10;
            basSum += basValue;
            number /= 10;
        }
        System.out.println(number + " sayısının basamakları toplamı = " + basSum);
    }
}

/*
 * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
 * 
 * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */