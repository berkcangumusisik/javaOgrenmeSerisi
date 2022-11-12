import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int year = 2020;
        do {
            System.out.println("Döngü işletiliyor..");
            year++;
        } while (year < 2020);

        System.out.println("--------------------");

        int i = 1;
        int j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");
                j++;
            } while (j < 4);
            i++;
        }
        System.out.println();
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.println("Şifrenizi giriniz:");
            pass = scanner.nextInt();
            if (pass == 12345) {
                askPassword = false;
                System.out.println("Şifre doğru!");
                askPassword = false;
            } else {
                System.out.println("Şifre yanlış!");
            }
        } while (askPassword);
    }

}
/**
 * Do While Döngüsü
 * Do While döngüsü, While döngüsüne benzer. Ancak While döngüsünde koşul
 * kontrolü döngünün başında yapılırken, Do While döngüsünde koşul kontrolü
 * döngünün sonunda yapılır.
 * Do While döngüsü, koşul sağlanmadığı halde döngü en az bir kez çalışır.
 * do{
 * // Kodlar
 * }while(kosul);
 * 
 */