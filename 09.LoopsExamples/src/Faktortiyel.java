import java.util.Scanner;

public class Faktortiyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini Hesaplamak İstediğiniz Sayıyı Giriniz : ");
        int n = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + " ! = " + total);
    }
}
