import java.util.Scanner;

public class MaksMin {
    public static void main(String[] args) {
        // Dizideki Maksimum ve Minimum Değerleri Bulan Program
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maksimum Değer: " + max);
        System.out.println("Minimum Değer: " + min);

        /**
         * Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
         * Dizi : {15,12,788,1,-1,-778,2,0}
         * Girilen Sayı : 5
         * Girilen sayıdan küçük en yakın sayı : 2
         * Girilen sayıdan büyük en yakın sayı : 12
         */

        int[] numbers2 = { 15, 12, 788, 1, -1, -778, 2, 0 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int greatestSmaller = Integer.MIN_VALUE;
        int smallestGreater = Integer.MAX_VALUE;
        for(int i : numbers2){
            if(i < number){
                if(i > greatestSmaller){
                    greatestSmaller =i;
                }
            }else if(i > number){
                if(i < smallestGreater){
                    smallestGreater = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + greatestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + smallestGreater);
        
    }
}
