public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, String telefon, String ePosta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, ePosta, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " laboratuvara giriş yaptı.");
    }
}