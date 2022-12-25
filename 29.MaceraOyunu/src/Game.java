import java.util.Scanner;

public class Game {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.print("Lütfen bir işlem seçiniz:");
        String playerName = scanner.nextLine();
        Player player = new Player("Berkcan");
        System.out.println("Sayın " + player.getName() + " karakter seçimi yapınız.");
        player.selectChar();

    }
}

