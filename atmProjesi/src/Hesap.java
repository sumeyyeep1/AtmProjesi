public class Hesap {
    private String kullanıcıAdı;
    private String sifre;
    private int bakiye;

    public Hesap(String kullanıcıAdı, String sifre, int bakiye) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public void paraYatır(int tutar) {
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);

    }

    public void paraCek(int tutar) {
        if (tutar > bakiye) {
            System.out.println("Lütfen daha düşük bir miktar giriniz!");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
}
