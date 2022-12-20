public class Calisan {
    private String adSoyad;
    private String telefon;
    private String mail;
    
    

    public Calisan() {
    }

    public Calisan(String adSoyad, String telefon, String mail) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.mail = mail;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void giris(){
        System.out.println(this.adSoyad + " üniversiteye giriş yaptı");
    }
    public void cikis(){
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad + " yemekhaneye girdi.");
    }
}
