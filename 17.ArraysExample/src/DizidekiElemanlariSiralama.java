import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Dizi: " + Arrays.toString(list));
    }
}

/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221 
 */