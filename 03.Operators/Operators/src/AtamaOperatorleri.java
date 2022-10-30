public class AtamaOperatorleri {
    public static void main(String[] args) {
        int a = 7;
        int b = 1;
        b += a; // b = b + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b -= a; // b = b - a;
        System.out.println("b = " + b);
        b *= a; // b = b * a;
        System.out.println("b = " + b);
        b /= a; // b = b / a;
        System.out.println("b = " + b);
        b %= a; // b = b % a;
        System.out.println("b = " + b);

    }
}

/**
 * Atama Operatörleri
 * Atama operatörleri, bir değişkene değer atamak için kullanılır.
 * = basit atama operatörüdür. Operaratörün sağ tarafındaki değeri, operatörün sol tarafındakilere atar.
 * += toplama atama operatörüdür. Operatörün sol tarafındaki değere, operatörün sağ tarafındaki değeri ekler.
 * -= çıkarma atama operatörüdür. Operatörün sol tarafındaki değerden, operatörün sağ tarafındaki değeri çıkarır.
 * *= çarpma atama operatörüdür. Operatörün sol tarafındaki değeri, operatörün sağ tarafındaki değerle çarpar.
 * /= bölme atama operatörüdür. Operatörün sol tarafındaki değeri, operatörün sağ tarafındaki değere böler.
 * %= mod alma atama operatörüdür. Operatörün sol tarafındaki değerin, operatörün sağ tarafındaki değere bölümünden kalanı alır.
 *
 */