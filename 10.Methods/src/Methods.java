public class Methods {
    public static void main(String[] args) {
        mesajVer();
        System.out.println(power(2,4)); 
    }

    public static void mesajVer() {
        System.out.println("Merhaba");
    }

    static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}


/*
 Metotlar(Fonksiyonlar)
 * Sadece çağırıldıkları yerde çalışırlar.
 * Programlamada metot kullanmamızın sebebi, bir çok yerde kullanacağımız kodu tek seferde yazıp lazım olduğunda çağırmaktır.
 * DRY - Don't Repeat Yourself (Kendini Tekrarlama)
 * veriTipi metotAdi(parametre1, parametre2, ....) {
        kod bloğu
   }

 */