import java.util.Random;
public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public  BattleLoc (Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor !");
        System.out.println("<S>avaş veya <K>aç : ");
        String selectCase = scanner.nextLine().toUpperCase();
        while(!selectCase.equals("S") && !selectCase.equals("K")){
            System.out.println("Hatalı bir değer girdiniz, lütfen tekrar deneyiniz.");
            selectCase=scanner.nextLine().toUpperCase();
        }
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            return true;

        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz !");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber) {
        int finishMonster = 0;
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            int firstHit = firstHit();
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("<V>ur veya <K>aç");
                String selectCombat = scanner.nextLine().toUpperCase();
                while (!selectCombat.equals("V") && !selectCombat.equals("K")) {
                    System.out.println("Yanlis secenek girdiniz,bir daha giriniz");
                    selectCombat = scanner.nextLine().toUpperCase();
                }
                if (selectCombat.equals("V")) {
                    if (firstHit == 0) {            // Yüzde 50 ihtimal var. eğer 0 ise player,1 ise canavar vuracak.
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        System.out.println("Siz vurdunuz");
                        System.out.println("Vurdugunuz hasar: " + this.getPlayer().getTotalDamage());
                        System.out.println("Kalan Caniniz: " + this.getPlayer().getHealth());
                        System.out.println(this.getObstacle().getName() + " kalan cani: " + this.getObstacle().getHealth());
                        System.out.println();
                        if (this.getObstacle().getHealth() > 0) {
                            int durability = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - durability);
                            System.out.println("Canavar vurdu");
                            System.out.println("Canavarin vurdugu hasar: " + this.getObstacle().getDamage());
                            System.out.println("Kalan Caniniz: " + this.getPlayer().getHealth());
                            System.out.println(this.getObstacle().getName() + " kalan cani: " + this.getObstacle().getHealth());
                            System.out.println();
                        }
                    }
                    if (firstHit == 1) {        // Yüzde 50 ihtimal var. eğer 0 ise player,1 ise canavar vuracak.
                        if (this.getPlayer().getHealth() > 0) {
                            int durability = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - durability);
                            System.out.println("Canavar vurdu");
                            System.out.println("Canavarin vurdugu hasar: " + this.getObstacle().getDamage());
                            System.out.println("Kalan Caniniz: " + this.getPlayer().getHealth());
                            System.out.println(this.getObstacle().getName() + " kalan cani: " + this.getObstacle().getHealth());
                            System.out.println();
                        }
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        System.out.println("Siz vurdunuz");
                        System.out.println("Vurdugunuz hasar: " + this.getPlayer().getTotalDamage());
                        System.out.println("Kalan Caniniz: " + this.getPlayer().getHealth());
                        System.out.println(this.getObstacle().getName() + " kalan cani: " + this.getObstacle().getHealth());
                        System.out.println();
                    }
                } else {
                    System.out.println("Kacarak korkaklik yaptiniz");
                    break;
                }
                if (this.getPlayer().getHealth() <= 0) {
                    return false;
                }
                if (this.getObstacle().getHealth() <= 0) {
                    if (this.getName().equals("Maden")) {       // Lokasyon maden olursa ki if blogu ve methodu.
                        Random snake = new Random();
                        snakeAward();
                    } else {
                        this.getPlayer().setMoney(this.getObstacle().getAward() + this.getPlayer().getMoney());
                        System.out.println("Yeni bakiyeniz: " + this.getPlayer().getMoney());
                    }
                    finishMonster++;
                }
                if (finishMonster == (obsNumber) && this.getObstacle().getHealth() <= 0) {
                    System.out.println(finishMonster);
                    System.out.println("Tebrikler " + this.getName() + " isimli lokasyon da bulunan tum canavarlari oldurdunuz!");
                    locationAward();
                    return true;
                }
            }
        }
        return true;
    }

    public int firstHit() {
        Random r = new Random();
        return r.nextInt(2);
    }
    public int randomMonster() {
        Random r = new Random();
        return r.nextInt(this.maxObstacle) + 1;
    }


    public void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı: " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri ");
        System.out.println("-------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + "Değerleri");
        System.out.println("-------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());

    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    public void snakeAward() {
        Random a = new Random();
        int percentage = a.nextInt(100) ;
        int gun = a.nextInt(100);
        int shield = a.nextInt(100);
        int money = a.nextInt(100);
        if (percentage < 15) {          // Silah if bloğu
            if (gun < 50) {
                if (isWantWeapon("Tabanca")) {
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
                }
            }
            if (gun >= 50 && gun < 80) {
                if (isWantWeapon("Kilic")) {
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
                }
            }
            if (gun >= 80) {
                if (isWantWeapon("Tufek")) {
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
                }
            }
        } else if (percentage >= 15 && percentage < 30) {   // zirh else if blogu
            if (shield < 50) {
                if (isWantArmor("Hafif Armor")) {
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
                }
            }
            if (shield >= 50 && shield < 80) {
                if (isWantArmor("Orta Armor")) {
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(2));
                }
            }
            if (shield >= 80) {
                if (isWantArmor("Agir Armor")) {
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
                }
            }
        } else if (percentage >= 30 && percentage < 55) {       // Para else if blogu
            awardMoney(money);
        } else {
            System.out.println("Uzgunum yilan bos cikti.Hicbir sey kazanamadiniz!!!");
            System.out.println();
        }
    }
    public void awardMoney(int money) {
        if (money < 50) {
            this.getPlayer().setMoney(1 + this.getPlayer().getMoney());
            System.out.println("1 altin kazandiniz");
        } else if (money >= 50 && money < 80) {
            this.getPlayer().setMoney(5 + this.getPlayer().getMoney());
            System.out.println("5 altin kazandiniz");
        } else {
            this.getPlayer().setMoney(10 + this.getPlayer().getMoney());
            System.out.println("10 altin kazandiniz");
        }
    }
    public boolean isWantWeapon(String name) {
        System.out.println("Tebrikler " + name + " kazandiniz almak istermisiniz");
        System.out.println("Suanki elinizde olan: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("1\tEvet");
        System.out.println("2\tHayir");
        System.out.println();
        int isYes = scanner.nextInt();
        scanner.nextLine();
        while (isYes < 1 || isYes > 2) {
            System.out.println("Yanlis secim tekrar deneyin");
            isYes = scanner.nextInt();
            scanner.nextLine();
        }
        if (isYes == 2) {
            return false;
        }
        return true;
    }
    public boolean isWantArmor(String name) {
        System.out.println("Tebrikler " + name + " kazandiniz almak istermisiniz");
        System.out.println("Suanki elinizde olan: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("1\tEvet");
        System.out.println("2\tHayir");
        System.out.println();
        int isYes = scanner.nextInt();
        scanner.nextLine();       // Bunu diger alıcagımız deger String oldugu ıcın karışmaması adına yapıyoruz.
        while (isYes < 1 || isYes > 2) {
            System.out.println("Yanlis secim tekrar deneyin");
            isYes = scanner.nextInt();
            scanner.nextLine();       // Bunu diger alıcagımız deger String oldugu ıcın karışmaması adına yapıyoruz.
        }
        if (isYes == 2) {
            return false;
        }
        return true;
    }
    public void locationAward() {       // Bölüm sonu ödülü alıp almadığı ve hangi ödülü aldıgını belli ediyoruz.
        if (this.getName().equals("Magara")) {
            this.getPlayer().getInventory().setFood(this.award);
        }
        if (this.getName().equals("Orman")) {
            this.getPlayer().getInventory().setFirewood(this.award);
        }
        if (this.getName().equals("Nehir")) {
            this.getPlayer().getInventory().setWater(this.award);
        }
        if (this.getName().equals("Maden")) {
            this.getPlayer().getInventory().setSnake(this.award);
        }
    }

}