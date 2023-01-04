public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String water;
    private String food;
    private String firewood;
    private String snake;

    public Armor getArmor() {
        return armor;

    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFirewood() {
        return firewood;
    }

    public void setFirewood(String firewood) {
        this.firewood = firewood;
    }

    public String getSnake() {
        return snake;
    }

    public void setSnake(String snake) {
        this.snake = snake;
    }
    public Inventory() {
        this.weapon = new Weapon(0, "Yumruk", 0, 0);
        this.armor = new Armor(1, "Paçavra", 0, 0);
        this.water="";
        this.food="";
        this.firewood="";
        this.snake="";
    }

}
