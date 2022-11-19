public class RecursiveFunctions {
    public static void main(String[] args) {
        int sonuc = sum(5);
        System.out.println(sonuc);
    }
    public static int sum(int x){
        
        if(x > 0){
            return x + sum(x-1);
        }else{
            return 0;
        }
    }

    public static int sum2(int ...x){
        int toplam = 0;
        for (int i : x) {
            toplam += i;
        }
        return toplam;
    }
}
/*
 Recursive (Özyineli) Metotlar
 * Java'da Recursive Metotlar, bir metodun kendisini çağırma tekniğidir. 
 * Karışık problemleri basit problemlere ayırarak çözmek için kullanılır.
 * ... ile değişken sayıda parametre alabilir.
 */