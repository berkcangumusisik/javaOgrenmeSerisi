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
                buyWeapon();
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
        System.out.println("---------Silahlar-----------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getName() + "<Para : " + w.getPrice()+" Hasar : " + w.getDamage()+">");
        }

    }

    public void buyWeapon(){
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        while(selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Geçersiz değer. Tekrar giriniz : ");
            selectWeaponID = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID) ;
        if(selectedWeapon!= null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yeterli Paranız Bulunmamaktadır");
            }else{
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                System.out.println("Önceki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Şimdiki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
    public void printArmor(){
        System.out.println("Zırhlar");
    }
}
