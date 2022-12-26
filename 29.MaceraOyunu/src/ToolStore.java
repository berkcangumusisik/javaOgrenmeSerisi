public class ToolStore extends NormalLoc {

    public ToolStore(Player p) {
        super(p, "Mağaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("------------Mağazaya hoşgeldiniz-----------");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 * Çıkış");
        System.out.print("Seçim yapınız: ");
        int selectCase = Location.scanner.nextInt();
        while(selectCase < 1 || selectCase > 3){
            System.out.println("Geçersiz değer tekrar deneyiniz.");
            selectCase = Location.scanner.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz");
                return true;
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("Silahlar");
    }
    public void printArmor(){
        System.out.println("Zırhlar");
    }
}
