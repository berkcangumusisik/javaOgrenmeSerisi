import java.util.Scanner;

public class YildizElmasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
/*
 * Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */