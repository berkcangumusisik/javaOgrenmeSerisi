import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.println("2. Sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Toplama işlemi sonucu: " + (number1 + number2));
        } else if (select == 2) {
            System.out.println("Çıkarma işlemi sonucu: " + (number1 - number2));
        } else if (select == 3) {
            System.out.println("Çarpma işlemi sonucu: " + (number1 * number2));
        } else if (select == 4) {
            if(number2 == 0){
                System.out.println("Bir sayı 0'a bölünemez.");
            }else{
            System.out.println("Bölme işlemi sonucu: " + (number1 / number2));
            }
        } else {
            System.out.println("Yanlış işlem seçtiniz. Lütfen tekrar deneyiniz.");
        }

    }

}
