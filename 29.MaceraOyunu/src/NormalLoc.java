public class NormalLoc extends Location {
    public NormalLoc(Player p , String name){
        super(p, name);
    }
    @Override
    public boolean onLocation() {
        return true;
    }
    
}
