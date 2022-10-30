public class MantiksalOperatorler {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 5;
        boolean kosul1 = a == b;
        boolean kosul2 = a >= c;
        System.out.println("kosul1 && kosul2: " + (kosul1 && kosul2));
        System.out.println("kosul1 || kosul2: " + (kosul1 || kosul2));
        System.out.println("!(kosul1 && kosul2): " + !(kosul1 && kosul2));

    }
}

/**
 * Mantıksal Operatörler
 * ve : && => eğer her iki koşul da doğruysa true, değilse false
 * veya : || => eğer herhangi bir koşul doğruysa true, değilse false
 * değil : ! => eğer koşul doğruysa false, değilse true
 */