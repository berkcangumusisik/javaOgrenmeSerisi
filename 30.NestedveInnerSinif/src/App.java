public class App {
    public static void main(String[] args) throws Exception {
        Out out = new Out();
        Out.In in = out.new In();
        out.run();
    }
}


/*
 * Nested ve Inner Sınıflar
 Nested Sınıflar
 * Nested sınıflar, sınıfın içinde başka bir sınıf tanımlanmasıdır.
 * Eğer bir sınıf başka bir sınıf olmadan kullanılmazsa, o sınıfı nested sınıf olarak tanımlarız.
 */