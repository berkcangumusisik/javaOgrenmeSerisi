public class ToolStore extends NormalLoc {

    public ToolStore(Player p) {
        super(p, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------Mağazaya hoşgeldiniz-----------");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış");
        System.out.print("Seçim yapınız: ");
        int selectCase = Location.scanner.nextInt();
        while (selectCase < 1 || selectCase > 3) {
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
                buyArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz");
                break;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------Silahlar-----------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getName() + "<Para : " + w.getPrice() + " Hasar : " + w.getDamage() + ">");
        }

    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer. Tekrar giriniz : ");
            selectWeaponID = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Yeterli Paranız Bulunmamaktadır");
            } else {
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

    public void printArmor() {
        System.out.println("---------Zırhlar---------");
        for (Armor a : Armor.armors()) {
            System.out.println(
                    a.getId() + " - " + a.getName() + "<Para : " + a.getPrice() + " Zırh : " + a.getBlock() + ">");
        }
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = scanner.nextInt();
        while (selectArmorID < 1 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer. Tekrar giriniz : ");
            selectArmorID = scanner.nextInt();
            Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli Paranız Bulunmamaktadır");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhının satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Şimdiki zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
