public class TekBoyutluDiziler {
    public static void main(String[] args) {
        String[] days = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("--------------------");
        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Mehmet";
        ogrenciler[2] = "Ayşe";
        ogrenciler[3] = "Fatma";
        ogrenciler[4] = "Ali";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------");

        
    }
}
/*
 * Tek boyutlu dizilerde elemanlar en başta tanımlanacaksa {} içerisine yazılır.
 * .length dizinin eleman sayısını verir.
 */