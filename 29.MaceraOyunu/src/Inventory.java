public class Inventory {
    private Weapon weapon;
    private Armor armor;
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

    public Inventory() {
        this.weapon = new Weapon(0, "Yumruk", 0, 0);
        this.armor = new Armor(1, "Paçavra", 0, 0);
    }

}
