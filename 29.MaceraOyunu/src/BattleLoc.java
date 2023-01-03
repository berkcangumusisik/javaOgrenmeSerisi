import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }
    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacle();
        System.out.println(" Şu an " + getName() + " 'da bulunuyorsunuz.");
        System.out.println(" Burada " + 
         obsNumber + " tane " + obstacle.getName() + " ile karşılaştınız.");
         System.out.println("<S>avaş veya <K>aç");
         String selectCase = scanner.nextLine();
         selectCase = selectCase.toUpperCase();
         if(selectCase.equals("S")){
            System.out.println("Savaşa başlıyorsunuz.");
            // Savaşma işlemi
         }

        return false;
    }
    public int randomObstacle() {
        Random random = new Random();
        return random.nextInt(3) + 1;
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
    
}