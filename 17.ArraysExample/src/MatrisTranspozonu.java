import java.util.Scanner;

public class MatrisTranspozonu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpozMatris = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((i + 1) + ". satırın " + (j + 1) + ". elemanını giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }
        System.out.println("Girilen matrisin transpozu : \n");
        for (int[] val : transpozMatris) {
            for (int k : val) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.





Senaryo
Matris : 
2    3    4    
5    6    4    
Transpoze : 
2    5    
3    6    
4    4    


Matris : 
1    2    3    
4    5    6    
Transpoze : 
1    4    
2    5    
3    6    
 */