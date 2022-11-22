public class Classes {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        Car audi = new Car();
        audi.model = "Audi A3";
        audi.type = "Sport";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.printSpeed();


        Car mercedes = new Car();
        mercedes.speed = 30;
        mercedes.increaseSpeed(10);
        mercedes.printSpeed();

    }
}
/*
 *  Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin: gerçek hayatta araba bir nesnedir. Otomobilin ağırlık ve renk gibi değişkenleri ve sürüş ve fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodlara soyut bir kavrama dönüştürmektir.
 * Java'da her şey bir classtır.
 * SözDizimi
 class ClassName {
     variables;
     methods;
 }
 * Bir class'ı çağırmak için new anahtar kelimesini kullanırız. ClassName object = new ClassName();  

 * Sınıfın adı, sınıfın ilk harfi büyük olmalıdır.
 * Class'lar referans tiplidir. 
 */