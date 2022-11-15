import java.util.Scanner;

public class ATMUygulamasi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String userName, password;
            int balance = 5000, price, wrongPass = 3, select;
    
            while (wrongPass > 0) {
                System.out.print("Kullanıcı Adınız: ");
                userName = scan.nextLine();
                System.out.print("Şifreniz: ");
                password = scan.nextLine();
    
                if (userName.equals("berkcan") && password.equals("1234")) {
                    System.out.println("Sisteme Başarıyla Giriş Yapıldı.\nKarakartal Bankasına Hoşgeldiniz.");
                    do {
                        System.out.println("----------------------------------------");
                        System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                        select = scan.nextInt();
                        System.out.println("----------------------------------------");
    
                        switch (select) {
                            case (1) -> {
                                System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Giriniz: ");
                                price = scan.nextInt();
                                balance += price;
                            }
                            case (2) -> {
                                System.out.print("Lütfen Çekmek İstediğiniz Tutarı Giriniz: ");
                                price = scan.nextInt();
                                if (price > balance) {
                                    System.out.println("Yetersiz Bakiye...");
                                } else {
                                    balance -= price;
                                }
                            }
                            case (3) -> {
                                System.out.print("Bakiyeniz: " + balance);
                                System.out.println();
                            }
                        }
                    } while (select != 4);
                    System.out.println("Sistemden Başarıyla Çıkış Yapıldı,\nTekrar Görüşmek Dileğiyle.");
                    System.out.println("----------------------------------------");
                    break;
    
                } else {
                    wrongPass--;
                    System.out.println("Hatalı Kullanıcı Adı yada Şifre, Lütfen Tekrar Deneyiniz.");
                    if (wrongPass == 0) {
                        System.out.println("Hesabınız Bloke Olmuştur, Lütfen Banka İle İletişime Geçiniz.");
                    }
                    System.out.println("Kalan Hakkınız: " + wrongPass);
                }
            }
        }
    }