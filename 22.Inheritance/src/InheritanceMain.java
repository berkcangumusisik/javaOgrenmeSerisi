public class InheritanceMain {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Berkcan", "05350000000", "info@mail.com");

        Akademisyen a1 = new Akademisyen("Ahmet Ahmet", "05351111111", "info2@mail.com", "CENG", "Doçent");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Öğretmen", "05352222222", "info3@mail.com", "CENG", "Doçent", "15");

        Memur m1 = new Memur("Mehmet", "05353333333", "info4@mail.com", "CENG", "09.00-18.00");

        m1.calis();
        o1.senatoToplanti();
        a1.derseGir();
        c1.yemekhane();
    }
}
/*
 Inheritance(Kalıtım)
 *  Bir sınıfın başka bir sınıftan kalıtım yapması demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir
 *  Kalıtımı yapan sınıfa alt sınıf(sub class), kendisinden kalıtım yapılan sınıfa ata sınıf(base class) dersek, ata sınıfta tanımlı olan herşeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.
 * public class A extends B {
     // 
    }
 *  
 */