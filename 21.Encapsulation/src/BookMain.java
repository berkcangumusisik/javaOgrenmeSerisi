public class BookMain {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord Of the Rings",-199);
        System.out.println(lordOfTheRings.showNumber());
        lordOfTheRings.changePageNumber(-100);
        System.out.println(lordOfTheRings.showNumber());
        System.out.println(lordOfTheRings.showName());
    }
}

/*
 * Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir.
 *  Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir
 * Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. 
 * Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz. 
 * Getter => verileri okur.
 * Setter => verileri değiştirir.
 */