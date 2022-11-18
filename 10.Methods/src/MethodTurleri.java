public class MethodTurleri {
    public static void main(String[] args) {
        int t = topla(5, 6);
        System.out.println(t);
        toplam(4, 3);
        show();
    }

    static int topla(int a, int b) {
        return a + b;
    }
    static void show()
    {
        System.out.println("Show metodu..");
        return;
    }

    static void toplam(int a, int b) {
        System.out.println(a + b);
    }
}
/**
 Return Metotları
 * Bir metotun sonunda return anahtar kelimesi kullanılırsa, metot çalıştıktan sonra çağırıldığı yere değer döndürür.
 * Dışarıda işlem yapmak istediğimizde return kullanırız.
 Void Metotları
 * Java'da yazılan bir metodun geriye bir değer döndürmesini istemiyor, sadece metot içindeki kod bloğunun çalışmasını istersek "void" deyimi kullanmalıdır. Metot tanımlanırken veri tipi kısmına "void" deyimi yazılması yeterlidir. Void metotlar içerisinde "return" deyimi kullanılamamaktadır.
 */