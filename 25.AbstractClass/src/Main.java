public class Main {
    public static void main(String[] args) throws Exception {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomanGameCalculator();

    }
}


/*
Soyut Sınıf(Abstract Class) Özellikleri:

"abstract" anahtar kelimesi ile tanımlanmış olması gerekiyor.
Soyut veya soyut olmayan fonksiyonlar tanımlanabilir.
Soyut sınıflardan "new" anahtar kelimesi ile nesne oluşturulamaz.
Kurucu metodu ve static fonksiyonlar tanımlanabilir.
"final" kelimesi ile tanımlanmış fonksiyonları içerebilir. Bu final fonksiyonlar alt sınıflarda ezilemezler (override).
 */