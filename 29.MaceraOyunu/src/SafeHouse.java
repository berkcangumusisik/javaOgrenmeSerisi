public class SafeHouse extends NormalLoc {

    public SafeHouse(Player p) {
        super(p, "Güvenli Ev");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz. Canınız yenilendi.");
        return true;
    }
}
