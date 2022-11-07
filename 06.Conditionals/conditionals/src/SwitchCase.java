public class SwitchCase {
    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            case 2:
                System.out.println("i = 2");
                break;

            default:
                System.out.println("i değeri 0, 1 veya 2 değildir.");
                break;
        }


        int ay = 2;
        String ayString;
        switch(ay){
            case 1:
                ayString = "Ocak";
                break;
            case 2:
                ayString = "Şubat";
                break;
            case 3:
                ayString = "Mart";
                break;
            case 4:
                ayString = "Nisan";
                break;
            case 5:
                ayString = "Mayıs";
                break;
            case 6:
                ayString = "Haziran";
                break;
            case 7:
                ayString = "Temmuz";
                break;
            case 8:
                ayString = "Ağustos";
                break;
            case 9:
                ayString = "Eylül";
                break;
            case 10:
                ayString = "Ekim";
                break;
            case 11:
                ayString = "Kasım";
                break;
            case 12:
                ayString = "Aralık";
                break;
            default:
                ayString = "Geçersiz ay";
                break;
        }
        System.out.println(ayString);

        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Mükemmel!");
                break;
            case 'B':
                System.out.println("Çok iyi!");
                break;
            case 'C':
                System.out.println("İyi!");
                break;
            case 'D':
                System.out.println("Orta!");
                break;
            case 'F':
                System.out.println("Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz not!");
                break;
        }

        int gun = 1;
        switch(gun){
            case 1: System.out.println("Pazartesi");
            case 2: System.out.println("Salı");
            case 3: System.out.println("Çarşamba");
            case 4: System.out.println("Perşembe");
            case 5: System.out.println("Cuma");
            case 6: System.out.println("Cumartesi");
            case 7: System.out.println("Pazar");
            default: System.out.println("Geçersiz gün");
        }
    }
}

/**
 * switch(değer) {
    case x:
        // değer x'e eşitse bu kod bloğu çalışacak
        break;
    case y:
        // değer y'ye eşitse bu kod bloğu çalışacak
        break;
    default:
        // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
}
 */