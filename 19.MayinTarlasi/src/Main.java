import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sütun Sayısı Giriniz : ");
        int sutun = scanner.nextInt();

        System.out.print("Satır Sayısı Giriniz : ");
        int satir = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(sutun, satir);
        mineSweeper.run();
    }
}
