public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;
    
    
    public Akademisyen(String bolum, String unvan) {
        this.bolum = bolum;
        this.unvan = unvan;
    }
    public Akademisyen(String adSoyad, String telefon, String mail, String bolum, String unvan) {
        super(adSoyad, telefon, mail);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String getUnvan() {
        return unvan;
    }
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriş yaptı");
    }
}
