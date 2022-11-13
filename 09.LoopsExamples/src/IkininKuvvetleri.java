import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}

/*
 * Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */