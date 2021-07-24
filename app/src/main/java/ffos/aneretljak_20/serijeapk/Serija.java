package ffos.aneretljak_20.serijeapk;

public class Serija {

    private int sifra;
    private String naziv;
    private String ocjena;
    private String epizoda;
    private String zanr;
    private String sveAnotacije;

    public Serija(int sifra, String naziv, String ocjena, String epizoda, String zanr, String sveAnotacije) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.ocjena = ocjena;
        this.epizoda = epizoda;
        this.zanr = zanr;
        this.sveAnotacije = sveAnotacije;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOcjena() {
        return ocjena;
    }

    public void setOcjena(String ocjena) {
        this.ocjena = ocjena;
    }

    public String getEpizoda() {
        return epizoda;
    }

    public void setEpizoda(String epizoda) {
        this.epizoda = epizoda;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getSveAnotacije() {
        return sveAnotacije;
    }

    public void setSveAnotacije(String sveAnotacije) {
        this.sveAnotacije = sveAnotacije;
    }
}
