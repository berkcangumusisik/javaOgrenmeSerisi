public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String ePosta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, ePosta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getAdSoyad() + " giriş yaptı.");
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " sınav yaptı.");
    }
}