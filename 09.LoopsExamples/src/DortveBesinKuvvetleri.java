import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        n = input.nextInt();
        for (int i = 1, k = 1; i < n || k < n ; i *= 4) {
            System.out.println(i);

            if(k !=1){
                System.out.println(k);
            }

            k *=5;
        }
    }
}
/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */