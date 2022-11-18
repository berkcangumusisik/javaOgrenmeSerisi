public class MethodOverloading {
    public static void main(String[] args) {
        ekranaYaz(0);
        ekranaYaz(5,10);
        System.out.println(topla(5,10,15));
        System.out.println(topla(5,10));
    }
    static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    static int topla(int a, int b) {
        return a + b;
    }

    static int topla(int a, int b, int c) {
        return a + b + c;
    }


}
/*
 * Method Overloading : Aynı isimde farklı parametrelerle birden fazla metot tanımlamak.
 * 
 */