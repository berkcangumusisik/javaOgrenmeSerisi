public class HarmonikOrtalama {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        double harmonikOrtalama = numbers.length / sum;
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}

/*
 * Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */