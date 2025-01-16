import java.util.Scanner;

public class Login {
    private String kullanıcıAd;
    private String parola;

    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan giriş bilgileri isteniyor
        System.out.print("Kullanıcı Adınız: ");
        kullanıcıAd = scanner.nextLine();

        System.out.print("Parolanız: ");
        parola = scanner.nextLine();

        // Kullanıcı adı ve parola doğrulanıyor
        if (hesap.getKullanıcıAdı().equals(kullanıcıAd) && hesap.getSifre().equals(parola)) {
            return true; // Giriş başarılı
        } else {
            System.out.println("Hatalı kullanıcı adı veya parola!"); // Hata mesajı
            return false;
        }
    }
}
