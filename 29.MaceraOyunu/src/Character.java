import java.util.Scanner;

public class Character {
    private int id;
    private int damage;
   

 private int health;
    private int money;
    private String charName;
    Scanner scanner = new Scanner(System.in);

    public Character(int id,int damage, int health, int money, String charName){
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.charName = charName;
    }
    public int getDamage() {
        return damage;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
