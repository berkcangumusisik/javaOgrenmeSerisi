import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    Scanner scanner = new Scanner(System.in);
    private Inventory inventory;
    
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    public void selectChar() {

        Character[] characters = { new Samurai(), new Archer(), new Knight() };
        System.out.println("----------------------------------------------");

        for (Character character : characters) {
            System.out.println("ID:" + character.getId() +
                    "\t\tKarakter Adı:" + character.getCharName() +
                    "\t\tHasar:" + character.getDamage() +
                    "\t\tCan:" + character.getHealth() +
                    "\t\tPara:" + character.getMoney());
            
        }
            System.out.println("------------------------------------------");
            System.out.print("Lütfen bir karakter seçiniz:");
            int selectChar = scanner.nextInt();

            switch (selectChar) {
                case 1:
                    initPlayer(new Samurai());
                    break;
                case 2:
                    initPlayer(new Archer());
                    break;
                case 3:
                    initPlayer(new Knight());
                    break;
                default:
                    initPlayer(new Samurai());
            }
            /* 
            System.out.println(
                    "Seçtiğiniz karakter:" + this.getCharName() +
                    "\t\tHasar:" + this.getDamage() +
                    "\t\tCan:" + this.getHealth() +
                    "\t\tPara:" + this.getMoney());
            */
        }

    

    public void initPlayer(Character character) {
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getCharName());
    }

    public void printInfo(){
        System.out.println(
            "Silahınız : " + this.getInventory().getWeapon().getName() + 
            " Hasarınız : " + this.getDamage() +
            " Sağlık : " + this.getHealth() +
            " Para : " + this.getMoney()
        );
    }
    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
