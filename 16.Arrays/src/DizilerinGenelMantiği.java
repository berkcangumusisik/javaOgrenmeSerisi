public class DizilerinGenelMantiği {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        dizi[0] = 10;
        dizi[1] = 20;
        dizi[2] = 30;
        dizi[3] = 40;
        dizi[4] = 50;

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

        System.out.println("--------------------");

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = dizi[i] * 2;
            System.out.println(dizi[i]);
        }

        System.out.println("--------------------");

        int[] dizi2 = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println(dizi2[i]);
        }

        System.out.println("--------------------");
        printArray(dizi2);

        System.out.println();
        int cars[], count = 3;
        cars = new int[count];
        for (int i = 0; i < cars.length; i++)
            cars[i] = (i + 1) * 2;
        for (int j = 0; j < cars.length; j++)
            System.out.print(cars[j] + ",");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
/*
 * Dizi, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza birimidir.
 * İndisler 0'dan başlar.
 * Dizi oluşturduktan sonra dizinin içerisindeki elemanlara indeks numarasıyla
 * ulaşır ve değiştiririz.
 * 
 * Dizi oluşturmak için;
 * veri_türü[] dizi_ismi = new veri_türü[eleman_sayısı];
 * 
 * 
 */