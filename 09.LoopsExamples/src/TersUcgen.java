import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        
        int i,sayi,j,k,l;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        sayi = input.nextInt();

        for(i=sayi;i>=1;i--){
            for(j=sayi-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=(2*i-1);k>=1;k--){
                System.out.print("*");
        }
            System.out.println(" ");

        }


    }
}
/*
 * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */