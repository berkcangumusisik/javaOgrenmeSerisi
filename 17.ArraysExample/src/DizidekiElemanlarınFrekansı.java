import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DizidekiElemanlarınFrekansı {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> list = new ArrayList<>();
        int count = 0;
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları:");

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(!list.contains(array[i])) {
                list.add(array[i]);
                System.out.println(array[i] + " sayısı " + count + " kez tekrar edildi.");
            }
            count = 0;
        }
    }
}

/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
