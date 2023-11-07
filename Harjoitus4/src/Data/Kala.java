package Data;

import java.util.*;

public class Kala {

    private int id;
    private String laji;
    private int pituus;
    private float paino;

    public Kala(int id, String laji, int pituus, float paino) {
        this.id = id;
        this.laji = laji;
        this.pituus = pituus;
        this.paino = paino;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLaji() {
        return laji;
    }
    public void setLaji(String laji) {
        this.laji = laji;
    }
    public int getPituus() {
        return pituus;
    }
    public void setPituus(int pituus) {
        this.pituus = pituus;
    }
    public float getPaino() {
        return paino;
    }
    public void setPaino(double paino) {
        this.paino = (float) paino;
    }
}
