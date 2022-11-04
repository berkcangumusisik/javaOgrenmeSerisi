public class IfElse {
    public static void main(String[] args) {
        int sayi = 9;
        if (sayi < 10) {
            System.out.println("Sayı 10'dan küçüktür.");
        } else if (sayi == 10) {
            System.out.println("Sayı 10'a eşittir.");
        } else {
            System.out.println("Sayı 10'dan büyüktür.");
        }

        int sayi1 = 10;
        int sayi2 = 20;
        if (sayi1 > sayi2) {
            System.out.println("Sayı 1 Sayı 2'den büyüktür.");
        } else if (sayi1 < sayi2) {
            System.out.println("Sayı 1 Sayı 2'den küçüktür.");
        } else {
            System.out.println("Sayı 1 Sayı 2'ye eşittir.");
        }

        int ay = 2;
        if (ay == 12 || ay == 1 || ay == 2) {
            System.out.println("Kış mevsimi.");
        } else if (ay == 3 || ay == 4 || ay == 5) {
            System.out.println("İlkbahar mevsimi.");
        } else if (ay == 6 || ay == 7 || ay == 8) {
            System.out.println("Yaz mevsimi.");
        } else if (ay == 9 || ay == 10 || ay == 11) {
            System.out.println("Sonbahar mevsimi.");
        } else {
            System.out.println("Geçersiz ay.");
        }

        int yil = 2022;
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("Artık yıldır.");
                } else {
                    System.out.println("Artık yıl değildir.");
                }
            } else {
                System.out.println("Artık yıldır.");
            }
        } else {
            System.out.println("Artık yıl değildir.");
        }

        String kullaniciAdi = "admin";
        int sifre = 12345;
        if (kullaniciAdi.equals("admin") && sifre == 12345) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Giriş başarısız.");
        }

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int enBuyuk = number1;

        if (number2 > enBuyuk) {
            enBuyuk = number2;
        }
        if (number3 > enBuyuk) {
            enBuyuk = number3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);
    }
}
/*
 * if(koşul){
 * koşul sağlandığında çalışacak kodlar
 * }else if(koşul1){
 * koşul1 sağlandığında çalışacak kodlar
 * }else{
 * koşullar sağlanmadığında çalışacak kodlar
 * }
 * if olmadan else if ve else kullanılamaz
 * else ve else if olmadan if kullanılabilir
 * 
 */