import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        
        do {
            System.out.println(menu);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }

    static void plus(){
        Scanner scanner = new Scanner(System.in);
        int number,result = 0,i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.print("Sonuç : " + result);
    }

    static void minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Adedini Giriniz : ");
        int counter = scanner.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı :");
            number = scanner.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.print("Sonuç : " + result);
    }
    
    static void times(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı :");
            number = scanner.nextInt();
            if (number == 1) {
                break;
            }
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.print("Sonuç : " + result);
    }

    static void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Adedini Giriniz : ");
        int counter = scanner.nextInt();
        double number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı :");
            number = scanner.nextDouble();
            if(i != 1 && number == 0){
                System.out.println("Sıfıra Bölünemez !");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.print("Sonuç : " + result);
    }

    static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Sayıyı Giriniz : ");
        int base = scanner.nextInt();
        System.out.print("Üs Sayıyı Giriniz : ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.print("Sonuç : " + result);
    }

    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.print("Sonuç : " + result);
    }

    static void modAlma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int number = scanner.nextInt();
        System.out.print("Mod Sayısını Giriniz : ");
        int mod = scanner.nextInt();
        int result = number % mod;
        System.out.print("Sonuç : " + result);
    }

    static void rectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz : ");
        int shortSide = scanner.nextInt();
        System.out.print("Uzun Kenarı Giriniz : ");
        int longSide = scanner.nextInt();
        int area = shortSide * longSide;
        int perimeter = 2 * (shortSide + longSide);
        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + perimeter);
    }
}
/*
 * Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı

 */