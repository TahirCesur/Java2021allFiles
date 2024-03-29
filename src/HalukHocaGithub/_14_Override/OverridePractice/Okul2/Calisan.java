package HalukHocaGithub._14_Override.OverridePractice.Okul2;

public class Calisan extends kisi {
    private double maas;

    public Calisan(String isim, String adres, Okul okul, UyeTipi uyeTipi, double maas) {
        super(isim, adres, okul, uyeTipi);
        setMaas(maas);
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMaas();
    }
}
