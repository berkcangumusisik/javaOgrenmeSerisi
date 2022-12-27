import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.print("Lütfen bir işlem seçiniz:");
        // String playerName = scanner.nextLine();
        Player player = new Player("Berkcan");
        System.out.println("Sayın " + player.getName() + " karakter seçimi yapınız.");
        player.selectChar();
        while (true) {
            player.printInfo();
            Location location = null;
            System.out.println("################Bölgeler###############");
            System.out.println("1 - Güvenli Ev => Burası sizin için güvenlidir. Düşman bulunmaz.");
            System.out.println("2 - Mağaza => Silah ve zırh satın alabilirsin.");
            System.out.print("Lütfen gitmek istediğinz alanı seçiniz : ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
