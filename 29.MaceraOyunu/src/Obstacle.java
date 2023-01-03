public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name;
    public Obstacle(int id, int damage, int health, String name) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}