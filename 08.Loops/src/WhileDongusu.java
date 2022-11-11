import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("--------------------");

        int j = 1;
        while (j <= 5) {
            System.out.print(j + " , ");
            j++;
        }

        int m = 1;
        int n;
        while (m <= 5) {
            System.out.println(m);
            m++;
            n = 1;
            while (n <= 10) {
                System.out.print(n + ",");
                n++;
            }
            System.out.println();
        }
        System.out.println("--------------------");

        int left = 100, right = 200;
        while (++left < --right)
            ;
        System.out.println("100 ile 200'ün ortası: " + left);

        System.out.println("--------------------");

        int number = 1;
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println(number + " çifttir.");
            }
            number++;
        }
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
            
        }
        System.out.println("--------------------");
        
    }
}
/**
 * While döngüsü, koşul sağlandığı sürece çalışır.
 * while (koşul) {
 * // Koşul sağlandığı sürece çalışacak kodlar
 * }
 * Java programla dilinde while döngüleri yapacağımız işin ne zaman biteceğiniz
 * bilmediğimiz durumlarda kullanışlı olabilmektedir.
 */
