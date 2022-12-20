public class Guvenlik extends Memur{
    private String belge;

    public Guvenlik(String adSoyad, String telefon, String mail, String departman, String mesai, String belge) {
        super(adSoyad, telefon, mail, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getAdSoyad() + " nöbet tutuyor.");
    }
}
