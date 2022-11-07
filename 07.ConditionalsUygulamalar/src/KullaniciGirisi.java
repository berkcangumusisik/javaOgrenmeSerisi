import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış.");
        }
    }
}
