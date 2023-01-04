import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın, " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !");
        System.out.println("Lütfen bir karakter seçiniz .");
        System.out.println("#######################################################");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            if(player.getInventory().getWater().equals("Water") && player.getInventory().getFirewood().equals("Firewood") && player.getInventory().getFood().equals("Food") && player.getInventory().getSnake().equals("treasury")){
                System.out.println("TEBRIKLER");
                System.out.println("!!!!!!!!!!!!!!!!!!!########################");
                System.out.println("TUM BOLUMLERI GECEREK OYUNU BITIRDINIZ. BU SISLI VE KARANLIK DUNYADAN KURTULDUNUZ");
                break;
            }
            System.out.println();
            System.out.println("##########Bölgeler##########");
            System.out.println();
            System.out.println("1- Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur !");
            System.out.println("2- Eşya Dükkanı --> Silah veya Zırh satın alabilirsiniz !");
            System.out.println("3- Mağara --> Ödül <Yemek>, dikkatli ol karşına zombi çıkabilir !");
            System.out.println("4- Orman --> Ödül <Odun>, dikkatli ol karşına vampir çıkabilir !");
            System.out.println("5- Nehir --> Ödül <Su>, dikkatli ol karşına ayı çıkabilir !");
            System.out.println("0- Çıkış Yap --> Oyunu sonlandır.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            boolean isPassLocation = true;
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().getFood().equals("Food")) {
                        System.out.println("Siz zaten bu bolumu gecerek " + player.getInventory().getFood() + " isimli odulun sahibi oldunuz. Bir daha giremezsiniz!!!");
                        isPassLocation = false;
                        break;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().getFirewood().equals("Firewood")) {
                        System.out.println("Siz zaten bu bolumu gecerek " + player.getInventory().getFirewood() + " isimli odulun sahibi oldunuz. Bir daha giremezsiniz!!!");
                        isPassLocation = false;
                        break;
                    }
                    location = new Forest(player);
                    break;
                case 5:
                    if (player.getInventory().getWater().equals("Water")) {
                        System.out.println("Siz zaten bu bolumu gecerek " + player.getInventory().getWater() + " isimli odulun sahibi oldunuz. Bir daha giremezsiniz!!!");
                        isPassLocation = false;
                        break;
                    }
                    location = new River(player);
                    break;
                case 6:
                    if (player.getInventory().getSnake().equals("treasury")) {
                        System.out.println("Siz zaten bu bolumu gecerek isimli odulun sahibi oldunuz. Bir daha giremezsiniz!!!");
                        isPassLocation = false;
                        break;
                    }
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !");
                    break;
            }
            if (location == null && selectLoc == 0) {
                System.out.println("Oyun bitti yine bekleriz.");
                break;
            }
            if (isPassLocation) {
                if (!location.onLocation()) {
                    System.out.println("GAME OVER!");
                    break;
                }
            }
        }
    }
}