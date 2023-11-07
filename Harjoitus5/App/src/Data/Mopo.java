package Data;

public class Mopo extends Kulkuneuvo {
    private String moottoriMerkki;
    private String tyyppi;
    private int nopeus;

    public String getMoottoriMerkki() {
        return moottoriMerkki;
    }
    public void setMoottoriMerkki(String moottoriMerkki) {
        this.moottoriMerkki = moottoriMerkki;
    }
    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public int getNopeus() {
        return nopeus;
    }
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
}
