import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();
        if (heat <= 5) { System.out.println( "Kayak yababilirsin"); }
        else if ( heat>5 && heat<=15) {System.out.println("Sinamaya gidebilirsin"); }
        else if ( heat>=15 && heat<25) { System.out.println( "Piknik yapabilirsin.");}
        else if ( heat>=25) { System.out.println( "Yüzmeye gidebilirsin");}
    }
}
/**
 Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */