public class ForeachDongusu {
    public static void main(String[] args) {

        int[] dizi = { 10, 20, 30, 40, 50 };
        for (int i : dizi) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        String[] arabalar = { "BMW", "Mercedes", "Ford", "Ferrari" };
        for (String i : arabalar) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        int[][] matris = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
        System.out.println("--------------------");
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[] { 215, 234, 218, 189, 221, 290 };

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
/*
 * Foreach döngüsü, dizileri ve koleksiyonları tek tek dolaşmamızı sağlar.
 * for (veritipi degisken: diziAdi) {
 * kod bloğu
 * }
 */