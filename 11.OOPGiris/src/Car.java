public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;
        // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    void increaseSpeed(int increment) {
        if((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    int decreaseSpeed(int decrement) {
        if(speed > 0) {
            speed -= decrement;
        }
        return speed;
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }

 
}

/*
 Constructor (Kurucu) Metotlar
 * Kurucu metotlar sınıf tasarlanırken yazılırlar. Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz. 
 * Eğer sınıf içinde hiç kurucu metot tanımlamazsınız parametresiz boş bir kurucu metot Java tarafından otomatik olarak tanımlanır.   
 *  Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.
 *  Kurucu metotlar ilgili sınıftan bir nesne üretmeye çalıştığınızda daha nesne üretme aşamasında çalıştırılan özel metotlardır (fonksiyonlardır). 
 * this anahtar kelimesi sınıfa ait niteliklere erişmeyi sağlar.
 *  */