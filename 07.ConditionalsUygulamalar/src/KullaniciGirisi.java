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
            int select;

            System.out.println("Şifrenizi sıfırlamak ister misiniz?\nSıfırlamak için\n1-Evet 2-Hayır seçiniz");
            select = input.nextByte();
            switch (select) {
                case 1:
                    String newPasword;
                    Scanner src = new Scanner(System.in);
                    System.out.print("Yeni sifre giriniz:");
                    newPasword = src.nextLine();
                    if(newPasword.equals(password)){
                        System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                    }else{
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;
            
                case 2:
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}

/**
 * Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */