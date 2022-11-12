public class BreakveContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }
    }
}
/*
 * Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.
 * Java'da "break" deyimi , döngü içinde bir koşul oluştuğunda döngüyü tamamen sonlandırmaya yarar.
 */
