public class Main {
    public static void main(String[] args) {
        int sayi = 10;
        String mesaj = "Öğrenci Sayısı: ";
        System.out.println(mesaj + sayi);
        System.out.println(mesaj + sayi);
        boolean isTrue = true;
        System.out.println(isTrue);
        byte b = 127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        long l = 2147483648L;
        System.out.println(l);
        float f = 3.14F;
        System.out.println(f);
        double d = 3.14;
        System.out.println(d);
        char c = 'A';
        System.out.println(c);
        int charDeger = (int)'A';
        System.out.println(charDeger);
        String str = "Java";
        System.out.println(str);
    }
}
/**
 Değişkenler
 * Geçici bilgileri sakladığımız ve programcı tarafından belirlenen yapılarıdır.
 * <veri tipi> <değişken adı> = <değer>; şeklinde tanımlanır.
 Değişken Tanımlama Kuralları
 * Değişken adı rakam ile başlayamaz.
 * Değişken adı boşluk içeremez.
 * Değişken adı özel karakter içeremez.
 * Değişken adı Java'da tanımlı anahtar kelimeleri içeremez.
 * Değişken adı büyük küçük harf duyarlıdır.
 * Türkçe karakter kullanılmaz.
 * _ ve $ işaretleri kullanılabilir.

 İLKEL VERİ TİPLERİ
 boolean : true veya false değerlerini alır.
 Tam Sayı Veri Türleri
 - byte : 8 bitlik yer kaplar. -128 ile 127 arasında değer alır.
 - short : 16 bitlik yer kaplar. -32768 ile 32767 arasında değer alır.
 - int : 32 bitlik yer kaplar. -2147483648 ile 2147483647 arasında değer alır. En çok kullanılan veri tipidir. Sebebi ise optimize edilmiş olmasıdır.
 - long : 64 bitlik yer kaplar. -9223372036854775808 ile 9223372036854775807 arasında değer alır. int veri tipinden daha büyük değerler alabilir.
 Ondalıklı Sayı Veri Türleri
 - float :
 * 32 bitlik yer kaplar. 1.4e-45 ile 3.4028235e+38 arasında değer alır.
 * Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
 * Double a göre daha az yer kaplar ve daha hızlı bir veri tipidir.
 - double :
 * 64 bitlik yer kaplar. 4.9e-324 ile 1.7976931348623157e+308 arasında değer alır.
 * Yüksek derecede hassasiyeti vardır.
 * Üst düzey matematiksel işlemlerde kullanılır.
 char : 16 bitlik yer kaplar. 0 ile 65535 arasında değer alır. Tek bir karakteri saklar. Unicode karakter setini kullanır.
 String : String bir dizi karakterdir. String ifadeleri “” içerisinde tanımlanır.
 */