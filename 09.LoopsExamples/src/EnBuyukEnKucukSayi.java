import java.util.Scanner;

public class EnBuyukEnKucukSayi{
    public static void main(String[] args) {
        int sayiAdedi;
        int minValue = Integer.MAX_VALUE ;
        int maxValue = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Adedinizi Giriniz : ");
        sayiAdedi = scanner.nextInt();
        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println(i + " . sayıyı giriniz : ");
            int number = scanner.nextInt();
            if(number > maxValue){
                  maxValue = number;
            }else if(number < minValue){
                 minValue = number;
            }
        } 
        System.out.println("En büyük sayı : " + maxValue);
        System.out.println("En küçük sayı : " + minValue);
    }
}
/*
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22

 */