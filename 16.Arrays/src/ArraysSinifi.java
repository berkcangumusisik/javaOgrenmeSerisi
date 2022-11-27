import java.util.Arrays;

public class ArraysSinifi {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(dizi));

        System.out.println("----------------------");

        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));

        System.out.println("----------------------");

        int[] liste3 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.sort(liste3);
        System.out.println(Arrays.toString(liste3));

        System.out.println("----------------------");

        int[] liste4 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        int aranan = 7;
        Arrays.sort(liste);
        int index = Arrays.binarySearch(liste4, aranan);
        System.out.println("Aranan: " + aranan + " Index: " + index);

        System.out.println("----------------------");

        int[] liste5 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        int[] liste6 = Arrays.copyOf(liste5, 5);
        System.out.println(Arrays.toString(liste6));

        System.out.println("----------------------");
        int[] liste7 = Arrays.copyOfRange(liste5, 3, 7);
        System.out.println(Arrays.toString(liste7));

        int[] liste8 = {1,2,3};
        int[] liste9 = {1,2,3};
        int[] liste10 = {1,2,3,4};
        System.out.println(Arrays.equals(liste8, liste9));
        System.out.println(Arrays.equals(liste8, liste10));
        
    }
}
/*
 * Arrays.toString() => Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
 * Arrays.fill() => Dizinin tüm elemanlarını istediğimiz değer ile doldurmak için kullanılan bir metottur.
 * Arrays.sort() => Dizinin elemanlarını küçükten büyüğe doğru sıralamak için kullanılan bir metottur.
 * Arrays.binarySearch() => Dizinin elemanlarını aramak için kullanılan bir metottur. Dizinin sıralı olması gerekir.
 * Arrays.copyOf() => Dizinin kopyasını oluşturmak için kullanılan bir metottur.
 * Arrays.copyOfRange() => Dizinin belirli bir bölümünün kopyasını oluşturmak için kullanılan bir metottur.
 * Arrays.equals() => İki dizinin birbirine eşit olup olmadığını kontrol etmek için kullanılan bir metottur.
 */
